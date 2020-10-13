package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone devonsPhone;
	    devonsPhone = new DeskPhone(123456);
	    devonsPhone.powerOn();
	    devonsPhone.callPhone(123456);
	    devonsPhone.answer();

	    devonsPhone = new MobilePhone(24565);
	    devonsPhone.powerOn();
	    devonsPhone .callPhone(24565);
	    devonsPhone.answer();
    }
}
