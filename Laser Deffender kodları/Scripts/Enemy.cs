//using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Enemy : MonoBehaviour
{
    [Header("Enemy Stats")]
    [SerializeField] float health = 100;
    [SerializeField] int scoreValue = 150;

    [Header("Shooting")]
    [SerializeField] float shotCounter;
    [SerializeField] float minTimeBetweenShots = 0.2f;
    [SerializeField] float maxTimeBetweenShots = 3f;
    [SerializeField] GameObject enemyLaserPrefab;
    [SerializeField] float enemyProjectileSpeed = 10f;

    [Header("Sound and Visual Effects")]
    [SerializeField] GameObject deathVFX; // efekti almak icin bir field actik
    [SerializeField] float durationOfExplosion = 1f;

    [SerializeField] AudioClip enemyKilledSFX;
    [SerializeField] AudioClip enemyFireSFX;
    [SerializeField] [Range(0,1)] float volume = 0.5f;



    void Start()
    {
        shotCounter = Random.Range(minTimeBetweenShots, maxTimeBetweenShots);
        //enemyKilledSFX = GetComponent<AudioSource>();
        //enemyFireSFX = GetComponent<AudioSource>();
    }

    // Update is called once per frame
    void Update()
    {
        CountDownAndShoot();
    }

    private void CountDownAndShoot()
    {
        shotCounter -= Time.deltaTime;
        if(shotCounter <= 0f)
        {
            Fire();
            shotCounter = Random.Range(minTimeBetweenShots, maxTimeBetweenShots);
        }
    }

    private void Fire()
    {
        StartCoroutine(FireCoroutine());
    }


    IEnumerator FireCoroutine()
    {
        
        
        GameObject enemyLaser = Instantiate(enemyLaserPrefab, transform.position, Quaternion.identity) as GameObject;
        enemyLaser.GetComponent<Rigidbody2D>().velocity = new Vector2(0, -enemyProjectileSpeed);

        AudioSource.PlayClipAtPoint(enemyFireSFX, Camera.main.transform.position, volume);  // burada sesi aldik ve camera uzerinde duyulabilmesi icin calistirdik ve son parametreyi de volume u ayarlamak icin yazdik
        yield return new WaitForSeconds(shotCounter);
        
    }


    private void OnTriggerEnter2D(Collider2D other)  // laser degdiginde triggerlanmasi icin yazdik
    {
        DamageDealer damageDealer = other.gameObject.GetComponent<DamageDealer>(); // burada dusmanin componentini aldik
        if (!damageDealer)
        {
            return;
        }
        ProcessHit(damageDealer);
    }

    private void ProcessHit(DamageDealer damageDealer)
    {
        health -= damageDealer.GetDamage(); // burada da hiti cikarip kontrol yaptik
        damageDealer.Hit();
        if (health <= 0)
        {
            Die();
        }
    }

    private void Die()
    {
        FindObjectOfType<GameSession>().AddTooScore(scoreValue); // scrtipte ulastik ve daha sonrasinda eklenmesi icin ulastigimiz scriptin metodunu cagirdik ve ne kadar yukseltmek istedigimizi yazdirdik
        Destroy(gameObject);

        GameObject explosion = Instantiate(deathVFX, transform.position, transform.rotation); // burada onceden olustudugumuz materyalin icerisine bir efekt yaptık daha sonra ilk parametreyi o efekt olarak verdik ve calismasini sagladik.
        Destroy(explosion, durationOfExplosion);// efekti 1 saniye sonra yok ettik
        AudioSource.PlayClipAtPoint(enemyKilledSFX,Camera.main.transform.position, volume); // burada sesi aldik ve camera uzerinde duyulabilmesi icin calistirdik ve son parametreyi de volume u ayarlamak icin yazdik

    }
}
