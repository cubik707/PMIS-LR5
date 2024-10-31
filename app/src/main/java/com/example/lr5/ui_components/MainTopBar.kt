package com.example.lr5.ui_components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title: String,drawerState: DrawerState) {
    val coroutine= rememberCoroutineScope()
    TopAppBar(
        title = {
            Text(text=title)
        },
        navigationIcon ={
            IconButton(onClick = { //нажатие на кнопку навигации открывает
                coroutine.launch { //выдвижную панель
                    drawerState.open()
                }
            }
            ) {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite"
                )
            }
        }
    )
}