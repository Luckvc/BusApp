package br.com.fiap.busapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
fun Linhas() {
    Box(Modifier.background(Color(0xff222222))){
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color(0xFFA5ECD7))
            ) {
                Text(
                    text = "Linhas",
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            }
            Column(modifier = Modifier.padding(24.dp)) {

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Buscar", fontSize = (16.sp))},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color(0x1AFFFFFF),
                        disabledTextColor = Color.White,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        focusedBorderColor = Color(0xFFA5ECD7),
                        unfocusedBorderColor = Color(0xFFA5ECD7),
                        focusedLabelColor = Color(0xFFA5ECD7),
                        unfocusedLabelColor = Color(0xFFA5ECD7)
                    )
                )

                Spacer(modifier = Modifier.height(32.dp))

                LazyColumn() {
                    items(50){
                        Text(text = "Parada $it", modifier = Modifier.padding(8.dp), color = Color.White)

                    }
                }


            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LinhasPreview() {
    Linhas()
}