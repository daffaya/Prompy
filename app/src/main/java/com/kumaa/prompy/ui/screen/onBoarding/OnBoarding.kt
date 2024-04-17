package com.kumaa.prompy.ui.screen.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kumaa.prompy.R
import com.kumaa.prompy.ui.theme.Black
import com.kumaa.prompy.ui.theme.Primary

@Composable
fun OnBoarding(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp)
    ){
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = modifier.fillMaxWidth()
        ){
            ClickableText(
                style = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.onSurface),
                text = AnnotatedString(stringResource(R.string.skip)),
                onClick = { /*TODO*/ },
            )
        }
        Spacer(modifier = modifier.height(24.dp))
        Image(
            painter = painterResource(R.drawable.ic_onboarding_1_illustration),
            contentDescription = stringResource(R.string.onBoardingIllustration),
            Modifier.size(343.dp)
        )
        Spacer(modifier = modifier.height(80.dp))
        Text(
            text = stringResource(R.string.onBoarding1Title),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            modifier = modifier.padding(top = 16.dp),
            text = stringResource(R.string.onBoarding1Desc),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = modifier.height(42.dp))
        TextButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(Primary),
            modifier = modifier
                .size(212.dp, 56.dp)
                .align(Alignment.CenterHorizontally)
            ,
        ) {
            Text(
                text = stringResource(R.string.next),
                color = Black,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}