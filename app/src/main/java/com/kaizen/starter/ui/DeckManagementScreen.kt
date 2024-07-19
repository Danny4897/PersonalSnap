package com.mygame.marvelsnapclone.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.IconButton
import androidx.compose.material.Icon
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DeckManagementScreen(navController: NavHostController) {
    val decks = listOf("Deck 1", "Deck 2", "Deck 3") // Replace with actual deck data

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("create_deck")/* Navigate to Create Deck Screen */ }) {
                Icon(Icons.Filled.Add, contentDescription = "Create Deck")
            }
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(
                text = "Your Decks",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(16.dp)
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(decks) { deck ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        elevation = 2.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = deck, modifier = Modifier.weight(1f))
                            IconButton(onClick = { /* Navigate to Edit Deck Screen */ }) {
                                Icon(Icons.Filled.Edit, contentDescription = "Edit Deck")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeckManagementScreenPreview() {
    MarvelSnapTheme {
        DeckManagementScreen(rememberNavController())
    }
}