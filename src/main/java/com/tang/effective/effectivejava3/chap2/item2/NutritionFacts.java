package com.tang.effective.effectivejava3.chap2.item2;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @Title: NutritionFacts
 * @Description:
 * @author: tangyao
 * @date: 2022/4/1 18:09
 * @Version: 1.0
 */
@ToString
@Builder
public class NutritionFacts {
    private final int servingSize; // (mL) required
    private final int servings;    // (per container) required
    private final int calories;    // (per serving) optional
    private final int fat;         // (g/serving) optional
    private final int sodium;      // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional


}