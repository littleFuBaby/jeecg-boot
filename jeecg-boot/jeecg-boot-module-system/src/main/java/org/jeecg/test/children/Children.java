package org.jeecg.test.children;

import org.jeecg.test.parent.Parent;

public class Children extends Parent {

    {
        log.debug("静态代码块");
    }

    public static void main(String[] args) {

        String str = "x";
        String str1 = str + "y";
        String str2 = "xy";
        String str3 = "x" + "y";

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // true

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
