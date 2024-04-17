package com.kumaa.prompy.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = White,
    primaryContainer = Cyan,
    onPrimaryContainer = Black,
    secondary = Cyan,
    onSecondary = Black,
    secondaryContainer = Cyan,
    onSecondaryContainer = Black,
    tertiary = Cyan,
    onTertiary = Black,
    tertiaryContainer = Cyan,
    onTertiaryContainer = Black,
    error = Error,
    errorContainer = Error,
    onError = White,
    onErrorContainer = Black,
    background = White,
    onBackground = Black,
    surface = White,
    onSurface = Black,
    surfaceVariant = White,
    onSurfaceVariant = Black,
    outline = Gray,
    inverseOnSurface = White,
    inverseSurface = Black,
    inversePrimary = Primary,
    surfaceTint = Cyan,
    outlineVariant = Gray,
    scrim = Black,
)

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = White,
    primaryContainer = Cyan,
    onPrimaryContainer = Black,
    secondary = Cyan,
    onSecondary = Black,
    secondaryContainer = Cyan,
    onSecondaryContainer = Black,
    tertiary = Cyan,
    onTertiary = Black,
    tertiaryContainer = Cyan,
    onTertiaryContainer = Black,
    error = Error,
    errorContainer = Error,
    onError = White,
    onErrorContainer = Black,
    background = Dark,
    onBackground = White,
    surface = Dark,
    onSurface = White,
    surfaceVariant = Black,
    onSurfaceVariant = Gray,
    outline = Gray,
    inverseOnSurface = White,
    inverseSurface = Black,
    inversePrimary = Primary,
    surfaceTint = Cyan,
    outlineVariant = Gray,
    scrim = Black,
)


@Composable
fun PrompyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content,
        shapes = shape
    )
}

