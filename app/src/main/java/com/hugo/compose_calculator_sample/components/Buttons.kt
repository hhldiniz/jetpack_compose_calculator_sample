package com.hugo.compose_calculator_sample.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorButton(
    symbol: String,
    color: Color = Color.Blue,
    textColor: Color = Color.White,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier.padding(all = 8.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = color),
        onClick = onClick
    ) {
        Text(text = symbol, style = TextStyle(color = textColor))
    }
}