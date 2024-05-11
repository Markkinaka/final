package com.example.wazitoecommerce

import com.google.firebase.database.Exclude

data class Employees(
    @Exclude var patientID: String? = "",
    var patientName: String? = "",
    var patientEmail: String? = "",

)
