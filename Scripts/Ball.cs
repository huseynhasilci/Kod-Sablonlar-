
using UnityEngine;

public class Ball : MonoBehaviour
{

    // config paramaters
    [SerializeField] Paddle paddle1;
    [SerializeField] float velocityvVectorX = 2f;
    [SerializeField] float velocityvVectorY = 15f;
    [SerializeField] AudioClip[] ballSounds;
    [SerializeField] float randomFactor = 0.2f;
    // state 
    Vector2 paddleBallVector;
    bool hasStarted = false;

    // Cached component refrences
    AudioSource myAudioSource; // burada da AudioSource olarak tanimladik
    Rigidbody2D myRigidBody2D;

    // Start is called before the first frame update
    void Start()
    {
        paddleBallVector = transform.position - paddle1.transform.position; // bu kisimda topu paddle a yapistirdik 
        myAudioSource = GetComponent<AudioSource>(); // buraya bir kere tanimladiktan sonra her seferinde GetComponent yapmak zorunda kalmiyoruz
        myRigidBody2D = GetComponent<Rigidbody2D>();
    }

    // Update is called once per frame
    void Update()
    {
        if (!hasStarted)
        {
            LockBallToPaddle();
            LaunchOnMouseClick();
        }
        

        
    }

    

    private void LockBallToPaddle()
    {
        Vector2 paddlePos = new Vector2(paddle1.transform.position.x, paddle1.transform.transform.position.y);
        transform.position = paddleBallVector + paddlePos;
        
    }

    private void LaunchOnMouseClick() // bu kisimda topu hareket ettirdik click yaparak
    {
        if (Input.GetMouseButtonDown(0))
        {
            myRigidBody2D.velocity = new Vector2(velocityvVectorX,velocityvVectorY);
            hasStarted = true; //  burada da basladiginda uptade e girmesi icin yazdik
        }
    }

    private void OnCollisionEnter2D(Collision2D collision) // burada top bir blocka carptiginda ses cikarmasini yapiyoruz
    {
        Vector2 velocityTweak = new Vector2(Random.Range(0f, randomFactor), Random.Range(0f, randomFactor));

        if (hasStarted)
        {
            AudioClip clip = ballSounds[UnityEngine.Random.Range(0, ballSounds.Length)]; //burada olusturdugumuz serialized fieldin icerisine yerlestirecegimiz verileri bir array uzerinden random sekilde cikarilmasi islemini yapiyoruz
            myAudioSource.PlayOneShot(clip);
            myRigidBody2D.velocity += velocityTweak; 
        }
        
    }




}
