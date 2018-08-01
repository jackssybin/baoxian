package com.kaisagroup.baoxian.util;

/**
 * Created by jackssy on 2018/7/27.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UuidUtil {
    public static String getUuid() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        uuidStr = uuidStr.replace("-", "");

        new Thread( () -> System.out.println("In Java8!") ).start();

        new Thread(()->System.out.println()).start();


        return uuidStr;
    }

    public static void main(String[] args) {
        System.out.println(UuidUtil.getUuid());
    }

}