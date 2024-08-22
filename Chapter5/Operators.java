public class Operators {
	public static void main(String args[]) {
		Operators operator = new Operators();
		System.out.println("add/subtract oprator");
		operator.additive();
		System.out.println("multiple/divide operator");
		operator.multiplicative();
		System.out.println("remainder operator");
		operator.remainder();
		System.out.println("compound assignment operator");
		operator.compound();
		System.out.println("unary operator");
		operator.unary();
		System.out.println("increment/decrement operator");
		operator.increDecre();
		System.out.println("logical complement operator");
		operator.complement();
		System.out.println("equality operator");
		operator.equalityComparison();
		System.out.println("relational operator");
		operator.relationalComparison();
		System.out.println("--------------------");
		System.out.println("casting");
		operator.casting();
	}

	public void additive() {
		int intValue1 = 5;
		int intValue2 = 10;

		int result = intValue1 + intValue2;
		System.out.println(result);
		
		result = intValue2 - intValue1;
		System.out.println(result);
	}

	public void multiplicative() {
		int intValue1 = 5;
		int intValue2 = 10;
	
		int result = intValue1 * intValue2;
		System.out.println(result);

		result = intValue2 / intValue1;
		System.out.println(result);
		
		float result2 = (float)intValue1 / intValue2;
		System.out.println(result2);
	}
	
	public void remainder() {
		int intValue1 = 53;
		int intValue2 = 10;

		int result = intValue1 % intValue2;
		System.out.println(result);
	}

	public void compound() {
		int intValue = 10;
	
		intValue += 5;
		System.out.println(intValue);
		intValue -=5;
		System.out.println(intValue);
		intValue *= 5;
		System.out.println(intValue);
		intValue /= 5;
		System.out.println(intValue);
		intValue %= 5;
		System.out.println(intValue);
	}

	public void unary() {
		int intValue = -10;

		int result = +intValue;
		System.out.println(result);
		result = -intValue;
		System.out.println(result);
	}

	public void increDecre() {
		int intValue = 1;

		System.out.println(intValue++);
		System.out.println(intValue);
		System.out.println(++intValue);
	}

	public void complement() {
		boolean flag = true;

		System.out.println(flag);
		System.out.println(!flag);
	}

	public void equalityComparison() {
		int intValue1 = 1;
		int intValue2 = 1;
		int intValue3 = 2;

		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1 == intValue3);

		System.out.println(intValue1 != intValue2);
		System.out.println(intValue1 != intValue3);

		System.out.println("-----");

		char charValue = 'a';
		System.out.println(charValue == 97);
		double doubleValue = 1.0;
		System.out.println(doubleValue == intValue1);
	}

	public void relationalComparison() {
		int intValue1 = 1;
		int intValue2 = 2;

		System.out.println(intValue1 > intValue2);
		System.out.println(intValue1 < intValue2);

		System.out.println(intValue1 >= intValue2);
		System.out.println(intValue1 <= intValue2);
	}

	public void casting() {
		byte byteValue = 127;
		short shortValue = byteValue;

		shortValue++;
		System.out.println(shortValue);
		byteValue = (byte)shortValue;;
		System.out.println(byteValue);
	}
}
