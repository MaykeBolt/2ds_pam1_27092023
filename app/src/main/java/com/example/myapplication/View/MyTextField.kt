package com.example.myapplication.View

import android.util.Log
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField() {

    var myTextFieldValue by remember {
        mutableStateOf("vlrinit")
    }
    
    TextField(value = myTextFieldValue, onValueChange = {
        myTextFieldValue = it
        Log.i("###",it)
    })
}