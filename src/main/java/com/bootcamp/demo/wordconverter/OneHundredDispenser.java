package com.bootcamp.demo.wordconverter;

public class OneHundredDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int ONE_HUNDRED_NOTE = 100;
	
	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;
		
	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();
		
		if (amount >= ONE_HUNDRED_NOTE) {
			final int numberOfHundredThousandNotes = amount / ONE_HUNDRED_NOTE;
			final int remainingAmountToDispense = amount % ONE_HUNDRED_NOTE;

			System.out.print(String.format("%s hundred", NameArray.numNames[numberOfHundredThousandNotes]));

			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		} else {
//			System.out.println("thousand");
			numberDispenser.dispense(num);
		}
	}

}
