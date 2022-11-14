package com.bootcamp.demo.wordconverter;

public class OneMillionNumberDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int ONE_MILLION_NOTE = 1_000_000;

	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;
	}

	@Override
	public void dispense(Number num) {

		final int amount = num.getNum();
		
		if (amount >= ONE_MILLION_NOTE) {
			final int numberOfMillionNotes = amount / ONE_MILLION_NOTE;
			final int remainingAmountToDispense = amount % ONE_MILLION_NOTE;
			
//			System.out.println(String.format("Dispensing %s %s note", numberOfMillionNotes, ONE_MILLION_NOTE));
			System.out.print(String.format("%s million", NameArray.numNames[numberOfMillionNotes]));
			
			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		} else {
			numberDispenser.dispense(num);
		}

	}

}
