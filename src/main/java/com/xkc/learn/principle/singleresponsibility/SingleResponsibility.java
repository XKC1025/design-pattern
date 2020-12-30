package com.xkc.learn.principle.singleresponsibility;

import lombok.Data;

/**
 * 单一职责原则：一个类或方法单一功能
 */
@Data
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
    }

}

/**
 * 交通工具
 */
class Vehicle {

    public void run(String vehicle) {
        System.out.println();
    }

}
