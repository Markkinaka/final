package com.example.wazitoecommerce.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.ItemsViewModel
import com.example.wazitoecommerce.models.Items
import com.example.wazitoecommerce.ui.theme.wazitoecommerceTheme

@Composable
fun ViewItemsScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var itemsRepository = ItemsViewModel(navController, context)


        val emptyItemsState = remember { mutableStateOf(Items("","","",)) }
        var emptyItemsListState = remember { mutableStateListOf<Items>() }


        var Items = itemsRepository.Items(emptyItemsState, emptyItemsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All Items",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(Items){
                    val ItemsRepository = null
                    Items(
                        name = Items,
                        id = Items,
                        ItemsRepository = ItemsRepository,
                        ItemsImage = itemsRepository
                    )
                }
            }
        }
    }
}

fun items(items: SnapshotStateList<Items>, itemContent: @Composable() (LazyItemScope.(index: Int) -> Unit)) {
    TODO("Not yet implemented")
}


@Composable
fun Items(name:String, id:String,
          navController:NavHostController,
          ItemsRepository: ItemsViewModel, ItemsImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Image(
            painter = rememberAsyncImagePainter(ItemsImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            ItemsRepository.deleteItems(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PRODUCTS+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewItemsScreenPreview(){
    wazitoecommerceTheme {
        ViewItemsScreen(navController = rememberNavController())
    }
}