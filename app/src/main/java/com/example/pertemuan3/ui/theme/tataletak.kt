package com.example.pertemuan3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
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
fun LayoutBoxColumnRow(modifier: Modifier) {
    val image = painterResource(R.drawable.bg)
    val logo = painterResource(R.drawable.logo)
    val fotobulet = painterResource(R.drawable.ijulganteng)
    Column {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = image,
                contentDescription = "Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Login",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )

                Text(
                    text = "Ini adalah halaman login,",
                    fontSize = 14.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(30.dp))

                Image(
                    painter = logo,
                    contentDescription = "Logo UMY",
                    modifier = Modifier.size(150.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "Nama",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )

                Text(
                    text = "Izzul Maulanal Haqqi",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )

                Text(
                    text = "20240140166",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = fotobulet,
                    contentDescription = "Foto Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(250.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}
