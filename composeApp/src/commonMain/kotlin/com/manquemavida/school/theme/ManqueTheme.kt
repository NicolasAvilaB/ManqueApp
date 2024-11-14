package theme

import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.manquemavida.school.theme.buttonNavigationColor40Light
import com.manquemavida.school.theme.buttonNavigationColor80Dark
import com.manquemavida.school.theme.buttonNavigationDisabled40Light
import com.manquemavida.school.theme.buttonNavigationDisabled80Dark
import com.manquemavida.school.theme.onPrimaryColorDark
import com.manquemavida.school.theme.primary40
import com.manquemavida.school.theme.primary80
import data.cache.SessionCache

@Composable
fun ManqueTheme(content: @Composable () -> Unit) {
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
    val onPrimaryColorDark = if (isDarkMode) onPrimaryColorDark else Color.White
    val primaryColor = if (isDarkMode) primary80 else primary40
    val blueSea = if (isDarkMode) Color(0xFF454FB8) else Color.LightGray
    val redHead = if (isDarkMode) Color(0xFF8E3218)else Color(0xFFCC360D)
    val colorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
    val backgroundColor = if (isDarkMode) Color(0xFF1E1C1C) else Color.White
    val textColor = if (isDarkMode) Color.White else Color.Black
    val buttonNavigationEnabledColor =
        if (isDarkMode) buttonNavigationColor80Dark
        else buttonNavigationColor40Light
    val buttonNavigationDisabledColor =
        if (isDarkMode) buttonNavigationDisabled80Dark
        else buttonNavigationDisabled40Light
    val textIconNavDisabledColor =
        if (isDarkMode) buttonNavigationDisabled40Light
        else  buttonNavigationDisabled80Dark
    val buttonPrimaryColor = if (isDarkMode) Color(0xFF91ABF8) else Color(0xFF2141A0)
    val iconColor = if (isDarkMode) Color.LightGray else Color(0xFF424342)
    val errorTextColor = Color.Red
    val addIconColor = if (isDarkMode) purple else Color.Black
    val colorArrowRound = if (isDarkMode) purple else Color.Gray.copy(alpha = 0.2f)

    return DarkModeColors(
        purple = purple,
        blueSea = blueSea,
        colorExpenseItem = colorExpenseItem,
        background = backgroundColor,
        redHead = redHead,
        primaryColor = primaryColor,
        onPrimaryColorDark = onPrimaryColorDark,
        buttonPrimaryColor = buttonPrimaryColor,
        textIconNavDisabledColor = textIconNavDisabledColor,
        buttonNavigationEnabledColor = buttonNavigationEnabledColor,
        buttonNavigationDisabledColor = buttonNavigationDisabledColor,
        iconColor = iconColor,
        textColor = textColor,
        errorTextColor = errorTextColor,
        addIconColor = addIconColor,
        colorArrowRound = colorArrowRound,
    )
}
