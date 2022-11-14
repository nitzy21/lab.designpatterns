package com.bootcamp.demo.wordconverter;

public class TensDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int TENS_NOTE = 10;

	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;

	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();

		if (amount <= 19) {
			System.out.print(String.format("%s", NameArray.numNames[amount]));

		} else if (amount >= TENS_NOTE) {
			final int numberOfHundredThousandNotes = amount / TENS_NOTE;
			final int remainingAmountToDispense = amount % TENS_NOTE;

			System.out.print(String.format("%s", NameArray.tensNames[numberOfHundredThousandNotes]));

			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		} else {
			numberDispenser.dispense(num);
		}
	}

}
