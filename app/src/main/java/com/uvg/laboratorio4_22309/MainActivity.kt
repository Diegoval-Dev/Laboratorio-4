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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(){
                        MainTitel(
                            title = "Campus central",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            color= Color.Black
                        )
                        Banner(
                            id = R.drawable.banner,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentScale = ContentScale.FillWidth

                        )
                        SecondaryTitle(
                            secondaryTitle = "DESTACADOS",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp, start = 10.dp),
                            textAlign = TextAlign.Start,
                            color = Color.Gray,
                            fontSize = 15.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MainTitel(title: String, modifier: Modifier = Modifier, textAlign: TextAlign, fontSize: TextUnit, color: Color) {
    Text(
        text = title,
        modifier = modifier,
        textAlign = textAlign,
        fontSize = fontSize,
        color = color
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
fun SecondaryTitle(secondaryTitle: String, modifier: Modifier, textAlign: TextAlign, color: Color, fontSize: TextUnit){
    Text(
        text = secondaryTitle,
        modifier = modifier,
        textAlign = textAlign,
        color = color,
        fontSize = fontSize,
    )
}
@Composable
fun Card(modifierColumn: Modifier,@DrawableRes id: Int, modifierImg: Modifier, contentScale: ContentScale, modifierTextBox: Modifier, text: String, modifierText: Modifier, color: Color, fontSize: TextUnit){
    val image = painterResource(id)
    Column(
        modifier = modifierColumn
    ){
        Image(
            painter = image,
            contentDescription = stringResource(R.string.imagen_de_la_uvg),
            modifier = modifierImg,
            contentScale = contentScale
        )
        Box(
            modifier = modifierTextBox
        ){
            Text(
                text = text,
                modifier = modifierText,
                color = color,
                fontSize = fontSize,
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme{
        Column(){
            MainTitel(
                title = "Campus central",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color= Color.Black
            )
            Banner(
                id = R.drawable.banner,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.FillWidth

            )
            SecondaryTitle(
                secondaryTitle = "DESTACADOS",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 10.dp),
                textAlign = TextAlign.Start,
                color = Color.Gray,
                fontSize = 15.sp
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            ){
                Card(
                    modifierColumn = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    id = R.drawable.img1,
                    modifierImg = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    modifierTextBox = Modifier
                        .background(Color.Green)
                        .fillMaxWidth(),
                    text = "Service Now",
                    modifierText = Modifier
                        .weight(1f),
                    color = Color.White,
                    fontSize = 15.sp
                )
                Card(
                    modifierColumn = Modifier
                        .padding(5.dp).weight(1f),
                    id = R.drawable.img1,
                    modifierImg = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    modifierTextBox = Modifier
                        .background(Color.Green)
                        .fillMaxWidth(),
                    text = "Service Now",
                    modifierText = Modifier
                        .weight(1f),
                    color = Color.White,
                    fontSize = 15.sp
                )
            }
            SecondaryTitle(
                secondaryTitle = "DESTACADOS",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 10.dp),
                textAlign = TextAlign.Start,
                color = Color.Gray,
                fontSize = 15.sp
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Card(
                    modifierColumn = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    id = R.drawable.img1,
                    modifierImg = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    modifierTextBox = Modifier
                        .background(Color.Green)
                        .fillMaxWidth(),
                    text = "Service Now",
                    modifierText = Modifier
                        .weight(1f),
                    color = Color.White,
                    fontSize = 15.sp
                )
                Card(
                    modifierColumn = Modifier
                        .weight(1f)
                        .padding(5.dp),
                    id = R.drawable.img1,
                    modifierImg = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    modifierTextBox = Modifier
                        .background(Color.Green)
                        .fillMaxWidth(),
                    text = "Service Now",
                    modifierText = Modifier
                        .weight(1f),
                    color = Color.White,
                    fontSize = 15.sp
                )
            }
        }
    }
}