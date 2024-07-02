package pe.idat.ec2_chavezmiguel

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    val listaDeLibros = listOf(
        Libro("Principios de Medicina Interna", "Un libro completo sobre los fundamentos de la medicina interna.", "01/01/2021"),
        Libro("Medicina Clínica", "Una guía práctica para el diagnóstico y tratamiento de enfermedades clínicas.", "02/02/2022"),
        Libro("Anatomía Humana", "Descripción detallada de la anatomía del cuerpo humano.", "03/03/2023"),
        Libro("Fisiología Médica", "Explicación de los procesos fisiológicos en el cuerpo humano.", "04/04/2024"),
        Libro("Farmacología Básica", "Información sobre los principales medicamentos y su uso.", "05/05/2025"),
        Libro("Microbiología Médica", "Estudio de los microorganismos y su relación con la salud humana.", "06/06/2026"),
        Libro("Patología General", "Análisis de las enfermedades y sus causas.", "07/07/2027"),
        Libro("Bioquímica Médica", "Relación entre la bioquímica y las funciones corporales.", "08/08/2028"),
        Libro("Diagnóstico por Imágenes", "Guía sobre el uso de técnicas de imagen en el diagnóstico médico.", "09/09/2029"),
        Libro("Medicina Preventiva", "Enfoques y estrategias para la prevención de enfermedades.", "10/10/2030")
    )

    Column(modifier = Modifier.padding(40.dp)) {
        Button(onClick = { mostrarLista = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "GENERAR LISTA")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (mostrarLista) {
            LazyColumn {
                items(listaDeLibros) { libro ->
                    LibroCard(libro)
                }
            }
        }
    }
}

@Composable
fun LibroCard(libro: Libro) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = libro.titulo, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = libro.descripcion, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Fecha de Publicación: ${libro.fechaPublicacion}", fontSize = 14.sp)
        }
    }
}
