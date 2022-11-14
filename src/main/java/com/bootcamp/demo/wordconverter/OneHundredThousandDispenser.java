package com.bootcamp.demo.wordconverter;

public class OneHundredThousandDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int ONE_HUNDRED_THOUSAND_NOTE = 100_000;

	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;
	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();

		if (amount >= ONE_HUNDRED_THOUSAND_NOTE) {
			final int numberOfHundredThousandNotes = amount / ONE_HUNDRED_THOUSAND_NOTE;
			final int remainingAmountToDispense = amount % ONE_HUNDRED_THOUSAND_NOTE;

			System.out.print(String.format("%s hundred ", NameArray.numNames[numberOfHundredThousandNotes]));

			if (remainingAmountToDispense == 0 || remainingAmountToDispense < 1000) {
				System.out.print("thousand");
			}

			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		} else {
			numberDispenser.dispense(num);
		}
	}

}
