package com.erc;

public class LcdMap {
    public static int[] getMap(int number) {
        int[] unMarkedValues = new int[]{};
        switch (number) {
            case 0:
                unMarkedValues = new int[]{4};
                break;
            case 1:
                unMarkedValues = new int[]{0, 1, 3, 4, 6, 7};
                break;
            case 2:
                unMarkedValues = new int[]{3, 8};
                break;
            case 3:
                unMarkedValues = new int[]{3, 6};
                break;
            case 4:
                unMarkedValues = new int[]{1, 6, 7};
                break;
            case 5:
                unMarkedValues = new int[]{5, 6};
                break;
            case 6:
                unMarkedValues = new int[]{5};
                break;
            case 7:
                unMarkedValues = new int[]{0, 3, 4, 6, 7};
                break;
            case 8:
                break;
            case 9:
                unMarkedValues = new int[]{6};
                break;
        }
        return unMarkedValues;
    }
}
