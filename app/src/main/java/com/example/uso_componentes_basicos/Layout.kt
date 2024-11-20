package com.example.uso_componentes_basicos

import MyButton
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyLayout(modifier: Modifier) {
    var objetivo1 by rememberSaveable { mutableStateOf(false) }
    var objetivo2 by rememberSaveable { mutableStateOf(false) }
    var objetivo3 by rememberSaveable { mutableStateOf(false) }

    var texto by rememberSaveable { mutableStateOf("") }

    var switchEnabled by rememberSaveable { mutableStateOf(true) }

    var isDarkTheme by rememberSaveable { mutableStateOf(true) }

    MaterialTheme(
        colorScheme = if (isDarkTheme) darkColors() else lightColors()
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.onBackground),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SwitchModoOscuro(isDarkTheme) { isDarkTheme = it }
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                MyCheckBox(text = "Objetivo 1", checked = objetivo1) { objetivo1 = it }
                MyCheckBox(text = "Objetivo 2", checked = objetivo2) { objetivo2 = it }
                MyCheckBox(text = "Objetivo 3", checked = objetivo3) { objetivo3 = it }
            }

            MyText(texto)

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {

                MyButton(
                    {
                        texto = getBoxChecked(objetivo1, objetivo2, objetivo3)
                    },
                    switchEnabled
                )

                MySwitch(
                    switchEnabled
                ) {
                    switchEnabled = it
                    if (!it) texto = ""
                }
            }
        }
    }
}

fun getBoxChecked(
    objetivo1Checked: Boolean,
    objetivo2Checked: Boolean,
    objetivo3Checked: Boolean
): String {
    return when {
        objetivo1Checked -> "Objetivo 1"
        objetivo2Checked -> "Objetivo 2"
        objetivo3Checked -> "Objetivo 3"
        else -> "No hay checkbox activado"
    }
}


@Composable
fun darkColors() = darkColorScheme(
    primary = Color(0xFFBB86FC),
    onPrimary = Color.Black,
    surface = Color(0xFF121212),
    onSurface = Color.White
)

@Composable
fun lightColors() = lightColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    surface = Color.White,
    onSurface = Color.Black
)




