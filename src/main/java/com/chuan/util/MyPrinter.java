package com.chuan.util;

import java.util.Arrays;

/**
 * @author xucy-e
 */
public class MyPrinter {
    public static void println(Object... objects) {
        for (Object object : objects) {
            if (object == null) {
                System.out.print((Object) null);
            } else if (object.getClass().isArray()) {
                System.out.print(Arrays.toString((Object[]) object));
            } else {
                System.out.print(object);
            }
            System.out.print("  ");
        }
        System.out.println();
    }
}
