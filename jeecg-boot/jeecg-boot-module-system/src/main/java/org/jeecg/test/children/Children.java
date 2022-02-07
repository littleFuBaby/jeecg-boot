package org.jeecg.test.children;

import org.jeecg.test.parent.Parent;

public class Children extends Parent {

    {
        log.debug("静态代码块");
    }

    public static void main(String[] args) {
        // log.debug("语句");
    }

}
