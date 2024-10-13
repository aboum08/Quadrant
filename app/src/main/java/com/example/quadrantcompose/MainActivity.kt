package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrantcompose.ui.theme.Purple200
import com.example.quadrantcompose.ui.theme.Purple500
import com.example.quadrantcompose.ui.theme.Purple700
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme
import com.example.quadrantcompose.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                GreetingShow()

            }
        }
    }
}

@Composable
fun GreetingText(titre: String, contenu: String, backgroundcolor: androidx.compose.ui.graphics.Color, modifier: Modifier=Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundcolor)
            .padding(16.dp),
        contentAlignment = Alignment.Center

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = titre,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = contenu,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
@Composable
fun GreetingShow(modifier: Modifier=Modifier){
    Column(modifier=Modifier.padding(16.dp).fillMaxSize()
    ) {
        Row( modifier = Modifier.weight(1f)) {

            GreetingText(
                stringResource(R.string.titre1_text),
                stringResource(R.string.contenu1_text),
                backgroundcolor = Purple200
            )

            GreetingText(
                stringResource(R.string.titre2_text),
                stringResource(R.string.contenu2_text),
                backgroundcolor = Purple500
            )
        }
        Row (modifier = Modifier
            .weight(1f)
            .fillMaxSize()){
            GreetingText(
                stringResource(R.string.titre3_text),
                stringResource(R.string.contenu3_text),
                backgroundcolor = Purple700
            )

            GreetingText(
                stringResource(R.string.titre4_text),
                stringResource(R.string.contenu4_text),
                backgroundcolor = Teal200
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantComposeTheme {
        GreetingShow()
    }
}