public class VariableTypes {
	int instanceVariable;
	static int classVariable;

	public void mtehod(int parameter) {
		int localVariable;
	}

	public void invalidMethod() {
		if (true) {
			int localVariable;
			if (true) {
				int localVariable;
			}
		}
	}
}
