package imageview

import androidx.compose.runtime.Composable

expect class ImageViewController() {
    @Composable
    fun imageView (image: String)
}