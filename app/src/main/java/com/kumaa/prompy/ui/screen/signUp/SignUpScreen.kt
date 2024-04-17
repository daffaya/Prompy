package com.kumaa.prompy.ui.screen.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.kumaa.prompy.R
import com.kumaa.prompy.ui.theme.Dark
import com.kumaa.prompy.ui.theme.Gray
import com.kumaa.prompy.ui.theme.Primary
import com.kumaa.prompy.ui.theme.shape

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    var fullName by remember {mutableStateOf(TextFieldValue("")) }
    var email by remember {mutableStateOf(TextFieldValue("")) }
    var password by remember {mutableStateOf(TextFieldValue("")) }
    var passwordVisible by rememberSaveable {mutableStateOf(false)}

    Column(
        modifier.padding(top = 32.dp, start = 32.dp, end = 32.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_signup_illustration),
            contentDescription = stringResource(R.string.signupIllustrationDesc),
            modifier
                .size(224.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier.height(16.dp))
        Text(
            text = stringResource(R.string.signup),
            modifier.align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black
        )
        Spacer(modifier.height(16.dp))
        OutlinedTextField(
            value = fullName,
            onValueChange = {fullName = it},
            label = { Text(text = stringResource(R.string.fullname))},
            modifier = modifier.fillMaxWidth(),
            singleLine = true,
        )
        Spacer(modifier.height(12.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = stringResource(R.string.email))},
            modifier = modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier.height(12.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = stringResource(R.string.password))},
            modifier = modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (passwordVisible) Icons.Outlined.Visibility else Icons.Outlined.VisibilityOff
                val description = if (passwordVisible) stringResource(R.string.hidepassword) else stringResource(
                    R.string.showpassword
                )
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector  = image, description,
                        modifier
                            .padding(end = 12.dp)
                            .size(20.dp))
                }
            }
        )
        Spacer(modifier.height(24.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier
                .size(width = 212.dp, height = 56.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Primary)
        )
        {
            Text(
                text = stringResource(R.string.signup),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Dark
                )
        }
        Spacer(modifier = modifier.height(12.dp))
        Text(
            text = stringResource(R.string.orcontinuewith),
            style = MaterialTheme.typography.titleSmall,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = modifier.height(24.dp))
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                modifier = modifier
                    .height(40.dp)
                    .width(144.dp),
                colors = ButtonDefaults.buttonColors(Gray),
                shape = shape.extraSmall,
                onClick = { /*TODO*/ }
            ) {
                Image(
                    painterResource(R.drawable.ic_google),
                    contentDescription = stringResource(R.string.google),
                    modifier = modifier
                        .size(16.dp)
                )
                Text(
                    text = stringResource(R.string.google),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                    color = Dark,
                    modifier = modifier.padding(start = 8.dp)
                )
            }
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
        Spacer(modifier = modifier.height(40.dp))
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),

            ) {
            Text(
                text = stringResource(R.string.alreadyhaveaccount),
                style = MaterialTheme.typography.labelMedium,
                modifier = modifier.padding(end = 12.dp)
            )
            ClickableText(
                text = AnnotatedString(stringResource(R.string.login)),
                style = MaterialTheme.typography.labelMedium
                    .copy(
                        color = Primary,
                        fontWeight = FontWeight.SemiBold,
                        shadow = Shadow(Dark, offset = Offset.Zero)
                    ),
                onClick = {
                    // Handle click action for "Create Now"
                    /*TODO*/
                }
            )
        }
    }
}