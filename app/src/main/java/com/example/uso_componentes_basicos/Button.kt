import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyButton(onClick:() -> Unit, switchEnabled: Boolean) {
    Button(
        onClick = onClick,
        enabled = switchEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            contentColor = MaterialTheme.colorScheme.onSurface,
            disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
            disabledContentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Text(text = "Mostrar checkbox")
    }
}

