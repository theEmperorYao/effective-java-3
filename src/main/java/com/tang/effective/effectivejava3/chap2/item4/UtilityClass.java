package com.tang.effective.effectivejava3.chap2.item4;


/**
 * @Title: UtilityClass
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:26
 * @Version: 1.0
 */

public class UtilityClass {
    /**
     * 这个类无法被继承，因为子类的构造器无法显示或隐式的调用这个父类的构造器
     */
    private UtilityClass() {
        throw new AssertionError();
    }
}