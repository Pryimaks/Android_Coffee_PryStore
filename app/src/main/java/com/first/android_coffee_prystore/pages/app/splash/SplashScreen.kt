package com.first.android_coffee_prystore.pages.app.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.first.android_coffee_prystore.ui.theme.PurpleGrey40

@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    onNavigationNext: () -> Unit
) {
 Scaffold(
     topBar = { TopBar() },
     content = {
         SplashScreenContent(
             modifier = Modifier.padding(it),
             onNavigationNext = onNavigationNext
         )
     }
 )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(){
    TopAppBar(title = {
        Text(
        text = "Splash",
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
        )},
        colors = TopAppBarDefaults.topAppBarColors(PurpleGrey40)
        )
}

@Composable
private fun SplashScreenContent(
    modifier: Modifier,
    onNavigationNext: () -> Unit
) {
 Column(
     modifier = modifier
 ) {
Text(
    text = "Splash screen",
    modifier = modifier.clickable{
        onNavigationNext.invoke()
    }
    )
 }
}

