package com.kumaa.prompy.ui.screen.login

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.core.content.ContextCompat.startActivity
import com.kumaa.prompy.R
import com.kumaa.prompy.ui.components.EmailTextField
import com.kumaa.prompy.ui.components.FacebookButton
import com.kumaa.prompy.ui.components.GoogleButton
import com.kumaa.prompy.ui.components.PasswordTextField
import com.kumaa.prompy.ui.theme.Dark
import com.kumaa.prompy.ui.theme.Gray
import com.kumaa.prompy.ui.theme.Primary
import com.kumaa.prompy.ui.theme.shape

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 12.dp, start = 32.dp, end = 32.dp)
//            .background(color = Gray),
    ) {
        Spacer(modifier = modifier.height(10.dp))
        Image(
            painter = painterResource(R.drawable.ic_login_illustration),
            contentDescription = stringResource(R.string.loginIllustrationDesc),
            modifier
                .size(264.dp)
                .align(Alignment.CenterHorizontally),
        )
        Text(
            modifier = modifier
                .padding(top = 16.dp)
                .align(Alignment.CenterHorizontally),
            text = stringResource(R.string.login),
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = modifier.height(16.dp))
        EmailTextField()
        Spacer(modifier = modifier.height(12.dp))
        PasswordTextField()
        ClickableText(
            text = AnnotatedString(stringResource(R.string.forgotpassword)),
            style = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.onSurface),
            modifier = modifier
                .padding(top = 8.dp)
                .align(Alignment.End),
            onClick = {/*TODO*/}
        )
        Spacer(modifier = modifier.height(32.dp))
        Button(
            modifier = modifier
                .height(56.dp)
                .width(212.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Primary),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(R.string.login),
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
            GoogleButton()
            FacebookButton()
        }
        Spacer(modifier = modifier.height(40.dp))
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),

        ) {
            Text(
                text = stringResource(R.string.donthaveaccount),
                style = MaterialTheme.typography.labelMedium,
                modifier = modifier.padding(end = 12.dp)
            )
            ClickableText(
                text = AnnotatedString(stringResource(R.string.createnow)),
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