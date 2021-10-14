package com.bayarsahintekin.searchmusicdemo.ui.app

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bayarsahintekin.searchmusicdemo.data.model.Result
import com.bayarsahintekin.searchmusicdemo.ui.viewmodel.MainViewModel



@ExperimentalFoundationApi
@Composable
fun SearchList(mainViewModel: MainViewModel) {
    val searchList = mainViewModel.searchResult
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(
            items = searchList!!,
            itemContent = {
                SearchListItem(searchItem = it)
            })
    }

}