package com.kumaa.prompy.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import com.kumaa.prompy.R

@Composable
fun FullNameTextField(modifier: Modifier = Modifier) {
    var fullName by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = fullName,
        onValueChange = {fullName = it},
        label = { Text(text = stringResource(R.string.fullname)) },
        modifier = modifier.fillMaxWidth(),
        singleLine = true,
    )
}