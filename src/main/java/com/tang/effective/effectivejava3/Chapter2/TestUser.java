package com.tang.effective.effectivejava3.Chapter2;


import lombok.*;

import java.util.List;

/**
 * @Title: TestUser
 * @Description:
 * @author: tangyao
 * @date: 2021/12/29 17:52 2021/12/29
 * @Version: 1.0
 */

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
//@ToString(exclude = {"age"})
@Getter
public class TestUser {

    private final int id;
    private final String name;
    private final int age;
    private final List<String> items;

}
