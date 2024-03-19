package dev.madad.animepub.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.madad.animepub.ui.theme.AnimepubTheme

@Composable
fun AnimeListScreen() {

}

@Preview(
    showSystemUi = true,
    showBackground = true,
    device = "id:pixel_6"
)
@Composable
fun PreviewAnimeListScreen() {
    AnimepubTheme {
        AnimeListScreen()
    }
}