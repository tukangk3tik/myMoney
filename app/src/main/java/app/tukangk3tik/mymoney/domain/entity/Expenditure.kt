package app.tukangk3tik.mymoney.domain.entity

import androidx.compose.ui.graphics.vector.ImageVector

data class Expenditure(
    val icon: ImageVector,
    val name: String,
    val type: String,
    val date: String,
    val amount: String,
)
