package com.company.project02;

import java.util.Random;

/**
 * Created by HSH on 16. 6. 14..
 */
public class CarryCount2 {

    public static void main(String args[]) {
        CarryCount2 carryCount2 = new CarryCount2();
        carryCount2.control();
    }

    private void control() {

        int totalCount = 0;

        Random random = new Random();
        int num1 = random.nextInt(10000);
        int num2 = random.nextInt(10000);

//        int num1 = 9999, num2 = 1;
        System.out.println(num1 + " " + num2);

        int carry = 0;
        while (num1 >= 1 || num2 >= 1) {
            if (num1 % 10 + num2 % 10 + carry > 9) { //각 자리수를 더하고 캐리 값을 더해 10보다 크면 자리올림이 일어난 것!
                carry = 1;
                totalCount++;
            } else {
                carry = 0; // 자리올림이 일어나지 않으면 carry는 0
            }
            num1 /= 10;
            num2 /= 10;
        }

        System.out.print("Count : " + totalCount);
    }
}
