using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Block : MonoBehaviour
{

    //config params
    [SerializeField] AudioClip breakSound;
    [SerializeField] GameObject blockSparlesVFX;//  animasyonu almak icin bir field actik ve blockun icine attik
    //[SerializeField] int maxHits; // bir blok kac hitte patlayacak bunu soyluyor
    [SerializeField] Sprite[] hitSprites; // burada da spritelar icin bir array olusturduk ve sayisini da biz ayarliyoruz
    
    
    
    //cached reference
    Level level;

    GameSession currentscore; // game status u tanimladik
    // state variables

    [SerializeField] int timesHit; // TODO only serialized for debug purposes


    private void Start()
    {
        CountBreakableBlocks();

        currentscore = FindObjectOfType<GameSession>();// game status uzerinden bulduk ve tanimladik
    }

    private void CountBreakableBlocks()
    {
        level = FindObjectOfType<Level>(); // burada da objeyi bulduk
        if (tag == "Breakable")
        {
            level.CountBlocks();// ve kac tane block olupmadigini burada yazdirdik ve burada tag ile istedigimiz blocku saydirdik 
        }
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (tag == "Breakable")
        {
            HandleHit();

        }

    }

    private void HandleHit()
    {
        timesHit++;
        int maxHits = hitSprites.Length + 1;
        if (timesHit >= maxHits)
        {
            DestroyBlock();
        }
        else
        {
            ShowNextHitSprite();
        }
    }

    private void ShowNextHitSprite()
    {
        int spriteIndex = timesHit - 1;
        if (hitSprites[spriteIndex] != null)
        {
            GetComponent<SpriteRenderer>().sprite = hitSprites[spriteIndex];// burada spritelar arasinda bir gecis yapamayi sagladik
        }
        else
        {
            Debug.LogError("Block sprite from missing from array"+ gameObject.name);
        }
    }

    private void DestroyBlock()
    {
        AudioSource.PlayClipAtPoint(breakSound, Camera.main.transform.position);// kamera uzerinden duyulmasi icin kameranin pozisyonunja eristik ve o pozisyonda caldirdik
        Destroy(gameObject); // bunun sayesinde blocku patlattık
                             //Debug.Log(collision.gameObject.name);
        
        level.BlockDestroyed();
        currentscore.AddToScore();// burada score u arttirdik GameStatus kismindan cagirip
        TriggerSparklesVFX(); // animasyonu burada cagirdik
    }
    private void TriggerSparklesVFX()
    {
        GameObject sparkles = Instantiate(blockSparlesVFX,transform.position,transform.rotation); // burada sunu yaptik game objesini tanimladik ve yukarida olusturdgumuz serialied fielddan animasyonu aldik her oldugu pozisyona gore ayarladik ve burada da animasyonun calismasini sagladik 
        Destroy(sparkles, 1f);// burada da efekti gosterdikten sonra efekti oyun ekranindan sildik yer kaplamamasi icin 
    }
}
