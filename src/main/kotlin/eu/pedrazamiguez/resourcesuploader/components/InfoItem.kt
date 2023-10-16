package eu.pedrazamiguez.resourcesuploader.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.TooltipArea
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun infoItem(tooltip: String, name: String, resource: String) {
    TooltipArea(tooltip = {
        Text(
            tooltip, modifier = Modifier.padding(16.dp), style = TextStyle(background = Color.White)
        )
    }) {
        Column(
            modifier = Modifier.padding(horizontal = 32.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(resource),
                contentDescription = tooltip,
                contentScale = ContentScale.Inside,
                modifier = Modifier.size(72.dp),

            )
            Text(
                name,
                modifier = Modifier.padding(top = 8.dp),
                style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold)
            )
        }
    }
}

@Preview
@Composable
fun previewInfoItem() {
    infoItem("Provider", "AWS", "images/aws.svg")
}