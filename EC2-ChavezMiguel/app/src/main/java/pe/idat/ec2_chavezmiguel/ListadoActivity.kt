package pe.idat.ec2_chavezmiguel

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Libro(val titulo: String, val descripcion: String, val fechaPublicacion: String)

@Composable
fun listado() {
    var mostrarLista by remember { mutableStateOf(false) }
    val listaDeTests = listOf(
        Libro("Libro de Medicina 1", "Descripción del libro 1", "01/01/2021"),
        Libro("Libro de Medicina 2", "Descripción del libro 2", "02/02/2022"),
        Libro("Libro de Medicina 3", "Descripción del libro 3", "03/03/2023"),
        Libro("Libro de Medicina 4", "Descripción del libro 4", "04/04/2024"),
        Libro("Libro de Medicina 5", "Descripción del libro 5", "05/05/2025"),
        Libro("Libro de Medicina 6", "Descripción del libro 6", "06/06/2026"),
        Libro("Libro de Medicina 7", "Descripción del libro 7", "07/07/2027"),
        Libro("Libro de Medicina 8", "Descripción del libro 8", "08/08/2028"),
        Libro("Libro de Medicina 9", "Descripción del libro 9", "09/09/2029"),
        Libro("Libro de Medicina 10", "Descripción del libro 10", "10/10/2030")
    )

    Column(modifier = Modifier.padding(40.dp)) {
        Button(onClick = { mostrarLista = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "GENERAR LISTA")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (mostrarLista) {
            LazyColumn {
                items(listaDeTests) { test ->
                    TestCard(test)
                }
            }
        }
    }
}

@Composable
fun TestCard(test: Libro) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = test.titulo, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = test.descripcion, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Fecha de Publicación: ${test.fechaPublicacion}", fontSize = 14.sp)
        }
    }
}