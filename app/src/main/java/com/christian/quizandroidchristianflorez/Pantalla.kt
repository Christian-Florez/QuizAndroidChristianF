package com.christian.quizandroidchristianflorez


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Preview(showSystemUi = true,  )

@Composable
fun Pantalla() {
    Column {
        Text(
            text ="Encabezado",
            fontSize = 20.sp,
            modifier = Modifier.
            background(Color.Magenta).
            padding( top = 10.dp)


        )
        Row {
            Text(
                text ="Item1",
                modifier = Modifier.
                padding(vertical = 50.dp)

            )
            Text(
                text ="Item2",
                modifier = Modifier.
                padding(vertical = 50.dp)

            )
            Text(
                text ="Item3",
                modifier = Modifier.
                padding(vertical = 50.dp)

            )




        }
        Text(
            text ="pie de pagina",
            modifier = Modifier.
            background(Color.Magenta).
            padding(10.dp)


        )




    }




}


