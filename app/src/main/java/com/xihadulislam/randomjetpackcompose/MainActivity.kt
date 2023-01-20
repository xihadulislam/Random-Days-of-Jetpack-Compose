package com.xihadulislam.randomjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xihadulislam.randomjetpackcompose.ui.theme.RandomjetpackcomposeTheme
import com.xihadulislam.randomjetpackcompose.ui.views.ImageCard
import com.xihadulislam.randomjetpackcompose.ui.views.ShowFunnyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RandomjetpackcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .padding(12.dp)
                    ) {
                        ImageCard(
                            painter = painterResource(id = R.drawable.image),
                            contentDescription = "",
                            title = "Bangladesh, to the east of India on the Bay of Bengal"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun UserCardList() {
    LazyRow {
        items((1..10).toList()) { user ->
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(12.dp)
            ) {
                ImageCard(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "",
                    title = "Bangladesh, to the east of India on the Bay of Bengal"
                )
            }
        }
    }
}


@Composable
fun UserList() {

//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        for (i in 1..10) {
//            UserCard()
//        }
//    }

    LazyColumn {
        items((1..20).toList()) { user ->
            UserCard()
        }
    }

}


@Composable
fun UserCard() {
    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
            .border(width = 1.dp, color = Color.Gray)
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(6.dp))

        Column(modifier = Modifier.padding(6.dp)) {

            Text(text = "Xihad Islam", fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.padding(6.dp))

            Text(text = stringResource(id = R.string.dummy))

            Spacer(modifier = Modifier.padding(8.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = "View Profile")
            }
        }
    }
}


@Composable
fun Greeting(name: String) {

    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        fontSize = 32.sp,
        color = colorResource(R.color.purple_700),
        fontFamily = FontFamily.Cursive,
        modifier = Modifier.clickable {
            Toast.makeText(context, "you click me ", Toast.LENGTH_SHORT).show()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(Modifier.fillMaxSize()) {
        ShowFunnyText()
    }
}