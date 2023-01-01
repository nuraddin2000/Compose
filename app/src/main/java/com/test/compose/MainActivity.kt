package com.test.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.test.compose.ui.UserData
import com.test.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }

    }

    @Composable
    fun MainScreen() {
        val userData = UserData()

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(8.dp)
        ) {

            ProfileImage(userData.avatarUrl)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(text = "Firstname", modifier = Modifier.width(100.dp))
                Text(
                    text = userData.firstName,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(text = "Lastname", modifier = Modifier.width(100.dp))
                Text(
                    text = userData.lastName,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(
                    text = "Email", modifier = Modifier
                        .width(100.dp)
                )
                Text(
                    text = userData.email,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),

            ) {
                Text(
                    text = "Telephone", modifier = Modifier
                        .width(100.dp)

                )
                Text(
                    text = userData.telephone,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(
                    text = "Gender", modifier = Modifier
                        .width(100.dp)
                )
                Text(
                    text = userData.gender,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(
                    text = "CustomerNo", modifier = Modifier
                        .width(100.dp)
                )
                Text(
                    text = userData.customerNo,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
            ) {
                Text(
                    text = "IsAdmin", modifier = Modifier
                        .width(100.dp)
                )
                if (userData.isAdmin) {
                    Text(
                        text = "Yes",
                        color = Color.Black
                    )
                } else {
                    Text(
                        text = "No",
                        color = Color.Black
                    )
                }

            }
            Spacer(modifier = Modifier.fillMaxWidth().size(1.dp).padding(start = 4.dp, end = 4.dp).background(color = Color.LightGray))
        }
    }

    @Composable
    fun ProfileImage(avatarUrl: String) {

        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                shape = CircleShape,
                modifier = Modifier
                    .padding(8.dp)
                    .size(100.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(avatarUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .wrapContentSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeTheme {
            MainScreen()
        }
    }
}