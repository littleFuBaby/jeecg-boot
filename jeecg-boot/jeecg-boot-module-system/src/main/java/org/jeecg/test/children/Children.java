package org.jeecg.test.children;

import org.jeecg.test.parent.Parent;

public class Children extends Parent {

    {
        log.debug("静态代码块");
    }

    public static void main(String[] args) {

        String str1 = "Hello World!!!";
        String str2 = new String("Hello World!!!");
        String str3 = new String("Hello World!!!");
        str3.intern();
        String str4 = new String("Hello World!!!").intern();

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str2 == str3); // false
        System.out.println(str2 == str4); // false
        System.out.println(str3 == str4); // false

        // log.debug("语句");

        float f1 = 10.2f;
        float f2 = 10.2f;
        float f3 = f1 * f2;

        System.out.println(f3);

        double d1 = 10.2d;
        double d2 = 10.3d;
        double d3 = d1 * d2;

        System.out.println(d3);


    }

}
