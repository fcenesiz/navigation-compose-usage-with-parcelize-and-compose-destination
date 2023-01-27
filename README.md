### app plugin

````groovy
id 'org.jetbrains.kotlin.jvm' version '1.8.0' apply false
````

### module plugins

````groovy
id 'kotlin-parcelize'
id 'com.google.devtools.ksp' version '1.8.0-1.0.9'
````

### dependency

````groovy
implementation "androidx.navigation:navigation-compose:2.5.3"
implementation 'io.github.raamcosta.compose-destinations:core:1.8.33-beta'
ksp 'io.github.raamcosta.compose-destinations:ksp:1.8.33-beta'
````

### extensionVersion

````groovy
kotlinCompilerExtensionVersion '1.4.0'
````

<img src="nav-cont-parc.gif" width=40%>

### navigation

after adding ``@Destination`` notation need to rebuild project.

````kotlin
// NavGraphs object generated by dependency 
DestinationsNavHost(navGraph = NavGraphs.root)
````

### simple screen example

````kotlin
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
````