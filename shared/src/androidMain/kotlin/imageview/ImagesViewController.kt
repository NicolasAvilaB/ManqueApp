package imageview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

actual class ImageViewController actual constructor() {

    @Composable
    actual fun imageView(image: String){
        val painter = rememberAsyncImagePainter(image)

        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .fillMaxHeight(0.83f)
                .clip(shape = RoundedCornerShape(11.dp)),
            contentScale = ContentScale.Crop
        )
    }
}