package com.tang.effective.effectivejava3.Chapter2;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

/**
 * @Title: Code_01
 * @Description: 1 考虑使用静态工厂方法替代构造方法
 * @author: tangyao
 * @date: 2021/12/29 15:48 2021/12/29
 * @Version: 1.0
 */
public class CodeTest {

    @Test
    void test01() {
        //静态工厂方法的一个优点是，与构造方法不同，它们是有名字的。
        Boolean aBoolean = Boolean.valueOf(true);
        BigInteger bigInteger = BigInteger.probablePrime(2, new Random());
        System.out.println("bigInteger = " + bigInteger);

        //静态工厂方法的第二个优点是，与构造方法不同，它们不需要每次调用时都创建一个新对象。


    }

    @Test
    void test02() {
        Item2_NutritionFacts build1 =
                new Item2_NutritionFacts.Builder(1, 2).calories(1).fat(2).build();
        System.out.println("build1 = " + build1);


        TestUser.TestUserBuilder testUserBuilder = new TestUser.TestUserBuilder();
        TestUser build  = testUserBuilder.age(1).id(2).name("2").name("3").items(List.of("a", "b", "c")).build();

        System.out.println("build.getId() = " + build.getId());
        System.out.println("build.getItems() = " + build.getItems());
        System.out.println("build.getAge() = " + build.getAge());
        System.out.println("build.getName() = " + build.getName());




    }


}
