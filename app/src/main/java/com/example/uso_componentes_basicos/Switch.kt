package com.example.uso_componentes_basicos

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable

@Composable
fun MySwitch(switchEnabled: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Switch(
        checked = switchEnabled,
        onCheckedChange = onCheckedChange
    )
}