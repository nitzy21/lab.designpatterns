package com.bootcamp.demo.wordconverter;

public class OneThousandDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int ONE_THOUSAND_NOTE = 1_000;

	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;

	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();

		if (amount >= ONE_THOUSAND_NOTE) {
			final int numberOfHundredThousandNotes = amount / ONE_THOUSAND_NOTE;
			final int remainingAmountToDispense = amount % ONE_THOUSAND_NOTE;

			System.out.print(String.format("%s thousand", NameArray.numNames[numberOfHundredThousandNotes]));

			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}

		} else {
			numberDispenser.dispense(num);
		}
	}

}
