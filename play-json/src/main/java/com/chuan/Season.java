package com.chuan;

/**
 * @author xucy-e
 */
public enum Season {
    SPRING("春天"), SUMMER("夏天"), FESTIVAL("秋天"), WINTER("冬天");

    private final String description;

    Season(String description) {
        this.description = description;
    }
}
