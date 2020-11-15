package com.gittest;

/**
 * @author zhangyouhua
 * @date 2020/10/9 15:15
 */
public class B {
    public static void main(String[] args) {
        String a = "a,b,c";
        for (String s : a.split(",")) {
            System.out.println(s+"changed");
        }

        System.out.println("这里进行了添加");

    }
}
