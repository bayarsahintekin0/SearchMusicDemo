package com.bayarsahintekin.searchmusicdemo.ui.app

enum class TabCategory(val value: String){
    MOVIES("Movies"),
    MUSIC("Music"),
    APPS("Apps"),
    BOOKS("Books")
}

fun getCategories(): List<TabCategory>{
    return listOf(TabCategory.MOVIES,TabCategory.MUSIC,TabCategory.APPS,TabCategory.BOOKS)
}

fun getCategory(value: String): TabCategory {
    val map = TabCategory.values().associateBy(TabCategory::value)
    return map[value]!!
}