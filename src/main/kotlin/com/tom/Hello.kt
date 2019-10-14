package com.tom

////定義類別名稱
//
//fun main() {
////    print("Hello kotlin")
//// 這樣就已經是一個物件了在這邊我們可以直接呼叫Hello
////    Human().hello()
//}
//
////在Kotlin這邊寫類別只要在這邊加上class {}類別名稱再加上大括號就可以了
//class Human {
//    //到這個時候可以發現Person的JAVA專案應該已經衝突了
//    fun hello() {
//        print("Hello kotlin")
//    }
//}
//-----------------------------------------------------------------------
//定義類別名稱

fun main() {
//儲存一個物件
    //可以使用val或是來定義var
    //val(value)代表當我定義完這個物件後就不能再改變他的值
    val h = Human()
    h.hello()
}

//在Kotlin這邊寫類別只要在這邊加上class {}類別名稱再加上大括號就可以了
class Human {
    //到這個時候可以發現Person的JAVA專案應該已經衝突了
    fun hello() {
        print("Hello kotlin")
    }
}