package com.tang.effective.effectivejava3.chap2.item3.staticfactory;


/**
 * @Title: Elvis
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:17
 * @Version: 1.0
 */

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();


    private Elvis() {

    }

    public Elvis getInstance() {
        return INSTANCE;
    }


    public void leaveTheBuilding() {
        System.out.println("Whoa baby , I'm outta here ");
    }

    public static void main(String[] args) {

    }
}