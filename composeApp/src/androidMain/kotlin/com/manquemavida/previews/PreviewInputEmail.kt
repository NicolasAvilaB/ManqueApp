package com.manquemavida.previews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.manquemavida.school.ui.components.input.ManqueInputEmail
import com.manquemavida.school.ui.components.input.ManqueInputPassword

@Preview(showBackground = true)
@Composable
internal fun PreviewInputEmail(){
    val inputValue = remember { mutableStateOf("") }
    val errorInput = false
    val errorMessage = ""
    ManqueInputEmail(
        inputValue = inputValue,
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