package com.bayarsahintekin.searchmusicdemo.ui.app

import android.view.Gravity
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TabItem(
    category: TabCategory,
    isSelected: Boolean = false,
    onSelectedCategoryChanged: (String) -> Unit,

) {
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = if (isSelected) MaterialTheme.colors.primary else MaterialTheme.colors.secondary
    ) {
        Row() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .clickable(onClick = { }) /*question = "3 Bananas required"*/
                    .clip(shape = RoundedCornerShape(16.dp))
                    .toggleable(
                        value = isSelected,
                        onValueChange = {
                            onSelectedCategoryChanged(category.value)
                        },
                    ),
            ) {
                Box(modifier = Modifier) {
                    Text(
                        text = category.title,
                        style = typography.body2,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}