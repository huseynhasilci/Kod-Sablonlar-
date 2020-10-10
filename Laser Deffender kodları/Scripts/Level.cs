using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;




public class Level : MonoBehaviour
{
    [SerializeField] float delayInSeconds = 2f;
    public void LoadStartMenu()
    {

        SceneManager.LoadScene("StartMenu");
    
    }

    public void LoadMainGame()
    {
        SceneManager.LoadScene("Game");
        FindObjectOfType<GameSession>().ResetGame(); // burada da oyunu  resetledik
    }

    public void LoadGameOver()
    {
        StartCoroutine(WaitAndLoad());
        
    }


    public void QuitGame()
    {
        Application.Quit();
    }

    IEnumerator WaitAndLoad()
    {
        yield return new WaitForSeconds(delayInSeconds); // burasi sayesinde 2 saniye oldukten sonra bekletmis olduk
        SceneManager.LoadScene("GameOver");
    }

}
