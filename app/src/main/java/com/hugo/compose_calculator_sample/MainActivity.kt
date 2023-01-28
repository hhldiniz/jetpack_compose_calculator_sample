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
import com.hugo.compose_calculator_sample.components.CalculatorNumberButton
import com.hugo.compose_calculator_sample.components.CalculatorOperationButton
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
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = expression)
            Row(modifier = Modifier.padding(16.dp)) {
                Column {
                    Row {
                        CalculatorNumberButton("9") {
                            expression += 9
                        }
                        CalculatorNumberButton("8") {}
                        CalculatorNumberButton("7") {}
                    }
                    Row {
                        CalculatorNumberButton("6") {}
                        CalculatorNumberButton("5") {}
                        CalculatorNumberButton("4") {}
                    }
                    Row {
                        CalculatorNumberButton("3") {}
                        CalculatorNumberButton("2") {}
                        CalculatorNumberButton("1") {}
                    }
                }
                Column {
                    Row {
                        CalculatorOperationButton("+") {}
                        CalculatorOperationButton("-") {}
                    }
                    Row {
                        CalculatorOperationButton("*") {}
                        CalculatorOperationButton("/") {}
                    }
                    Row {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                        ) {
                            Text(text = "CE", color = Color.White)
                        }
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "=")
                        }
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