package com.kumaa.prompy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kumaa.prompy.R
import com.kumaa.prompy.ui.theme.Dark
import com.kumaa.prompy.ui.theme.Gray
import com.kumaa.prompy.ui.theme.shape

@Composable
fun FacebookButton(modifier: Modifier = Modifier) {
    Button(
        modifier = modifier
            .height(40.dp)
            .width(144.dp),
        colors = ButtonDefaults.buttonColors(Gray),
        shape = shape.extraSmall,
        onClick = { /*TODO*/ }
    ) {
        Image(
            painterResource(R.drawable.ic_facebook),
            contentDescription = stringResource(R.string.facebook),
            modifier = modifier
                .size(16.dp)
        )
        Text(
            text = stringResource(R.string.facebook),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium,
            color = Dark,
            modifier = modifier.padding(start = 8.dp)
        )
    }
}