using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Level : MonoBehaviour
{


    [SerializeField] int breakableBlocks; // seralizerd for debuging puroposes 
    
    SceneLoader sceneloader;//scene loader i cagirdik
    // Start is called before the first frame update
    private void Start()
    {
        sceneloader = FindObjectOfType<SceneLoader>(); // burada scene loader i tanimladik 
    }
    public void CountBlocks()
    {
        breakableBlocks++; // burada level icerisinde kac tane block oldugunu saydik
    }

    public void BlockDestroyed()
    {
        breakableBlocks--; // burada her block kirildiginda block sayisini azalttik
        if (breakableBlocks <= 0)// 0 landiginda 
        {
            sceneloader.LoadNextScene(); // scene loader ile yeni levele gecis yapmis olduk
        }
    }

}
