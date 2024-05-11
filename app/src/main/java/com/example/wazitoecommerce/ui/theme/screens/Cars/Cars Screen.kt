package com.example.wazitoecommerce.ui.theme.Cars

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.wazitoecommerceTheme

@Composable
fun CarsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Row {

            Image(
                painter = painterResource(id = R.drawable.bugatti),
                contentDescription = "gojo",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.bugat),
                contentDescription = "gojo",
                modifier = Modifier.size(200.dp)
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        Row {

            Image(
                painter = painterResource(id = R.drawable.bugat),
                contentDescription = "gojo",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "gojo",
                modifier = Modifier.size(200.dp)
            )

        }



    }


}



@Composable
@Preview(showBackground = true)
fun CarsScreenPreview(){
    wazitoecommerceTheme {
        CarsScreen(navController = rememberNavController())
    }
}