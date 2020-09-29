using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Paddle : MonoBehaviour
{
    // confifuration paramater


    [SerializeField] float minX = 1f;
    [SerializeField] float maxX = 15f;
    [SerializeField] float screenWidthUnits = 16f;

    // cached the references
    GameSession theGameSession;
    Ball theBall;
    // Start is called before the first frame update
    void Start()
    {
        theGameSession = FindObjectOfType<GameSession>();
        theBall = FindObjectOfType<Ball>();
    }

    // Update is called once per frame
    void Update()
    {
        //float mousePosUnits = Input.mousePosition.x / Screen.width * screenWidthUnits;
        Vector2 paddlePos = new Vector2(transform.position.x, transform.position.y); // burada da hangi pozisyona gelecegini ayarladik
        paddlePos.x = Mathf.Clamp(GetXPos(), minX,maxX);// burasi sayesinde nere kadar gidip gidemeyecegini yazdik
        transform.position = paddlePos; // paddlemizin posizyonunu degistirmek icin kullandik

    }

    private float GetXPos()
    {
        if (theGameSession.IsAutoPlayEnabled())
        {
            return theBall.transform.position.x;
        }
        else
        {
            return Input.mousePosition.x / Screen.width * screenWidthUnits;
        }
    }


}
