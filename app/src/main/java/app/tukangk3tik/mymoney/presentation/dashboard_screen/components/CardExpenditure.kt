package app.tukangk3tik.mymoney.presentation.dashboard_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.tukangk3tik.mymoney.domain.entity.Expenditure

@Composable
fun CardExpenditure (
   expenditure: Expenditure
) {
    Card(
    ) {
        CardExpenditureContent(expenditure = expenditure)
    }
}

@Composable
fun CardExpenditureContent(
    expenditure: Expenditure
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Card(
            modifier = Modifier.weight(1F)
        ) {
            Icon(
                imageVector = expenditure.icon,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        Column(
            modifier = Modifier
                .weight(3F)
                .padding(horizontal = 8.dp)
        ) {
            Text(
                text = expenditure.name,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = expenditure.date,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
            )
        }
        Text(
            text = expenditure.amount,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End
            ),
            modifier = Modifier.weight(2F)
        )
    }
}

@Preview(
    showBackground = false,
    widthDp = 320,
    heightDp = 70
)
@Composable
fun CardExpenditurePreview() {
    val expenditure = Expenditure(
        icon = Icons.Filled.Home,
        name = "Pay Electricity Bills",
        type = "Home",
        date = "20 Jan 2024",
        amount = "Rp 10.000"
    )
    CardExpenditure(expenditure = expenditure)
}