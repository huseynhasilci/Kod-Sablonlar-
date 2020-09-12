using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class TopKontrol : MonoBehaviour
{
    Rigidbody fizik;
    public int hiz;
    int sayac = 0;
    public int toplanilacakOBjeSayisi;
    public Text sayacText;
    public Text oyunBittiText;
    void Start()
    {
        fizik = GetComponent<Rigidbody>();
    }


    void FixedUpdate()
    {
        float yatay = Input.GetAxisRaw("Horizontal");
        float dikey = Input.GetAxisRaw("Vertical");

        Vector3 vec = new Vector3(yatay, 0, dikey);
        fizik.AddForce(vec*hiz);
    }
    void OnTriggerEnter(Collider other) // temas oldugunda 1 kere soyluyor bize
    {
        if (other.gameObject.tag == "engel") // etiket koydugumuz adi engel olan seylere dokundugu anda onlari yok edecek
        {
            //Destroy(other.gameObject); // trigger tik olan her şeyi dokundugu her seyi yok edyior
            other.gameObject.SetActive(false);
            sayac++;
            sayacText.text = "Sayac = " + sayac;


            if (sayac == toplanilacakOBjeSayisi) 
            {
                oyunBittiText.text = "Oyun Bitti";
            }
        }
        
            
    }
    //private void OnTriggerStay(Collider other) // temas oldugu sure boyunca konsola her zaman yazdiricak
    //{

    //}
    //private void OnTriggerExit(Collider other) // temas olduktan sonra temasin icinden cikinca tamas oldu diye yazdiriyor
    //{
        
    //}
}
