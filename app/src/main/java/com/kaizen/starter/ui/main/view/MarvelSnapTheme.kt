package com.mygame.marvelsnapclone.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Primary Colors
val PrimaryLight = Color(0xFFE0E0E0)
val PrimaryDark = Color(0xFF212121)

// Secondary Colors
val SecondaryLight = Color(0xFFF44336) // Red accent
val SecondaryDark = Color(0xFFB71C1C) // Darker red

// Background Colors
val BackgroundLight = Color(0xFF121212) // Dark background
val BackgroundDark = Color(0xFF000000) // Even darker background

// Text Colors
val TextPrimaryLight = Color(0xFFFFFFFF) // White text on dark background
val TextPrimaryDark = Color(0xFFE0E0E0) // Light text on dark background

@Composable
fun MarvelSnapTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColors(
            primary = PrimaryDark,
            primaryVariant = SecondaryDark,
            secondary = SecondaryDark,
            onPrimary = TextPrimaryDark,
            onSecondary = TextPrimaryDark,
            background = BackgroundDark
        )
    } else {
        lightColors(
            primary = PrimaryLight,
            primaryVariant = SecondaryLight,
            secondary = SecondaryLight,onPrimary = TextPrimaryLight,
            onSecondary = TextPrimaryLight,
            background = BackgroundLight
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography(),
        //shapes = Shapes,
        content = content
    )
}