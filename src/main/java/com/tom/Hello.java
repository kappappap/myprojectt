package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        new Person().這個類別我們稱它為物件CTRL+ALT+空白鍵=這裡面有小括號的圖示它叫做功能也叫做方法
//        new Person().hello();
//        or
        //先定義一個"專門"存放Person物件的物件
        //它的名稱叫做p 等於new Person
        //這樣的一個語法就是在等號右邊先生出一個Person的物件
        //再將這個Person的物件地址寫在一張叫p的紙上面
        //所以我們可以簡稱這個p就是代表了記憶體裡面的Person物件
        //所以我們也可以在接下來的程式碼在p這個物件去呼叫他身上的Hello方法取得結果
        Person p = new Person();
        p.hello();
        /**Person是物件
         * 把它儲存起來
         * 再利用物件去呼叫hello這個方法*/
    }
}
