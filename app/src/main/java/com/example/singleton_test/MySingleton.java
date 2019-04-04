package com.example.singleton_test;

public class MySingleton {
    private String data;
    static MySingleton mySingleton = new MySingleton(); //利用static 只能在記憶體中只有一份的特性，建立出singleton ，所以 static 就是必key

    private MySingleton() {
    } //保護MySingleton 不會被其他地方用到

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static MySingleton mySingleton() {
        return mySingleton;
    }
}
