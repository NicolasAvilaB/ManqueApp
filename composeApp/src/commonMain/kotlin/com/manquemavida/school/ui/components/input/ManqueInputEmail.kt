package com.manquemavida.school.ui.components.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivin.android.ui.components.text.ManqueText16
import com.drivin.android.ui.components.text.ManqueText18
import manqueapp.composeapp.generated.resources.Res
import manqueapp.composeapp.generated.resources.icon_email_screen
import manqueapp.composeapp.generated.resources.label_email
import manqueapp.composeapp.generated.resources.placeholder_your_must_enter_email
import org.jetbrains.compose.resources.stringResource
import theme.getColorsTheme

@Composable
fun ManqueInputEmail(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    inputValue: MutableState<String>,
    errorInput: Boolean,
    errorMessage: String,
    onValueChange: (String) -> Unit
) {
    val colors = getColorsTheme()
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
            text = stringResource(Res.string.label_email),
            fontWeight = FontWeight.Bold,
            color = colors.textColor
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                ManqueText18(
                    text = stringResource(Res.string.placeholder_your_must_enter_email),
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
            isError = errorInput,
            value = inputValue.value,
            enabled = enabled,
            singleLine = true,
            maxLines = 1,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = stringResource(Res.string.icon_email_screen),
                    tint = colors.iconColor
                )
            },
            keyboardOptions =
            KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            textStyle = TextStyle(
                color = colors.textColor,
                fontSize =  18.sp
            ),
            onValueChange = onValueChange
        )
    }
}

private val TitlePaddingTextAround = 8.dp
