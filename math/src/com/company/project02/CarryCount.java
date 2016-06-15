package com.company.project02;

/**
 * Created by HSH on 16. 6. 11..
 */
public class CarryCount {

    private String num1, num2;
    private char[] num1Array, num2Array;
    private int[] carryArray;
    private int count;

    CarryCount() {
        count = 0;
    }

    public static void main(String[] args) {
        CarryCount main = new CarryCount();
        main.control();
    }

    private void control() {

        int numInt1 = 1;
        int numInt2 = 999;

        num1 = "0" + numInt1;
        num2 = "0" + numInt2;

        if (num1.length() > num2.length()) {
            num2 = paddingString(num2, "0", num1.length() - num2.length(), true);
        } else {
            num1 = paddingString(num1, "0", num2.length() - num1.length(), true);
        }

        System.out.println(num1);
        System.out.println(num2);

        num1Array = num1.toCharArray();
        num2Array = num2.toCharArray();

        carryArray = new int[num1Array.length];
        System.out.println(num1Array.length);

        for (int i = num1Array.length - 1; i > 0; i--) {
            if ((num1Array[i] - '0' + num2Array[i] - '0') + carryArray[i] >= 10) {
                System.out.println(i + "번째 : " + num1Array[i] + " " + num2Array[i]);
                carryArray[i - 1] = 1;
                count++;
            }
        }
        System.out.println("카운트 : " + count);
    }

    private String paddingString(String string, String padding, int count, boolean forward) {
        String tempString = "";
        for (int i = 0; i < count; i++) {
            tempString += padding;
        }
        if (forward){
            tempString += string;
            return tempString;
        }
        else{
            string += tempString;
            return string;
        }
    }
}
