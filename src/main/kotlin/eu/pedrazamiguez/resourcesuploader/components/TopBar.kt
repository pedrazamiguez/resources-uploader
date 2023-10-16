package eu.pedrazamiguez.resourcesuploader.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun topBar() {
    var connected by remember { mutableStateOf(false) }
    var loading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    Box {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().background(
                color = if (connected) {
                    Color(0xff2a9d8f)
                } else {
                    Color(0xffe76f51)
                }
            ).padding(16.dp)
        ) {
            Row {
                infoItem("Provider", "AWS", "images/aws.svg")
                infoItem("Service", "S3", "images/s3.svg")
                infoItem("Bucket", "images", "images/bucket.svg")
                infoItem("User", "pedrazamiguez", "images/user.svg")
                infoItem("Connection time", "1:34", "images/clock.svg")

            }
            Button(
                onClick = {

                    if (!connected) {
                        loading = true
                        scope.launch {
                            loadProgress { _ ->
                                //currentProgress = progress
                            }
                            loading = false
                            connected = true
                        }
                    } else {
                        connected = false
                    }

                },
                enabled = !loading,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff264653), contentColor = Color.White)
            ) {
                Text(
                    if (connected) {
                        "Disconnect"
                    } else {
                        "Connect"
                    }
                )
            }

        }

        if (loading) {
            LinearProgressIndicator(color = Color(0xff264653), modifier = Modifier.fillMaxWidth())
        }
    }
}

suspend fun loadProgress(updateProgress: (Float) -> Unit) {
    for (i in 1..100) {
        updateProgress(i.toFloat() / 100)
        delay(10)
    }
}