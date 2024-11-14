package com.manquemavida.previews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.drivin.android.ui.components.input.model.CustomKeyboardTypeText.Text
import com.drivin.android.ui.components.input.model.KeyboardOptionsTypeText
import com.manquemavida.school.ui.components.input.ManqueInputEmail
import com.manquemavida.school.ui.components.input.ManqueInputPassword
import com.manquemavida.school.ui.components.input.ManqueInputText

@Preview(showBackground = true)
@Composable
internal fun PreviewInputEmail(){
    val emailInput = remember { mutableStateOf("") }
    val errorInput = false
    val errorMessage = ""
    ManqueInputEmail(
        inputValue = emailInput,
        errorInput = errorInput,
        errorMessage = errorMessage,
        onValueChange = { }
    )
}

@Preview(showBackground = true)
@Composable
internal fun PreviewInputPass(){
    val passValue = remember { mutableStateOf("") }
    val errorInput = false
    val errorMessage = ""
    ManqueInputPassword(
        passValue = passValue,
        errorInput = errorInput,
        errorMessage = errorMessage,
        onValueChange = { }
    )
}

@Preview(showBackground = true)
@Composable
internal fun PreviewInput(){
    val inputValue = remember { mutableStateOf("") }
    val maxLength = 100
    val errorInput = false
    val errorMessage = ""
    ManqueInputText(
        title = "Palabras",
        textValue = inputValue,
        errorInput = errorInput,
        errorMessage = errorMessage,
        placeHolder = "Ingrese palabras...",
        keyboardOptionsType = KeyboardOptionsTypeText(Text),
        onValueChange = { changeValue ->
            if (changeValue.length <= maxLength) {
                inputValue.value = changeValue
            }
        }
    )
}