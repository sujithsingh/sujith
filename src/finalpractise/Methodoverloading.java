package finalpractise;

public class Methodoverloading {

	private void empid() {
		System.out.println("1234567");
	}

	// datatype
	private void empid(int age) {
		System.out.println("empage :" + age);
	}

	// based on count of datatype
	private void empid(String name) {
		System.out.println(name);
	}

	// based on datatype ordeer

	private void empid(String city, char block) {
		System.out.println(city + "\n" + block);
	}

	private void empid(String project, String letter, char gender) {
		System.out.println("emp gender" + gender);
	}

	private void empid(Float salary, long phno) {
		System.out.println(phno + "\n" + salary);
	}

	public static void main(String[] args) {

		Methodoverloading x = new Methodoverloading();
		x.empid();
		x.empid(22);
		x.empid("babyma");
		x.empid(23.34f, 12345l);
		x.empid("chennai", 's');
	

	}
}
