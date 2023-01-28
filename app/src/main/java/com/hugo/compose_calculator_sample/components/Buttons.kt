package com.hugo.compose_calculator_sample.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorNumberButton(number: String, onClick: ()-> Unit) {
    Button(modifier = Modifier.padding(all = 8.dp), onClick = onClick) {
        Text(text = number)
    }
}

@Composable
fun CalculatorOperationButton(symbol: String, onClick: () -> Unit) {
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)) {
        Text(text = symbol, color = Color.White)
    }
}