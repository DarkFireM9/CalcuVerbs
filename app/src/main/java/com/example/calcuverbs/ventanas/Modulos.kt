package com.example.calcuverbs.ventanas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModulesScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Modules") },
                actions = {
                    TextButton(onClick = { /* Acción de cancelar */ }) {
                        Text("Cancel", color = Color.White)
                    }
                },
                //backgroundColor = Color(0xFF007DAE)
            )
        }
    ) { padding ->
        ModulesContent(Modifier.padding(padding))
    }
}

@Composable
fun ModulesContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF007DAE)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Crear dos columnas para los botones
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                ModuleButton("M1.A")
                ModuleButton("M2.A")
                ModuleButton("M3.A")
                ModuleButton("M4.A")
            }
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                ModuleButton("M1.B")
                ModuleButton("M2.B")
                ModuleButton("M3.B")
                ModuleButton("M4.B")
            }
        }
    }
}

@Composable
fun ModuleButton(text: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(100.dp)
            .background(Color.White, CircleShape)
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ModulesScreenPreview() {
    ModulesScreen()
}
