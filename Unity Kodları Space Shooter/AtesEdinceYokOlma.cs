using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AtesEdinceYokOlma : MonoBehaviour
{
    int a = 10 ;
    public GameObject patlama;
    public GameObject playerPatlama;
    GameObject OyunKontrol; // bir adet Game Objesi Olusturduk 
    OyunKontrol kontrol; // ve burada Oyun Konroldeki Score Arttir Fonksiyonuna ulasabilmek icin boyle bir kod yazdik
    void Start()
    {
        OyunKontrol = GameObject.FindGameObjectWithTag("OyunKontrol");// oyun kontrol objemize bir tag verip buradan ulastik
        kontrol = OyunKontrol.GetComponent<OyunKontrol>(); //ve bunun sayesinde de ScoreArttir fonksiyonuna Ulasmis olduk
        
    }
    void OnTriggerEnter(Collider col) // dokunuldugunda yok olmasi icin bunu yapiyoruz ve unityden on triggerin secili olmasi lazim
    {
        if (col.tag!="sinir")
        {
            Destroy(col.gameObject);
            Destroy(gameObject);
            Instantiate(patlama, transform.position, transform.rotation);
            kontrol.ScoreArttir(a); // burada da oyun kontrol kodundaki ScoreArttir fonksiyonuna ulasmis olduk 
        }
        if (col.tag == "Player")
        {
            Instantiate(playerPatlama, col.transform.position, col.transform.rotation);
            kontrol.oyunBitti(); // eger tas player'a carparsa oyunun bittigini gosteren oyun kontrolde olan fonksiyonu kontrol ile cagirdik ve oyunu bitirdik
        }
    }

}
