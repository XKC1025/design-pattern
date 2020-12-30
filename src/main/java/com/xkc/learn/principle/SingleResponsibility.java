package com.xkc.learn.principle;

import lombok.Data;

/**
 * 单一职责原则
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
