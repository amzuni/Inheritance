package advance.dev;

public class Teacher extends Person {
	
	double hsl;
	String mgv;
	final double LUONG_CO_BAN = 1000;
	
	public Teacher(String name, int age, String phone) {
		super(name, age, phone);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String phone, double hsl, String mgv) {
		super(name, age, phone);
		this.hsl = hsl;
		this.mgv = mgv;
	}
	
	public double tinhLuong() {
		return hsl * LUONG_CO_BAN;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s - age:%d - dtb:%.2f", name, age, tinhLuong());
	}
}
