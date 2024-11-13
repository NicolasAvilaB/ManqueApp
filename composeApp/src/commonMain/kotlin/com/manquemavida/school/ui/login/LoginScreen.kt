package com.manquemavida.school.ui.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.drivin.android.ui.components.text.ManqueText14
import com.drivin.android.ui.components.text.ManqueText16
import com.manquemavida.school.navigation.NavGo
import com.manquemavida.school.ui.components.buttons.ManquePrimaryButton
import com.manquemavida.school.ui.components.imagesload.ImagesLoadLogo
import com.manquemavida.school.ui.components.input.ManqueInputEmail
import com.manquemavida.school.ui.components.input.ManqueInputPassword
import manqueapp.composeapp.generated.resources.Res
import manqueapp.composeapp.generated.resources.login
import org.jetbrains.compose.resources.stringResource
import theme.DarkModeColors

@Composable
internal fun LoginScreen(
    navGo: NavGo,
    colors: DarkModeColors,
) {
    val inputValue = remember { mutableStateOf("") }
    val errorEmailInput = false
    val errorEmailMessage = ""

    val passValue = remember { mutableStateOf("") }
    val errorPassInput = false
    val errorPassMessage = ""
        Box(
            modifier = Modifier
                    .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.padding(bottom = 120.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ImagesLoadLogo()
                ManqueInputEmail(
                    modifier = Modifier.padding(
                        start = InputAroundPadding,
                        end = InputAroundPadding
                    ),
                    inputValue = inputValue,
                    errorInput = errorEmailInput,
                    errorMessage = errorEmailMessage,
                    onValueChange = { value ->
                        inputValue.value = value
                    }
                )

                ManqueInputPassword(
                    modifier = Modifier.padding(
                        start = InputAroundPadding,
                        end = InputAroundPadding
                    ),
                    passValue = passValue,
                    errorInput = errorPassInput,
                    errorMessage = errorPassMessage,
                    onValueChange = { value ->
                        passValue.value = value
                    }
                )
                ManquePrimaryButton(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .width(150.dp)
                        .height(60.dp),
                    textContent = stringResource(Res.string.login),
                    onClick = { }
                )
            }
            Column(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxSize()
                    .padding(bottom = 16.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ManqueText14(
                    text = "Copyright © 2024 | Nicolás Ávila B",
                    fontWeight = FontWeight.Bold,
                )
                ManqueText14(
                    text = "para Fundación Manquemávida ",
                    fontWeight = FontWeight.Bold,
                )
            }
        }
}

private val InputAroundPadding = 10.dp
