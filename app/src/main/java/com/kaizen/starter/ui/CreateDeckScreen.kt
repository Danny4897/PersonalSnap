package com.kaizen.starter.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mygame.marvelsnapclone.ui.theme.MarvelSnapTheme


@Composable
fun CreateDeckScreen(navController: NavHostController) {
    var deckName by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Create New Deck") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            OutlinedTextField(
                value = deckName,
                onValueChange = { deckName = it },
                label = { Text("Deck Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Button(
                onClick = { /* Handle deck creation */ },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Create Deck")
            }
            // Add UI for selecting cards (e.g., a button to navigate to CardListScreen)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateDeckScreenPreview() {
    MarvelSnapTheme {
        CreateDeckScreen(rememberNavController())
    }
}