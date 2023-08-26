package com.example.navigationpracticewithsad

sealed class Screen(val route: String){
    object Greeting:Screen(route = "greeting_screen")
    object HowAreYou:Screen(route = "how_are_you_screen")
    object IamGood:Screen(route = "i_am_good_screen")
    object Stfu:Screen(route = "stfu_screen")
}