package com.manquemavida.school.ui.components.imagesload

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import manqueapp.composeapp.generated.resources.Res
import manqueapp.composeapp.generated.resources.logo_manque
import manqueapp.composeapp.generated.resources.text_logo_drivin
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun ImagesLoadLogo(){
    Image(
        modifier = Modifier
            .fillMaxHeight(0.3f)
            .fillMaxWidth(0.5f),
        painter = painterResource(Res.drawable.logo_manque),
        contentScale = ContentScale.Crop,
        contentDescription = stringResource(Res.string.text_logo_drivin),
    )
}
