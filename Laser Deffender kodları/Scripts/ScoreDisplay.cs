﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
public class ScoreDisplay : MonoBehaviour
{

    Text scoreText;
    GameSession gameSession;
        
    // Start is called before the first frame update
    void Start()
    {
        scoreText = GetComponent<Text>();
        gameSession = FindObjectOfType<GameSession>(); //genel olarak scriptler type ile bulunuyyor
    }

    // Update is called once per frame
    void Update()
    {
        scoreText.text = gameSession.GetScore().ToString(); // surekli update edip score u ekrana yazdiriyoruz

    }
}
