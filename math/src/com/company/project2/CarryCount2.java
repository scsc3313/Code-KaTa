package com.company.project2;

/**
 * Created by HSH on 16. 6. 14..
 */
public class CarryCount2 {

    public static void main(String args[]) {
        CarryCount2 carryCount2 = new CarryCount2();
        carryCount2.control();
    }

    private void control() {
//
        int num1 = (int) (Math.random() * 10000);
        int num2 = (int) (Math.random() * 10000);
        System.out.println(num1 + " " + num2);
        int carry = 0;
        int count = 0;
        while (num1 > 1 && num2 > 1) {
            if (num1 % 10 + num2 % 10 + carry > 9){
                carry = 1;
                count++;
            }
            else
                carry = 0;
            num1 /= 10;
            num2 /= 10;
        }

        System.out.print("Count : "+ count);
    }
}
