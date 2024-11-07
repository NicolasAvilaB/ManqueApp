package imageview

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import coil3.compose.AsyncImage

actual class ImageViewController actual constructor() {

    @Composable
    actual fun imageView(image: String) {
        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier.clip(MaterialTheme.shapes.small),
            contentScale = Crop
        )
    }
}