package com.uvg.laboratorio4_22309

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.laboratorio4_22309.ui.theme.Laboratorio4Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(){
                        MainTitel("Android",
                            Modifier
                                .fillMaxWidth()
                                .padding(20.dp), TextAlign.Center, 20.sp)
                        Banner(id = R.drawable.banner,
                            Modifier
                                .fillMaxWidth()
                                .height(150.dp),ContentScale.FillWidth)
                    }
                }
            }
        }
    }
}

@Composable
fun MainTitel(title: String, modifier: Modifier = Modifier, textAlign: TextAlign, fontSize: TextUnit) {
    Text(
        text = title,
        modifier = modifier,
        textAlign = textAlign,
        fontSize = fontSize
    )
}
@Composable
fun Banner(@DrawableRes id: Int, modifier: Modifier, contentScale: ContentScale){
    val image = painterResource(id)
    Image(
        painter = image,
        contentDescription = stringResource(R.string.baner_uvg),
        modifier = modifier,
        contentScale = contentScale
        )
}
@Composable
fun SecondaryTitle(secondaryTitle: String){
    Text(
        text = secondaryTitle
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme{
        Column(){
            MainTitel("Campus central",
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp), TextAlign.Center, 20.sp)
            Banner(id = R.drawable.banner,
                Modifier
                    .fillMaxWidth()
                    .height(150.dp),ContentScale.FillWidth)
        }
    }
}