package com.bootcamp.demo.wordconverter;

public class TenThousandDispenser  implements NumberDispenser  {

	private NumberDispenser numberDispenser;
	private static final int TEN_THOUSAND_NOTE = 10_000;
	
	@Override
	public void chain(NumberDispenser numberDispenser) {
		this.numberDispenser = numberDispenser;
		
	}

	@Override
	public void dispense(Number num) {
		int amount = num.getNum();
		
		
		if (amount >= TEN_THOUSAND_NOTE) {
			final int numberOfHundredThousandNotes = amount / TEN_THOUSAND_NOTE;
			final int remainingAmountToDispense = amount % TEN_THOUSAND_NOTE;

//			if (amount/1000 <20) {
//				System.out.print(String.format("%s", NameArray.numNames[amount/1000]));
//				
//			}
			
//			System.out.println("modulo: " +remainingAmountToDispense);
			
			System.out.print(String.format("%s", NameArray.tensNames[numberOfHundredThousandNotes]));

			if(remainingAmountToDispense < 1000) {
				System.out.print(" thousand ");
			}
			if (remainingAmountToDispense > 0) {
				numberDispenser.dispense(new Number(remainingAmountToDispense));
			}
		} else {
//			System.out.print("thousand ");
			numberDispenser.dispense(num);
		}
	}

}
