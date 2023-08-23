package com.uvg.laboratorio4_22309

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio4_22309.ui.theme.Laboratorio4Theme

class MainNavBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun NavigationBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF264653))
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(R.drawable.baseline_home_work_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(R.drawable.baseline_app_settings_alt_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(R.drawable.baseline_gpp_maybe_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    Laboratorio4Theme {
        NavigationBar()
    }
}