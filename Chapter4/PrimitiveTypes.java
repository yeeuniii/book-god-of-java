public class PrimitiveTypes {
	byte byteDefault;
	short shortDefault;
	int intDefault;
	long longDefault;
	float floatDefault;
	double doubleDefault;
	char charDefault;
	boolean booleanDefault;

	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		
		System.out.println("byte");
		types.checkByte();
		System.out.println("\nshort");
		types.checkShort();
		System.out.println("\nint");
		types.checkInt();
		System.out.println("\nlong");
		types.checkLong();
		System.out.println("\nchar");
		types.checkChar();

		System.out.println("\ndefault value");
		types.printDefaultValues();

	}

	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;

		System.out.println("byteMin="+byteMin);
		System.out.println("byteMax="+byteMax);

		byteMin--;
		byteMax++;
		System.out.println("byteMin--="+byteMin);
		System.out.println("byteMax++="+byteMax);
	}

	public void checkShort() {
		short shortMax = 32767;

		System.out.println("shortMax="+shortMax);
		shortMax++;
		System.out.println("shortMax++="+shortMax);
	}

	public void checkInt() {
		int intMax = 2147483647;

		System.out.println("intMax="+intMax);
		intMax++;
		System.out.println("intMax++="+intMax);
	}

	public void checkLong() {
		long longMax = 9223372036854775807l;
		
		System.out.println("longMax="+longMax);
		longMax++;
		System.out.println("longMax++="+longMax);
	}

	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';

		System.out.println("charMin=["+charMin+"]");
		System.out.println("charMax=["+charMax+"]");

		int intValue = 'a';
		System.out.println("intValue(a)=["+intValue+"]");
	}

	public void printDefaultValues() {
		System.out.println("byteDefault="+byteDefault);
		System.out.println("shortDefault="+shortDefault);
		System.out.println("intDefault="+intDefault);
		System.out.println("longDefault="+longDefault);
		System.out.println("floatDefault="+floatDefault);
		System.out.println("doubleDefault="+doubleDefault);
		System.out.println("charDefault="+charDefault);
		System.out.println("booleanDefault="+booleanDefault);
	}
}
