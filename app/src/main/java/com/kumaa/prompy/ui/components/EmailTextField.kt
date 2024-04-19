package com.kumaa.prompy.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import com.kumaa.prompy.R

@Composable
fun EmailTextField(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = email,
        label = { Text(text = stringResource(R.string.email)) },
        onValueChange = {
            email = it
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
//            colors = OutlinedTextFieldDefaults.colors(MaterialTheme.colorScheme.primary)
    )
}