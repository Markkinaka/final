package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.VIEW_ITEMS_URL
import com.example.wazitoecommerce.ui.theme.wazitoecommerceTheme
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL


@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,



    ) {


        Text(
            text = "WELCOME TO LOPIN" ,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(30.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {

            Row {
                Image(
                    painter = painterResource(id = R.drawable.dripster),
                    contentDescription = "german",
                    modifier = Modifier
                        .size(200.dp)


                )

                Spacer(modifier = Modifier.height(30.dp))

                Image(
                    painter = painterResource(id = R.drawable.fave),
                    contentDescription = "gojo",
                    modifier = Modifier.size(200.dp)
                )


            }

            
            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Image(
                    painter = painterResource(id = R.drawable.dripster),
                    contentDescription = "german",
                    modifier = Modifier.size(200.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.fave),
                    contentDescription = "gojo",
                    modifier = Modifier.size(200.dp)
                )

            }

        }



        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(LOGIN_URL)
        }) {
            Text(text = "TO LOGIN")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(SIGNUP_URL)
        }) {
            Text(text = "SIGN UP")
        }


    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    wazitoecommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}