import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import eu.pedrazamiguez.resourcesuploader.views.mainContainer

fun main() = application {
    Window(
        title = "Resources Uploader",
        state = WindowState(width = 1080.dp, height = 720.dp),
        resizable = false,
        onCloseRequest = ::exitApplication
    ) {
        mainContainer()
    }
}
