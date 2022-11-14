package com.bootcamp.demo.wordconverter;

import java.util.Scanner;

public class NumberTest {

	private NumberDispenser oneMillionDispenser;
	private NumberDispenser oneHundredThousandDispenser;
	private NumberDispenser tenThousandDispenser;
	private NumberDispenser oneThousandDispenser;
	private NumberDispenser oneHundredDispenser;
	private NumberDispenser tensDispenser;
	private NumberDispenser onesDispenser;
	
	public NumberTest( ) {
		this.oneMillionDispenser = new OneMillionNumberDispenser();
		this.oneHundredThousandDispenser = new OneHundredThousandDispenser();
		this.tenThousandDispenser = new TenThousandDispenser();
		this.oneThousandDispenser = new OneThousandDispenser();
		this.oneHundredDispenser = new OneHundredDispenser();
		this.tensDispenser = new TensDispenser();
		this.onesDispenser = new OnesDispenser();
		
		this.oneMillionDispenser.chain(oneHundredThousandDispenser);
		this.oneHundredThousandDispenser.chain(tenThousandDispenser);
		this.tenThousandDispenser.chain(oneThousandDispenser);
		this.oneThousandDispenser.chain(oneHundredDispenser);
		this.oneHundredDispenser.chain(tensDispenser);
		this.tensDispenser.chain(onesDispenser);
	}
	
	public void withdraw(int amount) {
        if (amount >= 2_147_483_647) {
            throw new IllegalArgumentException("Amount reached maximum limit.");
        }
        if(amount<=0) {
        	 throw new IllegalArgumentException("Invalid amount");
        }
        this.oneMillionDispenser.dispense(new Number(amount));
    }
	
	public static void main(String[] args) {
		NumberTest num = new NumberTest();
		
		// issue : 9000, 
		 try {
	            Scanner scanner = new Scanner(System.in);
	            String reply = "y";
	            while (reply.equalsIgnoreCase("y")) {
	                System.out.print("Enter amount to dispense: ");
	                int amount = scanner.nextInt();
	                num.withdraw(amount);
	                System.out.println("\n Continue (y/n)? ");
	                reply = scanner.next();
	                System.out.println("-----------------------------------------");
	            }
	            scanner.close();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}
	
}
