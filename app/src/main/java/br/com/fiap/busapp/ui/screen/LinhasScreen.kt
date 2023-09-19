package br.com.fiap.busapp.ui.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.busapp.model.Linha
import br.com.fiap.busapp.service.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LinhasScreen(navController: NavHostController) {

    var buscaState = remember {
        mutableStateOf("")
    }
    var linhasListState = remember {
        mutableStateOf(listOf<Linha>())
    }

    val linhas = arrayOf<String>("6L01-10", "6L01-22", "6L01-23", "6L02-10", "6L03-10", "6L04-10", "6L04-41", "6L04-42", "6L05-10", "6L05-21", "6L07-10", "6L08-10", "6L10-10", "6L10-41", "6L11-10", "106A-10", "107T-10", "118C-10", "118Y-10", "119C-10", "119L-10", "121G-10", "128Y-10", "129F-10", "129F-41", "139A-10", "148L-10", "148P-10", "172J-10", "172K-10", "172N-10", "172P-10", "172R-10", "172U-10", "172X-10", "172Y-10", "174M-10", "175P-10", "175T-10", "177H-10", "177H-21", "177Y-10", "178A-10", "178L-10", "178T-10", "178Y-10", "178Y-21", "179X-10", "189L-10", "199D-10", "208M-10", "208V-10", "209P-10", "209P-10", "211L-10", "211V-10", "213E-10", "233A-10", "233C-10", "253F-10", "263C-10", "263J-10", "271A-10", "271A-51", "271C-10", "271F-10", "271M-10", "271P-10", "272N-10", "273D-10", "273F-10", "273G-10", "273G-21", "273J-10", "273L-10", "273N-10", "273N-41", "273R-10", "273R-42", "273V-10", "273X-10", "274P-10", "278A-10", "297A-10", "307C-10", "311C-10", "312N-10", "314J-10", "314V-10", "342C-10", "342M-10", "342N-10", "351F-10", "352A-10", "354M-10", "364A-10", "372F-10", "372U-10", "373L-10", "373M-10", "373T-10", "374M-10", "374V-10", "390E-10", "390E-41", "390E-42", "403A-10", "407A-10", "407E-10", "407F-10", "407G-10", "407H-10", "407I-10", "407I-21", "407J-10", "407K-10", "407L-10", "407M-10", "407N-10", "407P-10", "407R-10", "407T-10", "407W-10", "407Y-10", "408A-10", "414P-10", "425E-10", "475M-10", "475R-10", "476A-10", "476G-10", "476G-41", "476L-10", "477A-10", "477P-10", "477U-10", "478P-10", "502J-10", "502J-21", "502J-22", "502J-23", "507T-10", "508L-10", "509J-10", "509M-10", "513C-10", "513C-31", "513L-10", "514T-10", "516N-10", "517J-10", "519M-10", "524L-10", "524M-10", "527R-10", "546A-10", "546A-31", "546J-10", "546J-31", "546J-41", "546L-10", "546L-41", "546T-10", "573A-10", "573H-10", "573T-10", "573T-31", "574A-10", "574A-21", "574C-10", "574J-10", "574R-10", "574W-10", "575A-10", "575C-10", "576C-10", "576M-10", "577T-10", "605A-10", "607A-10", "607A-21", "607C-10", "607M-10", "609F-10", "609F-21", "609J-10", "627J-10", "637A-10", "637A-21", "637A-22", "637A-25", "637A-26", "637G-10", "637G-51", "637J-10", "637P-10")


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
                Row {
                    OutlinedTextField(
                        value = buscaState.value,
                        onValueChange = {buscaState.value = it},
                        modifier = Modifier.width(300.dp),
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
                    IconButton(modifier = Modifier.size(80.dp), onClick = {
                        val call = RetrofitFactory().getLinhas().getLinhas(buscaState.value)
                        call.enqueue(object : Callback<List<Linha>>{
                            override fun onResponse(
                                call: Call<List<Linha>>,
                                response: Response<List<Linha>>
                            ) {
                                Log.i("Busca-Linha", "OnResponse: ${response.body()}")
                            }

                            override fun onFailure(call: Call<List<Linha>>, t: Throwable) {
                                Log.i("Busca-Linha", "OnResponse: ${t.message}")
                            }

                        })
                    }) { Icon(imageVector = Icons.Default.Search, contentDescription="", tint = Color.White, modifier = Modifier.size(100.dp))

                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                LazyColumn {
                    items(linhas){
                        Text(text = "Linha: $it", modifier = Modifier.padding(8.dp), color = Color.White)

                    }
                }


            }
        }
    }
}



//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LinhasPreview() {
//    LinhasScreen(navController = NavHostController())
//}