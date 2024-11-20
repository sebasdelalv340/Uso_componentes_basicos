package com.example.uso_componentes_basicos

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MyText(text: String) {
    Box(modifier = Modifier.size(250.dp, 150.dp)
        .border(2.dp, color = MaterialTheme.colorScheme.onPrimary, shape = RoundedCornerShape(10.dp))
        , contentAlignment = Alignment.Center)
    {
        Text(text = text,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}