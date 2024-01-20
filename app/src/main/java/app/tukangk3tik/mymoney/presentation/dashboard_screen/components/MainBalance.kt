package app.tukangk3tik.mymoney.presentation.dashboard_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import app.tukangk3tik.mymoney.R

@Composable
fun MainBalance(
    currency: String,
    mainBalanceAmount: String,
    message: Int,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "$currency $mainBalanceAmount",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = stringResource(id = message),
            fontWeight = FontWeight.Light
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 100
)
@Composable
fun MainBalancePreview() {
    MainBalance(
        currency = "Rp",
        mainBalanceAmount = "9.000",
        message = R.string.main_balance_message
    )
}