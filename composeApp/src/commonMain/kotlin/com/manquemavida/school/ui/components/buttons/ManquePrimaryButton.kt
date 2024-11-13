package com.manquemavida.school.ui.components.buttons

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.drivin.android.ui.components.text.ManqueText16
import theme.getColorsTheme

@Composable
fun ManquePrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    textContent: String
) {
    val colors = getColorsTheme()
    ElevatedButton(
        modifier = modifier
            .height(primaryButtonHeight),
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(cornerShapeRadius),
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.buttonPrimaryColor
        )
    ) {
        ManqueText16(
            text = textContent,
            fontWeight = FontWeight.W600
        )
    }
}

private val primaryButtonHeight = 52.dp
private val cornerShapeRadius = 10.dp