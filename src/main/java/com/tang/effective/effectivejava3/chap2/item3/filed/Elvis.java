package com.tang.effective.effectivejava3.chap2.item3.filed;


/**
 * @Title: Elvis
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:15
 * @Version: 1.0
 */

public class Elvis {

    public static final Elvis INSTANCE = new Elvis();


    private Elvis() {

    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby , I'm outta here ");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}