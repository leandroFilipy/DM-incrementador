package com.example.incrementador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.incrementador.ui.theme.IncrementadorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IncrementadorTheme {
                qs1(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}


/*
@Composable
fun incrementador( modifier: Modifier = Modifier){

    var valor by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "")
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { valor++ }) {
            Text(text = "Incrementador = $valor")
        }
    }

}

 */

/*
@Composable
fun mostrarTexto(modifier: Modifier = Modifier){

    var mostrar by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        if(mostrar){
            Text(text = "Bem vindo ao kotlin")
        }
        Text(text = "Mostrar mensagem")

        Button(onClick = { mostrar = !mostrar}) {
            Text(text = "Oi malandrinho😘")
        }
    }
}

 */
/*
@Composable
fun text(modifier: Modifier = Modifier){
    var nome by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Olá $nome")

        TextField(value = nome, onValueChange ={
            nomeNovo -> nome = nomeNovo
        },
        label = {
            Text(text = "Digite seu nome")
        }
        )

    }

}*/

@Composable
fun qs1(modifier: Modifier = Modifier) {

    var numero by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Número $numero")
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { numero++ }) {
            Text(text = "incrementar")
        }
    }
}


