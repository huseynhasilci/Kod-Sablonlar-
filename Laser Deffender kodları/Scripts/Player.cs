using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    // Config params

    [Header("Player")]
    [SerializeField] float moveSpeed = 10;
    [SerializeField] float padding = 1f;
    [SerializeField] int health = 200;

    [Header("Projectile")]
    [SerializeField] GameObject laserPrefab; // oyuncuya laser i verdik
    [SerializeField] float projectileSpeed = 10f; // laser in  gidis hizini ayarladik
    [SerializeField] float projecttileFiringPeriod = 0.1f;

    [SerializeField] AudioClip playerDeathSound;
    [SerializeField] AudioClip playerFireSound;
    [SerializeField] [Range(0, 1)] float playerSoundVolume = 0.2f;

    Coroutine firingCoroutine;


    float xMin;
    float xMax;
    float yMin;
    float yMax;
    void Start()
    {
        SetUpMoveBoundaries();
        //StartCoroutine(PrintAndWait());

    }

    

    // Update is called once per frame
    void Update()
    {
        Move();
        Fire();
    }


    /*IEnumerator PrintAndWait()
    {
        Debug.Log("First message sent,boss");
        yield return new WaitForSeconds(3); // olme animasyonu gibi uzun suren bir animasyon olursa eger IEnumator adinda bir method tanimladik daha sonra yield return ile bir kac saniye bekleyip diger yapmak istedigimiz seyi yaptik
        Debug.Log("The second messagge,yo");
    }*/


    private void OnTriggerEnter2D(Collider2D other)
    {
        DamageDealer damageDealer = other.gameObject.GetComponent<DamageDealer>();
        if (!damageDealer) // burasi sayesinde damage verecek bir sey kalmadiginda bitirecek ve bizi null deger donmemesini sagliyor
        {
            return;
        }
        ProcessHit(damageDealer);
    }

    private void ProcessHit(DamageDealer damageDealer)
    {
        health -= damageDealer.GetDamage();
        damageDealer.Hit(); // burasi sayesinde ateslenmis laser yok edilmis oldu
        if (health <= 0)
        {
            Die();
        }
    }


    public int GetHealth()
    {
        return health;
    }


    private void Die()
    {
        FindObjectOfType<Level>().LoadGameOver();
        Destroy(gameObject);
        AudioSource.PlayClipAtPoint(playerDeathSound, Camera.main.transform.position, playerSoundVolume);  // burada sesi aldik ve camera uzerinde duyulabilmesi icin calistirdik ve son parametreyi de volume u ayarlamak icin yazdik
    }

    private void Fire()
    {
        if (Input.GetButtonDown("Fire1")) // mouse  sol tika basildiginda ne yapacaginin kosulunu yazdik
        {
            firingCoroutine = StartCoroutine(FireContinuously());
        }
        if (Input.GetButtonUp("Fire1"))
        {
            StopCoroutine(firingCoroutine);
        }
        
    }

    IEnumerator FireContinuously() // mouse a basili tuttugumuzda ates etme kodu
    {
        while (true)
        {
            GameObject laser = Instantiate(laserPrefab, transform.position, Quaternion.identity) as GameObject; //Instantiate ettik ve sol tika bastigimizda ekranda cikmasini sagladik
            laser.GetComponent<Rigidbody2D>().velocity = new Vector2(0, projectileSpeed);// daha sonra burada componente ulasip bir hiz verdik y ekseninde hareket etmesini sagladik
            AudioSource.PlayClipAtPoint(playerFireSound, Camera.main.transform.position, playerSoundVolume); // burada sesi aldik ve camera uzerinde duyulabilmesi icin calistirdik ve son parametreyi de volume u ayarlamak icin yazdik
            yield return new WaitForSeconds(projecttileFiringPeriod);
        }

    }

    private void Move()
    {
        var deltaX = Input.GetAxis("Horizontal") * Time.deltaTime * moveSpeed; // horizantal olarak aldik xAxisini Time.deltaTime bunun sayesinde her frame icin normal bir hızda calismasini sagladik
        var deltaY = Input.GetAxis("Vertical") * Time.deltaTime * moveSpeed; // vertical olarak aldik ve hizini ayarladik

        var newXPos = Mathf.Clamp(transform.position.x + deltaX,xMin,xMax); // delta degisikligi aldi ve yukarida tanimladiklarimiz sayesinde nereye kada gidip gidemeyecegini ayarladik
        var newYPos = Mathf.Clamp(transform.position.y + deltaY,yMin,yMax); // yeni y posizyonunu ayarladik

        transform.position = new Vector2(newXPos, newYPos);// burada da nereye hareket ettirecegimizi ayarladik
    }

    private void SetUpMoveBoundaries()
    {
        Camera gameCamera = Camera.main;

        xMin = gameCamera.ViewportToWorldPoint(new Vector3(0, 0, 0)).x + padding; // bunlar sayesinde bizim objemiz kameranin gordugu yere kadar gidebilecek
        xMax = gameCamera.ViewportToWorldPoint(new Vector3(1, 0, 0)).x - padding; // sinirlerin yanina tasmasini engelledik paddinmg ekleyerek 

        yMin = gameCamera.ViewportToWorldPoint(new Vector3(0, 0, 0)).y + padding;
        yMax = gameCamera.ViewportToWorldPoint(new Vector3(0, 1, 0)).y - padding;
    }


}
