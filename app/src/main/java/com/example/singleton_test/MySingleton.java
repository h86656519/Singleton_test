package com.example.singleton_test;

public class MySingleton {
    private String data;
    static MySingleton mySingleton = new MySingleton(); //利用static 只能在記憶體中只有一份的特性，建立出singleton ，所以 static 就是必key

    //建構子要設private，保護MySingleton 不會被其他地方用到
    private MySingleton() {
    } 

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static MySingleton mySingleton() {
        return mySingleton;
    }

//    省記憶體的做法，但要之後還要考慮做判斷，情況會複雜化，記憶體也沒剩多少
//    public static MySingleton mySingleton() {
//        if (mySingleton = null){
//            static MySingleton mySingleton = new MySingleton();
//        }
//        return mySingleton;
//    }
}
