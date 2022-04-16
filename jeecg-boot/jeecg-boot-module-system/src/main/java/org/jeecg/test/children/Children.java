package org.jeecg.test.children;

import org.jeecg.test.parent.Parent;

public class Children extends Parent {

    {
        log.debug("静态代码块");
    }

    public static void main(String[] args) {

        String a = new String("x");

        String b = "x";

        System.out.println(a == b);

        a.intern();

        System.out.println(a == b);

        String c = new String("x").intern();

        String d = "x";

        System.out.println(c == a);

        System.out.println(c == d);


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
