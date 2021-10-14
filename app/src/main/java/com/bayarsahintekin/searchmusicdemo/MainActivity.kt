package com.bayarsahintekin.searchmusicdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.input.TextFieldValue
import com.bayarsahintekin.searchmusicdemo.ui.app.*
import com.bayarsahintekin.searchmusicdemo.ui.theme.AppTheme
import com.bayarsahintekin.searchmusicdemo.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel by viewModels<MainViewModel>()


    @ExperimentalComposeUiApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            AppTheme {
                appDesign()
            }
        }
    }

    @ExperimentalComposeUiApi
    @ExperimentalFoundationApi
    @Composable
    fun appDesign() {
        Scaffold(
            content = {
                Surface (color = MaterialTheme.colors.background ){
                    val textState = remember { mutableStateOf(TextFieldValue("")) }
                    Column {
                        SearchView(state = textState,mainViewModel = mainViewModel)
                        TabView(categories = getCategories(),
                            selectedCategory = mainViewModel.selectedCategory.value, onSelectedCategoryChanged = {
                                mainViewModel.setSelectedCategory(getCategory(it))
                            })
                        SearchList(mainViewModel = mainViewModel)
                    }
                }
            }
        )
    }
}