using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;
public class NumberWizard : MonoBehaviour
{
    [SerializeField] int maxGuess;
    [SerializeField]  int minGuess;
    [SerializeField] TextMeshProUGUI guessText;
    int guess;
    // Start is called before the first frame update
    void Start()
    {
        StartGame();

    }

    void StartGame()
    {

        NextGuess();
        maxGuess = maxGuess + 1;
    }
    
    public void OnPressHihger()
    {
        minGuess = guess +  1;
        NextGuess();
    }

    public void OnPressLower()
    {
        maxGuess = guess -1;
        NextGuess();
    }

    
    
    void NextGuess()
    {
        guess = Random.Range(minGuess, maxGuess + 1);
        guessText.text = guess.ToString();
    }



}
