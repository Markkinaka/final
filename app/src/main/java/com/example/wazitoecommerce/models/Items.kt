package com.example.wazitoecommerce.models

import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.wazitoecommerce.data.ItemsViewModel

class Items {
        var name:String = ""
        var imageUrl:String = ""
        var id:String = ""

        constructor(name:  String, imageUrl: String, id: String) {
            this.name = name
            this.imageUrl = imageUrl
            this.id = id
        }

        constructor(
            name: SnapshotStateList<Items>,
            id: SnapshotStateList<Items>,
            ItemsRepository: Nothing?,
            ItemsImage: ItemsViewModel
        )

}