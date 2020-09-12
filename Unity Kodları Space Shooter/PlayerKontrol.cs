using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerKontrol : MonoBehaviour
{
    Rigidbody fizik;
    float horizontal = 0;
    float vertical = 0;
    Vector3 vec;
    public float karakterHiz;
    public float minX;  // uzay aracini x kordinat duzlemi uzerinde minimum nereye kadar gidebileceğini belirlmek icin yaptik
    public float maxX;  // uzay aracini x kordinat duzlemi uzerinde maximum nereye kadar gidebileceğini belirlmek icin yaptik
    public float minZ;  // uzay aracini z kordinat duzlemi uzerinde minimum nereye kadar gidebileceğini belirlmek icin yaptik
    public float maxZ;  // uzay aracini z kordinat duzlemi uzerinde maximum nereye kadar gidebileceğini belirlmek icin yaptik
    public float egim;
    float atesZamani = 0.0f;
    public float atesGecenSure;
    public GameObject kursun;
    public Transform KursunNeredeNerdenCiksin;
    AudioSource audio1;
    void Start()
    {
        fizik = GetComponent<Rigidbody> ();
        audio1 = GetComponent<AudioSource>();
    }

    void Update()
    {
        if (Input.GetButton("Fire1")&& Time.time>atesZamani)
        {
            atesZamani = Time.time + atesGecenSure;
            //Debug.Log("Ates Edildi");
            Instantiate(kursun, KursunNeredeNerdenCiksin.position, Quaternion.identity);
            audio1.Play();
        }
    }

    void FixedUpdate()
    {
        horizontal = Input.GetAxis("Horizontal");
        vertical = Input.GetAxis("Vertical");
        vec = new Vector3(horizontal, 0, vertical);
        fizik.velocity = vec*karakterHiz;

        fizik.position = new Vector3 // bu kod sayesinde gorunmez duvarlar koymus olduk yani unitden kod uzerinden yazdıgımız kordinasyonlarin disina cıkma sansi kalmiyor
        (
            Mathf.Clamp(fizik.position.x,minX,maxX),
            0.0f,
            Mathf.Clamp(fizik.position.z,minZ,maxZ)   
        );
        fizik.rotation = Quaternion.Euler(0,0,fizik.velocity.x*(-egim)); // uzay aracinin kanatlarini dondurmek icin x eksenine deger verdik


    }
}
