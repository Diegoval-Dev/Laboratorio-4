package com.uvg.laboratorio4_22309

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import com.uvg.laboratorio4_22309.ui.theme.ui.theme.Laboratorio4Theme

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
                            alphaNumber = 1f
                        )
                        SecondaryTitle(
                            secondaryTitle = "DESTACADOS",
                        )
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(2f)
                                .padding(2.dp)
                        ){
                            Card(
                                modifier = Modifier
                                    .weight(0.7f)
                                    .padding(10.dp),
                                id = R.drawable.img1,
                                text = stringResource(R.string.service_now),
                                modifierText = Modifier
                                    .padding(10.dp)
                                    .weight(1f),
                            )
                            Card(
                                modifier = Modifier
                                    .weight(0.7f)
                                    .padding(10.dp),
                                id = R.drawable.img2,
                                text = stringResource(R.string.actualidad_uvg),
                                modifierText = Modifier
                                    .padding(10.dp)
                                    .weight(1f),
                            )
                        }
                        SecondaryTitle(
                            secondaryTitle = "SERVICIOS Y RECURSOS",
                        )
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Card(
                                modifier = Modifier
                                    .weight(0.7f)
                                    .padding(10.dp),
                                id = R.drawable.img3,
                                text = stringResource(R.string.directorio_de_servicios_estudiantiles),
                                modifierText = Modifier
                                    .padding(10.dp)
                                    .weight(1f),
                            )
                            Card(
                                modifier = Modifier
                                    .weight(0.7f)
                                    .padding(10.dp),
                                id = R.drawable.img4,
                                text = stringResource(R.string.portal_web_bibliotecas_uvg),
                                modifierText = Modifier
                                    .padding(10.dp)
                                    .weight(1f),
                            )
                        }
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
fun Banner(@DrawableRes id: Int, modifier: Modifier, alphaNumber: Float){
    val image = painterResource(id)
    Image(
        painter = image,
        contentDescription = stringResource(R.string.baner_uvg),
        modifier = modifier,
        contentScale = ContentScale.FillWidth,
        alpha = alphaNumber
    )
}
@Composable
fun SecondaryTitle(secondaryTitle: String){
    Text(
        text = secondaryTitle,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 10.dp),
        textAlign = TextAlign.Start,
        color = Color.Gray,
        fontSize = 15.sp
    )
}
@Composable
fun Card(modifier: Modifier, @DrawableRes id: Int, text: String, modifierText: Modifier){
    val image = painterResource(id)
    Column(
        modifier = modifier
    ){
        Image(
            painter = image,
            contentDescription = stringResource(R.string.imagen_de_la_uvg),
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
        ){
            Text(
                text = text,
                modifier = modifierText,
                color = Color.White,
                fontSize = 15.sp
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
                alphaNumber = 1f
            )
            SecondaryTitle(
                secondaryTitle = "DESTACADOS"
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
            ){
                Card(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(10.dp),
                    id = R.drawable.img1,
                    text = stringResource(R.string.service_now),
                    modifierText = Modifier
                        .padding(start = 10.dp)
                        .weight(1f)
                )
                Card(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(10.dp),
                    id = R.drawable.img2,
                    text = stringResource(R.string.actualidad_uvg),
                    modifierText = Modifier
                        .padding(start = 10.dp)
                        .weight(1f),
                )
            }
            SecondaryTitle(
                secondaryTitle = "SERVICIOS Y RECURSOS",

            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Card(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(10.dp),
                    id = R.drawable.img3,
                    text = stringResource(R.string.directorio_de_servicios_estudiantiles),
                    modifierText = Modifier
                        .padding(start = 10.dp)
                        .weight(1f),
                )
                Card(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(10.dp),
                    id = R.drawable.img4,
                    text = stringResource(R.string.portal_web_bibliotecas_uvg),
                    modifierText = Modifier
                        .padding(start = 10.dp)
                        .weight(1f),
                )
            }
        }
    }
}