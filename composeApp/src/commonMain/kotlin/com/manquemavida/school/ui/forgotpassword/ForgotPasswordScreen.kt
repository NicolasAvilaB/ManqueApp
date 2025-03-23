package com.manquemavida.school.ui.forgotpassword

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivin.android.ui.components.input.model.CustomKeyboardTypeText
import com.drivin.android.ui.components.input.model.KeyboardOptionsTypeText
import com.drivin.android.ui.components.text.ManqueText20
import com.manquemavida.school.navigation.NavGo
import com.manquemavida.school.ui.components.buttons.ManqueNavigationButton
import com.manquemavida.school.ui.components.input.ManqueInputText
import manqueapp.composeapp.generated.resources.Res
import manqueapp.composeapp.generated.resources.continues
import org.jetbrains.compose.resources.stringResource
import theme.DarkModeColors

@Composable
internal fun ForgotPasswordScreen(
    navGo: NavGo,
    colors: DarkModeColors
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                backgroundColor = colors.background,
                title = {
                    Text(
                        text = "Recuperar Clave",
                        fontSize = 20.sp,
                        color = colors.textColor
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navGo.popBackStack.invoke() }) {
                        Icon(
                            modifier = Modifier.padding(10.dp),
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Menu",
                            tint = colors.textColor
                        )
                    }
                },
                elevation = 5.dp,
            )
        },
        containerColor = colors.background,
    ) { paddingValues ->
        ForgotPasswordContent(
            paddingValues = paddingValues,
            colors = colors
        )
    }
}

@Composable
private fun ForgotPasswordContent(
    paddingValues: PaddingValues,
    colors: DarkModeColors
) {
    val inputValue = remember { mutableStateOf("") }
    val maxLength = 100
    val errorInput = false
    val errorMessage = ""
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(PaddingSpaceAroundScreen),
        verticalArrangement =
            Arrangement.spacedBy(PaddingBetweenElementOfScreen)
    ) {
        ManqueInputText(
            title = "Recuperar Clave",
            textValue = inputValue,
            errorInput = errorInput,
            errorMessage = errorMessage,
            placeHolder = "Ingrese su email/rut o teléfono...",
            keyboardOptionsType = KeyboardOptionsTypeText(CustomKeyboardTypeText.Text),
            onValueChange = { changeValue ->
                if (changeValue.length <= maxLength) {
                    inputValue.value = changeValue
                }
            }
        )

        ManqueText20(
            text = "* Para recuperar su clave, puede ingresar lo siguiente Email Institucional, Gmail, Rut o N° de Teléfono.",
            textAlign = TextAlign.Justify
        )
        ManqueText20(
            text = "* Luego se enviará un código de verificación de 4 Dígitos por SMS / Email y deberá de ingresarlos en la siguiente pantalla.",
            textAlign = TextAlign.Justify
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(PaddingSpaceAroundScreen),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        ManqueNavigationButton(
            textContent = stringResource(Res.string.continues),
            onClick = { }
        )
    }
}

private val PaddingSpaceAroundScreen = 17.dp
private val PaddingBetweenElementOfScreen = 14.dp
