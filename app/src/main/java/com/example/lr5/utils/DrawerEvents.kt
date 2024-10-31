package com.example.lr5.utils

sealed class DrawerEvents {
    data class OnItemClick(val title: String,val index:Int): DrawerEvents()
}
