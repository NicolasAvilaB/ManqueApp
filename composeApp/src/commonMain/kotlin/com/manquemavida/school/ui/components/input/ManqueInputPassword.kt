package com.manquemavida.school.ui.components.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivin.android.ui.components.text.ManqueText16
import com.drivin.android.ui.components.text.ManqueText18
import manqueapp.composeapp.generated.resources.Res
import manqueapp.composeapp.generated.resources.icon_for_watch_pass_screen
import manqueapp.composeapp.generated.resources.icon_pass_screen
import manqueapp.composeapp.generated.resources.label_pass
import manqueapp.composeapp.generated.resources.placeholder_your_must_enter_password
import org.jetbrains.compose.resources.stringResource
import theme.getColorsTheme

@Composable
fun ManqueInputPassword(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    passValue: MutableState<String>,
    errorInput: Boolean = false,
    errorMessage: String,
    onValueChange: (String) -> Unit
) {
    val colors = getColorsTheme()
    var passwordVisibility by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        ManqueText16(
            modifier = Modifier.padding(
                start = TitlePaddingTextAround,
                bottom = TitlePaddingTextAround,
                end = TitlePaddingTextAround
            ),
            text = stringResource(Res.string.label_pass),
            fontWeight = FontWeight.Bold,
            color = colors.textColor
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            placeholder = {
                ManqueText18(
                    text = stringResource(Res.string.placeholder_your_must_enter_password),
                    color = colors.textColor
                )
            },
            supportingText = {
                ManqueText16(
                    text = errorMessage,
                    color = colors.errorTextColor
                )
            },
            shape = ShapeDefaults.Medium,
            value = passValue.value,
            singleLine = true,
            maxLines = 1,
            isError = errorInput,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription =
                    stringResource(Res.string.icon_pass_screen),
                    tint = colors.iconColor
                )
            },
            trailingIcon = {
                val imagen =
                    if (passwordVisibility) {
                        Icons.Filled.VisibilityOff
                    } else {
                        Icons.Filled.Visibility
                    }
                IconButton(
                    onClick = {
                        passwordVisibility = !passwordVisibility
                    }
                ) {
                    Icon(
                        imageVector = imagen,
                        contentDescription =
                        stringResource(Res.string.icon_for_watch_pass_screen),
                        tint = colors.iconColor
                    )
                }
            },
            visualTransformation = if (passwordVisibility) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            textStyle = TextStyle(
                color = colors.textColor,
                fontSize =  18.sp
            ),
            onValueChange = onValueChange
        )
    }
}

private val TitlePaddingTextAround = 8.dp
