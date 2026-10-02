package com.example.pertemuan3.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

@Composable

fun ColumnLayout(modifier: Modifier) {
    Column(modifier = modifier.padding(
        top = 20.dp,
        start = 20.dp,
        end = 20.dp)) {
        Text(text = "komponen 1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable

fun RowLayout(modifier: Modifier){
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "komponen1")
        Text(text = "komponen2")
        Text(text = "komponen3")
        Text(text = "komponen4")
    }
}

@Composable

fun BoxLayout(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column1")
        Text(text = "Row1")
        Text(text = "Row2")
        Text(text = "Box2")
        Text(text = "Column3")
    }
}

@Composable

fun LayoutColumnRow(modifier: Modifier){
    Column() {
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
        }
    }
}

