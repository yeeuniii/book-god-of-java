public class Array {
	public static void main(String[] args) {
		Array array = new Array();

		array.referenceTypes();
	}

	public void referenceTypes() {
		String[] strings = new String[2];
		Array[] arrays = new Array[2];

		strings[0] = "hello";
		System.out.println("strgins[0] = " + strings[0]);
		System.out.println("strgins[1] = " + strings[1]);
		System.out.println("strings = " + strings);

		arrays[0] = new Array();
		System.out.println("arrays[0] = " + arrays[0]);
		System.out.println("arrays[1] = " + arrays[1]);
		System.out.println("arrays = " + arrays);
	}
}
