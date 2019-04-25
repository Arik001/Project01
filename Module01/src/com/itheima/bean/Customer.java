package com.itheima.bean;


//这是单行注释

public class Customer {

    public static void main(String[] args) {
        System.out.println("hello !!!!!!!");
        System.out.println("args = [" + args + "]");
        System.out.println("Customer.main");
        String[] arr = new String[]{"tom","fox","haimeimei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

    }
    public  void method(){
        
    }
}
