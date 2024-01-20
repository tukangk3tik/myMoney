package app.tukangk3tik.mymoney.presentation.dashboard_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.tukangk3tik.mymoney.R

@Composable
fun CardInOut(
    icon: ImageVector,
    label: Int,
    currency: String,
    amount: String,
) {
    Card(
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        CardInOutContent(
            icon = icon,
            label = label,
            currency = currency,
            amount = amount,
        )
    }
}

@Composable
fun CardInOutContent(
    icon: ImageVector,
    label: Int,
    currency: String,
    amount: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 5.dp)
            )
            Text(
                text = stringResource(id = label),
                fontWeight = FontWeight.Light
            )
        }
        Text(
            text = "$currency $amount",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
        )
    }
}

@Preview(
    showBackground = false,
    widthDp = 150,
    heightDp = 90
)
@Composable
fun CardInOutPreview() {
    CardInOut(
        icon = Icons.Filled.KeyboardArrowDown,
        label =  R.string.net_income,
        currency = "Rp",
        amount = "10.000",
    )
}