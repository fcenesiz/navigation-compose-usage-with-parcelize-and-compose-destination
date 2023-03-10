package com.fcenesiz.navigationcomposeusagewithparcelize.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.fcenesiz.navigationcomposeusagewithparcelize.data.User
import com.fcenesiz.navigationcomposeusagewithparcelize.presentation.destinations.PostScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ProfileScreen(
    navigator: DestinationsNavigator,
    user: User
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Profile Screen: $user",
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {
                navigator.navigate(
                    PostScreenDestination()
                )
            }
        ) {
            Text(text = "Go to Post Screen")
        }
    }
}