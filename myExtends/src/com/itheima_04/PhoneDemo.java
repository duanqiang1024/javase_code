package com.itheima_04;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林青霞");

        System.out.println("-----------------");

        NewPhone np = new NewPhone();
        np.call("张曼玉");
    }
}
