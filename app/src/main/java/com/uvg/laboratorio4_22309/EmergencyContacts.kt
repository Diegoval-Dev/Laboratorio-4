package com.uvg.laboratorio4_22309

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio4_22309.ui.theme.Laboratorio4Theme

class EmergencyContacts : ComponentActivity() {
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
                        SecondNavBar(
                            title = stringResource(R.string.emergency_contacts),
                            id = R.drawable.baseline_arrow_back_ios_24,
                        )
                        EmergencyCard(
                            title = stringResource(R.string.emergencias),
                            id = R.drawable.baseline_gpp_maybe_24,
                            info = stringResource(R.string.emergency_text),
                            numberPhones = stringResource(R.string.call_5978_1736)
                        )
                        EmergencyCard(
                            title = stringResource(R.string.clinica_uvg),
                            id = R.drawable.img5,
                            info = stringResource(R.string.info_clinic),
                            numberPhones = stringResource(R.string.call_2507_1500_ex_21312)
                        )
                        Divider(
                            thickness = 1.dp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun EmergencyCard(title: String, @DrawableRes id: Int, info: String, numberPhones: String){
    val image = painterResource(id)
    Divider(
        thickness = 1.dp,
        color = Color.Gray
    )
    Column (
        modifier = Modifier
            .padding(10.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = image,
                contentDescription = stringResource(R.string.imagen_de_emergencia),
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
            )
            Column {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = info,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    lineHeight = 12.sp
                )
            }
        }
        Row (
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
        ){
            Image(
                painter = painterResource(R.drawable.baseline_phone_enabled_24),
                contentDescription = stringResource(R.string.icono_telefono),
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .padding(5.dp)
            )
            Text(
                text = numberPhones,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Laboratorio4Theme {
        Column {
            SecondNavBar(
                title = stringResource(R.string.emergency_contacts),
                id = R.drawable.baseline_arrow_back_ios_24,
            )
            EmergencyCard(
                title = stringResource(R.string.emergencias),
                id = R.drawable.baseline_gpp_maybe_24,
                info = stringResource(R.string.emergency_text),
                numberPhones = stringResource(R.string.call_5978_1736)
            )
            EmergencyCard(
                title = stringResource(R.string.clinica_uvg),
                id = R.drawable.img5,
                info = stringResource(R.string.info_clinic),
                numberPhones = stringResource(R.string.call_2507_1500_ex_21312)
            )
            Divider(
                thickness = 1.dp,
                color = Color.Gray
            )
        }
    }
}