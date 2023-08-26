package com.example.navigationpracticewithsad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationpracticewithsad.ui.theme.NavigationPracticeWithSadTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationPracticeWithSadTheme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Composable
fun Greeting(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            navController.navigate(route = Screen.HowAreYou.route)
        }, contentAlignment = Alignment.Center){
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = "Hello!", fontSize = 45.sp
            )
            Button(onClick = {  navController.navigate(route = Screen.Stfu.route ) }) {
                Text(text = "Not Hello")
            }
        }
    }
}


@Composable
fun HowAreYou(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            navController.navigate(route = Screen.IamGood.route)
        }, contentAlignment = Alignment.Center){
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = "HowAreYou!", fontSize = 45.sp
            )
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Greeting")
            }
        }
    }
}

@Composable
fun IamGood(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            navController.popBackStack()
        }, contentAlignment = Alignment.Center){
        Text(
            text = "IamGood!", fontSize = 45.sp
        )
    }
}

@Composable
fun Stfu(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            navController.popBackStack()
        }, contentAlignment = Alignment.Center){
        Text(
            text = "Shut The Fuck Up!", fontSize = 45.sp
        )
    }
}