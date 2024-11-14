package com.manquemavida.school.ui.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.drivin.android.ui.components.text.ManqueText16
import com.drivin.android.ui.components.text.ManqueText18
import theme.getColorsTheme

@Composable
fun ManqueNavigationButton(
    modifier: Modifier = Modifier,
    textContent: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    val colors = getColorsTheme()
    Row(
        modifier = modifier
            .clickable(enabled = enabled) { onClick() }
            .padding(
                start = RowPaddingNavigationButton,
                bottom = RowPaddingNavigationButton,
                top = RowPaddingNavigationButton
            )
    ) {
        Box(
            modifier = Modifier
                .width(ButtonWidthNavigationContainter)
                .clip(RoundedCornerShape(ButtonCornerShapeNavigationRow))
                .background(
                    when {
                        enabled -> {
                            colors.buttonNavigationEnabledColor
                        }
                        else -> {
                            colors.buttonNavigationDisabledColor
                        }
                    }
                )
                .padding(ButtonPaddingWithBackground),
            contentAlignment = Alignment.Center
        ) {
            ManqueText18(
                textAlign = TextAlign.Center,
                text = textContent,
                fontWeight = FontWeight.W600,
                color =
                if (enabled)
                    colors.onPrimaryColorDark
                else
                    colors.textIconNavDisabledColor
            )
        }
        Icon(
            modifier = Modifier
                .size(ArrowSizeOfNavigationButton)
                .padding(ArrowPaddingOfNavigationButton),
            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
            tint =
            when {
                enabled -> {
                    colors.primaryColor
                }

                else -> {
                    colors.textIconNavDisabledColor
                }
            },
            contentDescription = "",
        )
    }
}

private val ButtonWidthNavigationContainter = 170.dp
private val ButtonPaddingWithBackground = 17.dp
private val ButtonCornerShapeNavigationRow = 10.dp
private val ArrowSizeOfNavigationButton = 60.dp
private val ArrowPaddingOfNavigationButton = 10.dp
private val RowPaddingNavigationButton = 10.dp
