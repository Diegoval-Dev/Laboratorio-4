package com.uvg.laboratorio4_22309

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio4_22309.ui.theme.ui.theme.Laboratorio4Theme

class MyProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column {
                        NavBar(
                            title = stringResource(R.string.my_profile),
                            modifierText = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            id = R.drawable.baseline_app_settings_alt_24,
                            colorFilter = ColorFilter.tint(Color.Green),
                            fontSize = 20.sp
                        )
                        Box(){
                            val borderWidth = 2.dp
                            Banner(
                                id = R.drawable.img5,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                alphaNumber = 0.5f
                            )
                            PerfilPhoto(
                                id = R.drawable.perfil_vacio,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(100.dp)
                                    .width(100.dp)
                                    .border(
                                        BorderStroke(borderWidth, Color.White),
                                        CircleShape
                                    )
                                    .padding(borderWidth)
                                    .clip(CircleShape)
                                    .clickable {  },
                            )
                        }
                        MainTitel(
                            title = stringResource(R.string.user_name),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 10.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Item(
                            id = R.drawable.baseline_school_24,
                            contentDescription = stringResource(R.string.icono_de_mi_campus),
                            mainText = stringResource(R.string.my_campus),
                            subText = stringResource(R.string.campus_centralS),
                            colorFilter = ColorFilter.tint(Color.Green),
                            subSize = 10.sp
                        )
                        Item(
                            id = R.drawable.baseline_man_3_24,
                            contentDescription = stringResource(R.string.icono_de_amigos),
                            mainText = stringResource(R.string.my_friends),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Blue),
                            subSize = 0.sp
                        )
                        Item(
                            id = R.drawable.baseline_calendar_month_24,
                            contentDescription = stringResource(R.string.icono_calendario),
                            mainText = stringResource(R.string.my_calendar),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Green),
                            subSize = 0.sp
                        )
                        Item(
                            id = R.drawable.baseline_book_24,
                            contentDescription = stringResource(R.string.icono_cursos),
                            mainText = stringResource(R.string.my_courses),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Yellow),
                            subSize = 0.sp
                        )
                        Item(
                            id = R.drawable.baseline_fact_check_24,
                            contentDescription = stringResource(R.string.icono_de_mis_notas),
                            mainText = stringResource(R.string.my_grades),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Blue),
                            subSize = 0.sp
                        )
                        Item(
                            id = R.drawable.baseline_groups_2_24,
                            contentDescription = stringResource(R.string.icono_grupos),
                            mainText = stringResource(R.string.my_groups),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Blue),
                            subSize = 0.sp
                        )
                        Item(
                            id = R.drawable.baseline_edit_calendar_24,
                            contentDescription = stringResource(R.string.icono_eventos_proximos),
                            mainText = stringResource(R.string.my_upcoming_events),
                            subText = "",
                            colorFilter = ColorFilter.tint(Color.Cyan),
                            subSize = 0.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NavBar(title: String, modifierText: Modifier = Modifier, @DrawableRes id: Int, colorFilter: ColorFilter, fontSize: TextUnit) {
    val image = painterResource(id)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ){
        Box{

            Text(
                text = title,
                modifier = modifierText,
                textAlign = TextAlign.Center,
                fontSize = fontSize,
                fontWeight = FontWeight.ExtraBold
            )
            Image(
                painter = image,
                contentDescription = stringResource(R.string.configuracion),
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .height(35.dp)
                    .width(35.dp)
                    .padding(end = 10.dp)
                    .clickable {  },
                colorFilter = colorFilter
            )
        }
    }
}

@Composable
fun PerfilPhoto(@DrawableRes id: Int, modifier: Modifier){
    val image = painterResource(id)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp)
    ){
        Image(
            painter = image,
            contentDescription = stringResource(R.string.foto_de_perfil),
            modifier = modifier
        )
    }
}

@Composable
fun Item(@DrawableRes id: Int, contentDescription: String, mainText: String, subText: String, colorFilter: ColorFilter, subSize: TextUnit){
    val image = painterResource(id)
    Divider(
        thickness = 1.dp,
        color = Color.Gray
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clickable {  },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = image,
            contentDescription = contentDescription,
            colorFilter = colorFilter,
            modifier = Modifier
                .height(35.dp)
                .width(35.dp)
                .padding(start = 6.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 5.dp, bottom = 5.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = mainText,
                fontSize = 18.sp
            )
            Text(
                text = subText,
                fontSize = subSize,
                color = Color.Gray
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Laboratorio4Theme {
        Column {
            NavBar(
                title = stringResource(R.string.my_profile),
                modifierText = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                id = R.drawable.baseline_app_settings_alt_24,
                colorFilter = ColorFilter.tint(Color.Green),
                fontSize = 20.sp
            )
            Box(){
                val borderWidth = 2.dp
                Banner(
                    id = R.drawable.img5,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    alphaNumber = 0.5f
                )
                PerfilPhoto(
                    id = R.drawable.perfil_vacio,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .height(100.dp)
                        .width(100.dp)
                        .border(
                            BorderStroke(borderWidth, Color.White),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape),
                )
            }
            MainTitel(
                title = stringResource(R.string.user_name),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.Black
            )
            Item(
                id = R.drawable.baseline_school_24,
                contentDescription = stringResource(R.string.icono_de_mi_campus),
                mainText = stringResource(R.string.my_campus),
                subText = stringResource(R.string.campus_centralS),
                colorFilter = ColorFilter.tint(Color.Green),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_man_3_24,
                contentDescription = stringResource(R.string.icono_de_amigos),
                mainText = stringResource(R.string.my_friends),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Blue),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_calendar_month_24,
                contentDescription = stringResource(R.string.icono_calendario),
                mainText = stringResource(R.string.my_calendar),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Green),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_book_24,
                contentDescription = stringResource(R.string.icono_cursos),
                mainText = stringResource(R.string.my_courses),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Yellow),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_fact_check_24,
                contentDescription = stringResource(R.string.icono_de_mis_notas),
                mainText = stringResource(R.string.my_grades),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Blue),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_sports_kabaddi_24,
                contentDescription = stringResource(R.string.icono_grupos),
                mainText = stringResource(R.string.my_groups),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Blue),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_edit_calendar_24,
                contentDescription = stringResource(R.string.icono_eventos_proximos),
                mainText = stringResource(R.string.my_upcoming_events),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Cyan),
                subSize = 10.sp
            )
        }
    }
}