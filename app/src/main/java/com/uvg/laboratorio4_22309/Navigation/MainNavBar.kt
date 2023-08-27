package com.uvg.laboratorio4_22309.Navigation


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
import androidx.compose.material3.ButtonDefaults

import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.uvg.laboratorio4_22309.R
import com.uvg.laboratorio4_22309.ui.theme.Laboratorio4Theme



@Composable
fun NavigationBar(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
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
            Button(
                onClick = { navController.navigate(route = AppScrens.MenuScreen.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF264653)
                ),
                modifier = Modifier
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_home_work_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Button(
                onClick = { navController.navigate(route = AppScrens.MyProfile.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF264653)
                ),
                modifier = Modifier
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_man_3_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Button(
                onClick = { navController.navigate(route = AppScrens.Settings.route)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF264653)
                ),
                modifier = Modifier
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_app_settings_alt_24),
                    contentDescription = stringResource(R.string.icono_inicio),
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Button(
                onClick = { navController.navigate(route = AppScrens.EmergencyContacts.route)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF264653)
                ),
                modifier = Modifier
                    .weight(1f)
            ) {
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

