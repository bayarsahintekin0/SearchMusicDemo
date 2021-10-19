package com.bayarsahintekin.searchmusicdemo.ui.app

enum class TabCategory(val title:String ,val value: String){
    MOVIES("movie","Movies"),
    MUSIC("music","Music"),
    APPS("software","Apps"),
    BOOKS("ebook","Books")
}

fun getCategories(): List<TabCategory>{
    return listOf(TabCategory.MOVIES,TabCategory.MUSIC,TabCategory.APPS,TabCategory.BOOKS)
}

fun getCategory(value: String): TabCategory {
    val map = TabCategory.values().associateBy(TabCategory::value)
    return map[value]!!
}