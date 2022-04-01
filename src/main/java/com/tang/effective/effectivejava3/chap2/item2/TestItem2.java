package com.tang.effective.effectivejava3.chap2.item2;


import static com.tang.effective.effectivejava3.chap2.item2.NyPizza.Size.SMALL;
import static com.tang.effective.effectivejava3.chap2.item2.Pizza.Topping.*;

/**
 * @Title: Test
 * @Description:
 * @author: tangyao
 * @date: 2022/4/1 18:13
 * @Version: 1.0
 */

public class TestItem2 {

    public static void main(String[] args) {

        NutritionFacts3 build = new NutritionFacts3.Builder(240, 8)
                .calories(10).sodium(35).carbohydrate(27).build();
        System.out.println("build = " + build);

        NutritionFacts build1 =
                new NutritionFacts.NutritionFactsBuilder()
                        .fat(1)
                        .servings(2)
                        .calories(4)
                        .sodium(10)
                        .carbohydrate(100)
                        .build();

        System.out.println("build1 = " + build1);


        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        System.out.println("pizza = " + pizza);

        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
        System.out.println("calzone = " + calzone);




    }
}