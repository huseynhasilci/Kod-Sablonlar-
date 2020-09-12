using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement; // bunun modul sayesinde sahnenin yediden aslamasini sagliyoruz
public class OyunKontrol : MonoBehaviour 
{
    public GameObject Asteroid;
    public Vector3 randomPos;
    public float baslangicBekleme; // unity uzeerinden ne kadar beklememiz gerektigini ayarlayabilmek icin public bir deger olusturduk
    public float olusturmaBekleme;  // unity uzeerinden ne kadar beklememiz gerektigini ayarlayabilmek icin public bir deger olusturduk
    public float donguBekleme;  // unity uzeerinden ne kadar beklememiz gerektigini ayarlayabilmek icin public bir deger olusturduk
    int score;
    public Text text; // burada score' gostermek icin bunu yazdik
    bool oyunBittiKontrol = false;
    bool yenidenBaslaKontrol = false;
    public Text oyunBittiText; // Oyun bittiyi gostermek icin bunu yazdik 
    public Text yenidenBaslaText; // text yeniden baslamayi sormak icin bunu yazdik
    void Start()
    {
        score = 0;
        StartCoroutine(Olustur());
        text.text = "Score = " + score;





    }
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.R) && yenidenBaslaKontrol)
        {
            SceneManager.LoadScene("Level1"); // bunun sayesinde olan bolumumuzu yeniden baslatiyoruz
        }    
    }

    IEnumerator Olustur() // IEnumetator ile fonksiyon olusturdugumuz zaman return etmemiz gerekiyor
    {
        yield return new WaitForSeconds(baslangicBekleme); // oyun basladiktan 2 saniye sonra calismasi icin bunu yazdik
        while (true)
        {
            for (int i = 0; i < 10; i++)

            {
                Vector3 vec = new Vector3(Random.Range(-randomPos.x, randomPos.x), 0, randomPos.z); // burada da astroidin hangi pozisyonda random sekilde olusacaginin kodu
                Instantiate(Asteroid, vec, Quaternion.identity); // nerede oluscagini bu kod sayesinde yapiyoruz
                yield return new WaitForSeconds(olusturmaBekleme); // bunun sayesinde 1 saniye bekleyip daha sonra for dongusu donmeye devam ediyor
            }
            if (oyunBittiKontrol)
            {
                yenidenBaslaText.text = "Yeniden Baslamak Icin 'R' tusuna basiniz"; // Yeniden baslamak icin yeni bir text objesi olusturduk ve public olarak tanim ladigimiz degeri oyun ekraninda ne olarak yazacagini buıraya yazdik

                yenidenBaslaKontrol = true;
                break; // oyunu break yaparak burada bitirdik
            }
            yield return new WaitForSeconds(donguBekleme);
            
        }

        

        


    }
    public void ScoreArttir(int gelenScore)  // ATes edince yok olma koduna ulasabilmek icin burada public bir fonksiyon yazdik buradan score'u arrtirip azaltiyoruz 
    {
        score += gelenScore;
        text.text = "Score = " + score;
        
    }
    public void oyunBitti()
    {
        oyunBittiText.text = "Oyun Bitti";
        oyunBittiKontrol = true; // oyun bittigi zaman burayi true yaptik ki oyunBittiKontrol degerimiz if durumuna girebilsin diye
    }
   
}
