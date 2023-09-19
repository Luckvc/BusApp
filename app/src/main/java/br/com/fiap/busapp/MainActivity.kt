package br.com.fiap.busapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.busapp.ui.screen.HomeScreen
import br.com.fiap.busapp.ui.screen.LinhasScreen
import br.com.fiap.busapp.ui.screen.MapaScreen
import br.com.fiap.busapp.ui.screen.ParadasScreen
import br.com.fiap.busapp.ui.theme.BusAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF222222)
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "home") {
                        composable(route = "home") { HomeScreen(navController) }
                        composable(route = "linhas") { LinhasScreen(navController) }
                        composable(route = "paradas") { ParadasScreen(navController) }
                        composable(route = "mapa") { MapaScreen(navController) }

                    }
                }
            }
        }
    }
}

