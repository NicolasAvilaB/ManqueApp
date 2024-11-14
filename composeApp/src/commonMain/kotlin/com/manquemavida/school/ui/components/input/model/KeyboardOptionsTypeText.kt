package com.drivin.android.ui.components.input.model

import androidx.compose.ui.text.input.KeyboardType
import com.drivin.android.ui.components.input.model.CustomKeyboardTypeText.Email
import com.drivin.android.ui.components.input.model.CustomKeyboardTypeText.Text

data class KeyboardOptionsTypeText(
    val keyboardType: CustomKeyboardTypeText
) {
    fun getKeyboardType(): KeyboardType {
        return when (keyboardType) {
            Text -> KeyboardType.Text
            Email -> KeyboardType.Email
        }
    }
}
