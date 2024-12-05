package iroma.app.dotainfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import iroma.app.dotainfo.ui.theme.DotaInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DotaInfoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(modifier = Modifier
            .clickable { var onClick = @androidx.compose.runtime.Composable { Melee() } }
            .background(Color.LightGray) ,text = "Melee")
        Text(modifier = Modifier
            .clickable { var onClick = @androidx.compose.runtime.Composable {Range()} }
            .background(Color.LightGray), text = "Range")
    }

}

@Composable
fun Melee(){val a = 1

}

@Composable
fun Range(){ val b =1

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DotaInfoTheme {
        Greeting()
    }
}