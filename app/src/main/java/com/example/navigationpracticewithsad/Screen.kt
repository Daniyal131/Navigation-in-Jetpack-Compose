package com.example.navigationpracticewithsad

sealed class Screen(val route: String){
    object Greeting:Screen(route = "greeting_screen")
    object HowAreYou:Screen(route = "howareyou_screen")
    object IamGood:Screen(route = "iamgood_screen")
    object Stfu:Screen(route = "stfu_screen")
}