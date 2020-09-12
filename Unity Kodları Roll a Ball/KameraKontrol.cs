using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class KameraKontrol : MonoBehaviour
{
    public GameObject top; // game objesi acip kameranin icine kameranin takip etmesini istedigimiz nesneyi atabilmek icin bunu actik
    Vector3 aradakiMesafe; // kamera ile top arasindaki mesafeyi kulamk icin bunu olsuturduk transfor metodu Vector3 metodu ile birlikte calisiyor
    void Start()
    {
        //*transform.position*/ // kameranin pozisyonuna ulasmis olduk

        //top.transform.position // bu sekilde de topun pozisyonuna ulasiyoruz
        aradakiMesafe = transform.position - top.transform.position; // aradaki mesafeyi bulduk

    }

    
    void LateUpdate()
    {
    
        transform.position = top.transform.position + aradakiMesafe; // kamera her zaman takip edebilmesi icin kameranın pozisyonunu topun pozisyonu + aralarindaki mesafeyle topadik









    }
}
