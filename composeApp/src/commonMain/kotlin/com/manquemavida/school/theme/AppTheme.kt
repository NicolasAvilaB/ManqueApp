package theme

import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.cache.SessionCache

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(primary = Color.Black),
        shapes = MaterialTheme.shapes.copy(
            small = AbsoluteCutCornerShape(0.dp),
            medium = AbsoluteCutCornerShape(0.dp),
            large = AbsoluteCutCornerShape(0.dp)
        ),
    ) {
        content()
    }
}

@Composable
fun getColorsTheme(): DarkModeColors {
    val isDarkMode = SessionCache.isDarkMode()

    val purple = Color(0xFF6A66FF)
    val blueSea = if (isDarkMode) Color(0xFF454FB8) else Color.LightGray
    val redHead = if (isDarkMode) Color(0xFF8E3218)else Color(0xFFCC360D)
    val colorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
    val backgroundColor = if (isDarkMode) Color(0xFF1E1C1C) else Color.White
    val textColor = if (isDarkMode) Color.White else Color.Black
    val addIconColor = if (isDarkMode) purple else Color.Black
    val colorArrowRound = if (isDarkMode) purple else Color.Gray.copy(alpha = 0.2f)

    return DarkModeColors(
        purple = purple,
        blueSea = blueSea,
        colorExpenseItem = colorExpenseItem,
        background = backgroundColor,
        redHead = redHead,
        textColor = textColor,
        addIconColor = addIconColor,
        colorArrowRound = colorArrowRound,
    )
}
