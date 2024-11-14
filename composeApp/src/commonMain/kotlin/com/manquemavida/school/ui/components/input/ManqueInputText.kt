package com.manquemavida.school.ui.components.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drivin.android.ui.components.input.model.KeyboardOptionsTypeText
import com.drivin.android.ui.components.text.ManqueText16
import com.drivin.android.ui.components.text.ManqueText18
import theme.getColorsTheme

@Composable
fun ManqueInputText(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    title: String,
    textValue: MutableState<String>,
    placeHolder: String,
    keyboardOptionsType: KeyboardOptionsTypeText,
    errorInput: Boolean = false,
    errorMessage: String = "",
    onValueChange: (String) -> Unit,
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
            text = title,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            placeholder = {
                ManqueText18(
                    text = placeHolder
                )
            },
            supportingText = {
                ManqueText16(
                    text = errorMessage
                )
            },
            shape = ShapeDefaults.Medium,
            value = textValue.value,
            singleLine = true,
            maxLines = 1,
            isError = errorInput,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardOptionsType.getKeyboardType()
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
