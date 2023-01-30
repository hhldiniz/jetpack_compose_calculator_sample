package com.hugo.compose_calculator_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hugo.compose_calculator_sample.components.CalculatorButton
import com.hugo.compose_calculator_sample.ui.theme.Compose_calculator_sampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_calculator_sampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CalculatorContent()
                }
            }
        }
    }
}

@Composable
fun CalculatorContent() {
    Scaffold {
        var expression by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = expression)
            Row(modifier = Modifier.padding(16.dp)) {
                Column {
                    Row {
                        CalculatorButton("9") {
                            expression += 9
                        }
                        CalculatorButton("8") {
                            expression += 8
                        }
                        CalculatorButton("7") {
                            expression += 7
                        }
                    }
                    Row {
                        CalculatorButton("6") {
                            expression += 6
                        }
                        CalculatorButton("5") {
                            expression += 5
                        }
                        CalculatorButton("4") {
                            expression += 4
                        }
                    }
                    Row {
                        CalculatorButton("3") {
                            expression += 3
                        }
                        CalculatorButton("2") {
                            expression += 2
                        }
                        CalculatorButton("1") {
                            expression += 1
                        }
                    }
                    Row(modifier = Modifier.align(Alignment.End)) {
                        CalculatorButton("0") {
                            expression += 0
                        }
                    }
                    Row(modifier = Modifier.align(Alignment.End)) {
                        CalculatorButton("+", color = Color.Gray) {
                            expression += "+"
                        }
                        CalculatorButton("-", color = Color.Gray) {
                            expression += "-"
                        }
                        CalculatorButton("CE", color = Color.Red) {
                            expression = ""
                        }
                    }
                    Row(modifier = Modifier.align(Alignment.End)) {
                        CalculatorButton("*", color = Color.Gray) {
                            expression += "*"
                        }
                        CalculatorButton("/", color = Color.Gray) {
                            expression += "/"
                        }
                        CalculatorButton("=", color = Color.Magenta) {}
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_calculator_sampleTheme {
        CalculatorContent()
    }
}