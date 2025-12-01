package com.samridhi.vridapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.samridhi.vridapp.navigation.AppNavGraph
import com.samridhi.vridapp.navigation.AppNavigationActions
import com.samridhi.vridapp.ui.theme.VridAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VridAppTheme {
                VridApp(
                    onNavigationEnd = {
                        finish()
                    }
                )
            }
        }
    }
}

@Composable
fun VridApp(
    onNavigationEnd: () -> Unit,
) {
    val navController = rememberNavController()
    val navActions: AppNavigationActions = remember(navController) {
        AppNavigationActions(navController, onNavigationEnd)
    }
    AppNavGraph(
        navController = navController,
        navActions = navActions
    )
}

