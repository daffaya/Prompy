package com.kumaa.prompy.ui.screen.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kumaa.prompy.R
import com.kumaa.prompy.ui.theme.Black
import com.kumaa.prompy.ui.theme.Primary

@Composable
fun OnBoarding2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp)) {
        Spacer(modifier = modifier.height(48.dp))
        Image(
            painter = painterResource(R.drawable.ic_onboarding_2_illustration),
            contentDescription = stringResource(R.string.onBoarding2Desc),
            modifier.size(343.dp)
            )
        Spacer(modifier = modifier.height(124.dp))
        Text(
            text = stringResource(R.string.onBoarding2Title),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            )
        Spacer(modifier = modifier.height(16.dp))
        Text(
            text = stringResource(R.string.onBoarding2Desc),
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = modifier.height(52.dp))
        TextButton(
            modifier = modifier
                .size(212.dp, 56.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Primary),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(R.string.getStarted),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                color = Black,
            )
        }
    }

}