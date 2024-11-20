package com.example.uso_componentes_basicos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Switch para alternar entre los temas claro y oscuro
@Composable
fun SwitchModoOscuro(isDarkTheme: Boolean, onChangeTheme:(Boolean)-> Unit ) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Text(
            text = if (isDarkTheme) "Modo Oscuro" else "Modo Claro",
            color = MaterialTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.width(8.dp))
        Switch(
            checked = isDarkTheme,
            onCheckedChange = onChangeTheme,
            colors = SwitchDefaults.colors(
                checkedTrackColor = MaterialTheme.colorScheme.surfaceContainer,
                checkedThumbColor = MaterialTheme.colorScheme.onSurface
        ))
    }
}
