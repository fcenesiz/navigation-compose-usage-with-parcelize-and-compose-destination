package com.fcenesiz.navigationcomposeusagewithparcelize.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fcenesiz.navigationcomposeusagewithparcelize.data.User
import com.fcenesiz.navigationcomposeusagewithparcelize.presentation.destinations.ProfileScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import java.time.LocalDateTime


@Destination(start = true)
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        Text(text = "Login Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navigator.navigate(
                    ProfileScreenDestination(
                        User(
                            name = "Fatih Cenesiz",
                            id = "userId",
                            created = LocalDateTime.now()
                        )
                    )
                )
            }
        ) {
            Text(text = "Go to Profile Screen")
        }
    }
}