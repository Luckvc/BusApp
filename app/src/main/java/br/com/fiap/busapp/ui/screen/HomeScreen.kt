package br.com.fiap.busapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun HomeScreen() {
    Box(Modifier.background(Color(0xff222222))){
        Column {
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(128.dp)
                    .background(Color(0xFFA5ECD7))
                    .padding(24.dp)
                    ) {
                Text(
                    text = "Olá, Usuário",
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            }
            Column(modifier = Modifier.padding(24.dp)) {

                Spacer(modifier = Modifier.height(64.dp))

                OutlinedTextField(
                    value = "Usar minha localização atual",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Origem", fontSize = (16.sp))},
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
                Spacer(modifier = Modifier.height(24.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Destino")},
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
                Spacer(modifier = Modifier.height(24.dp))
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA5ECD7)), modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .align(alignment = Alignment.End)){
                    Text(text = "Buscar", fontWeight = FontWeight.Bold, fontSize = (20.sp), color = Color.Black)
                }


                Spacer(modifier = Modifier.height(60.dp))
                Card(colors = CardDefaults.cardColors(containerColor = Color(0x1AFFFFFF)),
                    modifier = Modifier
                        .fillMaxWidth()){
                    Column(modifier = Modifier.padding(24.dp)) {
                        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA5ECD7)), modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)){
                            Text(text = "Linhas", fontWeight = FontWeight.Bold, fontSize = (20.sp), color = Color.Black)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA5ECD7)), modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)) {
                            Text(text = "Paradas", fontWeight = FontWeight.Bold, fontSize = (20.sp), color = Color.Black)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA5ECD7)), modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)) {
                            Text(text = "Mapa", fontWeight = FontWeight.Bold, fontSize = (20.sp), color = Color.Black)
                        }

                    }


                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    HomeScreen()
}