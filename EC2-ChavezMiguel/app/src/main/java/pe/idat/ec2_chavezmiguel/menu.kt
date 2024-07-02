package pe.idat.ec2_chavezmiguel

import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MenuScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 25.dp)
    ) {
        Column {
            Text(
                text = "EC02 MOBILESII",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            MySpace(16)

            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("pregunta#1")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp) // Padding horizontal para el botón
            ) {
                Text(text = "REGISTRO",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
            MySpace(16)
            Button(
                onClick = {
                    navController.navigate("pregunta#2")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF83B1EF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp) // Padding horizontal para el botón
            ) {
                Text(text = "LISTADO")
            }
            MySpace(16)
        }
    }
}
