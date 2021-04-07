package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
//        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
