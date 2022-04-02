package com.tang.effective.effectivejava3.chap2.item3.enumtype;


/**
 * @Title: Elvis
 * @Description:
 * @author: tangyao
 * @date: 2022/4/2 10:12
 * @Version: 1.0
 */

public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding(){
        System.out.println("Whoa baby , I'm outta here ");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();

    }

}