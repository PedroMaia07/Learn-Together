package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                InitialScreen(stringResource(R.string.jetpack_compose_tutorial),
                    stringResource(R.string.introduction_compose),
                    stringResource(R.string.text_compose)
                )

            }
        }
    }
}

@Composable
fun InitialScreen(
    title:String,
     introduction: String,
     text:String,
     modifier: Modifier = Modifier)
{
    Scaffold (
        Modifier.fillMaxSize()
    ){ innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding),
        ){
            Image(
                painter = painterResource(R.drawable.bg_compose_background),
                contentDescription = null,
            )
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = introduction,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify,
            )
            Text(
                text = text,
                fontSize = 16.sp,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        InitialScreen(stringResource(R.string.jetpack_compose_tutorial),
            stringResource(R.string.introduction_compose),
            stringResource(R.string.text_compose)
        )
    }
}