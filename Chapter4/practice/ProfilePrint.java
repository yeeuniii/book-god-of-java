public class ProfilePrint {
	private byte age;
	private String name;
	private boolean isMarried;

	public static void main(String[] args) {
		ProfilePrint profile = new ProfilePrint();

		profile.setAge((byte)24);
		profile.setName("yeeuniii");
		profile.setMarried(false);

		System.out.println("My age is " + profile.getAge());
		System.out.println("My name is " + profile.getName());
		System.out.println("It is " + profile.isMarried() + " that I am married");
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarried(boolean flag) {
		this.isMarried = flag;
	}

	public byte getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public boolean isMarried() {
		return isMarried;
	}
}
