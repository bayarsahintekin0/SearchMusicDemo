package com.bayarsahintekin.searchmusicdemo.ui.app

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bayarsahintekin.searchmusicdemo.data.model.Result
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bayarsahintekin.searchmusicdemo.ui.theme.Purple200
import com.bayarsahintekin.searchmusicdemo.ui.theme.Purple500
import com.bayarsahintekin.searchmusicdemo.ui.theme.Purple700


@Composable
fun SearchListItem(searchItem: Result) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Purple500,
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ){
        Row {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.8F)
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = searchItem.artistName!!)
            }
        }

    }

}
