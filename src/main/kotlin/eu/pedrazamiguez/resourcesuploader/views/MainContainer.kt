package eu.pedrazamiguez.resourcesuploader.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import eu.pedrazamiguez.resourcesuploader.components.topBar

@Composable
fun mainContainer() = MaterialTheme {
    Column {
        topBar()
        Text("test1")
        Text("test2")
    }
}
