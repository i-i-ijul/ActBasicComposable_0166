package com.example.pertemuan3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pertemuan3.R

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
            Text(text = "komponen1baris1")
            Text(text = "komponen2baris1")
            Text(text = "komponen3baris1")
        }
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "komponen1baris2")
            Text(text = "komponen2baris2")
            Text(text = "komponen3baris2")
        }
    }
}

@Composable
fun LayoutRowColumn(modifier: Modifier){
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Column() {
            Text(text = "komponen1kolom1")
            Text(text = "komponen2kolom1")
            Text(text = "komponen3kolom1")
        }
        Column() {
            Text(text = "komponen1kolom2")
            Text(text = "komponen2kolom2")
            Text(text = "komponen3kolom2")
        }
    }
}

@Composable
fun LayoutBoxColumnRow(modifier: Modifier){
    val image = painterResource(R.drawable.ijulganteng)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color.Gray),
            contentAlignment = Alignment.Center
        ){
            Column() {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "ColSatu_Row1_komponen1")
                    Text(text = "colSatu_Row1_komponen2")
                    Text(text = "colSatu_Row1_komponen3")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                   Text(text = "ColSatu_Row2_komponen1")
                   Text(text = "ColSatu_Row2_komponen2")
                    Text(text = "ColSatu_Row2_komponen3")
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Favorite Music Gwah",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(
                    alignment = Alignment.Center
                )
            )
        }
    }
}

