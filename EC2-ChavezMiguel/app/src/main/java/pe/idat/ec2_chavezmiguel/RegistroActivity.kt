package pe.idat.ec2_chavezmiguel

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun registro(navController: NavController) {
    var dni by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var sexo by remember { mutableStateOf("Hombre") }
    var hobbies by remember { mutableStateOf(setOf<String>()) }
    var otroHobby by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(35.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "INFORMACIÓN",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        TextField(
            value = dni,
            onValueChange = { dni = it },
            label = { Text("DNI") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") }
        )

        TextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            label = { Text("Apellidos") }
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation()
        )

        Text("Sexo:")
        Row {
            RadioButton(
                selected = sexo == "Hombre",
                onClick = { sexo = "Hombre" }
            )
            Text("Hombre", modifier = Modifier.padding(end = 8.dp))
            RadioButton(
                selected = sexo == "Mujer",
                onClick = { sexo = "Mujer" }
            )
            Text("Mujer")
        }

        Text("Hobbies:")
        Row {
            Checkbox(
                checked = hobbies.contains("Deporte"),
                onCheckedChange = {
                    hobbies = if (it) {
                        hobbies + "Deporte"
                    } else {
                        hobbies - "Deporte"
                    }
                }
            )
            Text("Deporte", modifier = Modifier.padding(end = 8.dp))

            Checkbox(
                checked = hobbies.contains("Pintura"),
                onCheckedChange = {
                    hobbies = if (it) {
                        hobbies + "Pintura"
                    } else {
                        hobbies - "Pintura"
                    }
                }
            )
            Text("Pintura", modifier = Modifier.padding(end = 8.dp))

            Checkbox(
                checked = hobbies.contains("Otro"),
                onCheckedChange = {
                    hobbies = if (it) {
                        hobbies + "Otro"
                    } else {
                        hobbies - "Otro"
                    }
                }
            )
            Text("Otro")
        }

        TextField(
            value = otroHobby,
            onValueChange = { otroHobby = it },
            label = { Text("Ingrese otro hobby") }
        )

        
}
