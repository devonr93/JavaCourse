package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bobsAccount = new BankAccount("12345", 0.00,
				"Bob R", "bobr@gmail.com", "(319)-329-0123");
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
	    bobsAccount.withdrawal(100.00);

	    bobsAccount.deposit(50.00);
		bobsAccount.withdrawal(100.00);

		bobsAccount.deposit(51.00);
		bobsAccount.withdrawal(100.00);

		BankAccount devonsAccount = new BankAccount("31954", 5000000.00, "Devon", "Devon@gmail.com","1234567");
		System.out.println(devonsAccount.getNumber() + " name " + devonsAccount.getCustomerName());
        System.out.println("Current balance is " + devonsAccount.getBalance());
        devonsAccount.withdrawal(543.00);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Jeffery", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Devon", 150000, "Devon@email.com");
        System.out.println(person3.getName());
    }
}
