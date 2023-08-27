package com.uvg.laboratorio4_22309.Screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.uvg.laboratorio4_22309.Navigation.NavigationBar
import com.uvg.laboratorio4_22309.R
import com.uvg.laboratorio4_22309.ui.theme.Laboratorio4Theme



@Composable
fun SettingsScreen(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column{
            SecondNavBar(
                title = stringResource(R.string.settings1),
                id = R.drawable.baseline_arrow_back_ios_24,
            )
            Item(
                id = R.drawable.baseline_person_2_24,
                contentDescription = stringResource(R.string.icono_edtar_perfil),
                mainText = stringResource(R.string.edit_profile),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Gray),
                subSize = 0.sp
            )
            Item(
                id = R.drawable.baseline_markunread_24,
                contentDescription = stringResource(R.string.direccion_de_email_icono),
                mainText = stringResource(R.string.email_addresses),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Cyan),
                subSize = 0.sp
            )
            Item(
                id = R.drawable.baseline_notification_important_24,
                contentDescription = stringResource(R.string.icono_notificacion),
                mainText = stringResource(R.string.notifications),
                subText = "",
                colorFilter = ColorFilter.tint(Color.Magenta),
                subSize = 0.sp
            )
            Item(
                id = R.drawable.baseline_gpp_maybe_24,
                contentDescription = stringResource(R.string.privacidad_icono),
                mainText = stringResource(R.string.privacy),
                subText = "",
                colorFilter = ColorFilter.tint(Color.LightGray),
                subSize = 0.sp
            )
            Divider(
                thickness = 1.dp,
                color = Color.Gray
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.LightGray)
            ) {}
            Item(
                id = R.drawable.baseline_help_center_24,
                contentDescription = stringResource(R.string.icono_de_ayuda),
                mainText = stringResource(R.string.help_feedback),
                subText = stringResource(R.string.troubleshooting_tips_and_guides),
                colorFilter = ColorFilter.tint(Color.Red),
                subSize = 10.sp
            )
            Item(
                id = R.drawable.baseline_priority_high_24,
                contentDescription = stringResource(R.string.icono_acerca_de),
                mainText = stringResource(R.string.about),
                subText = stringResource(R.string.app_information_and_documents),
                colorFilter = ColorFilter.tint(Color.Blue),
                subSize = 10.sp
            )
            Divider(
                thickness = 1.dp,
                color = Color.Gray
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(Color.LightGray)
            ) {}
            Divider(
                thickness = 1.dp,
                color = Color.Gray
            )
            MainTitel(
                title = stringResource(R.string.logout),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
                    .clickable { },
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Red
            )
            Divider(
                thickness = 1.dp,
                color = Color.Gray
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.LightGray)
            ) {}
        }
        NavigationBar(navController)
    }

}
@Composable
fun SecondNavBar(title: String, @DrawableRes id: Int) {
    val image = painterResource(id)
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ){
        Box{
            Text(
                text = title,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Image(
                painter = image,
                contentDescription = stringResource(R.string.configuracion),
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .height(35.dp)
                    .width(35.dp)
                    .padding(start = 10.dp)
                    .clickable { },
                colorFilter = ColorFilter.tint(Color.Black)
            )
        }
    }
}

