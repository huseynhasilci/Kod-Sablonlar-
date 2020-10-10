using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BackgroundScroller : MonoBehaviour
{
    [SerializeField] float backgroundScrollSpeed = 0.5f;
    Material myMaterial; // quadin icindeki materyale ulasmak icin bu kodu yazdik
    Vector2 offSet;

    void Start()
    {
        myMaterial = GetComponent<Renderer>().material; // burada componente ulasip materyali aldik

        offSet = new Vector2(0f, backgroundScrollSpeed); // burasi sayesinde scroll speedimiz ile hareket ettirdik

    }

    // Update is called once per frame
    void Update()
    {
        myMaterial.mainTextureOffset += offSet * Time.deltaTime; // burasi sayesinde main texturein icerisindeki kordinatlara ulastik ve y kordinatina scroll olabilmesi icin ekledik
    }
}
