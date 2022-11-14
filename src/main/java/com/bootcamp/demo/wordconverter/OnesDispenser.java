package com.bootcamp.demo.wordconverter;

public class OnesDispenser implements NumberDispenser {

	private NumberDispenser numberDispenser;
	private static final int ONES_NOTE = 1;
	
	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;
		
	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();
		
		if (amount >= ONES_NOTE) {
			final int numberOfHundredThousandNotes = amount / ONES_NOTE;
			final int remainingAmountToDispense = amount % ONES_NOTE;

			System.out.print(String.format("%s", NameArray.numNames[numberOfHundredThousandNotes]));

			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		}
		
//		else {
////			System.out.println("thousand");
//			numberDispenser.dispense(num);
//		}
		
	}

}

