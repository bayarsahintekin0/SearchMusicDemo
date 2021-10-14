package com.bayarsahintekin.searchmusicdemo.ui.app

sealed class SearchEvent {
    object NewSearchEvent : SearchEvent()

    object NextPageEvent : SearchEvent()
}
