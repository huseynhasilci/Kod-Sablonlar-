﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ToplanacakObje : MonoBehaviour
{
    
    void Start()
    {
        
    }

    
    void Update()
    {
        transform.Rotate(new Vector3(15,30,45)*Time.deltaTime); // unitydeki rotasyon kismindaki yerin rotate edip dondurulmesini sagliyor
        // time.deltatime ile carpilinca yavaslamasini sagladik
       
    }
}
