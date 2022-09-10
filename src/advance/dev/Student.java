package advance.dev;

public class Student extends Person {
	
	double toan;
	double ly;
	double hoa;
	String msv;
	
	public Student(String name, int age, String phone) {
		super(name, age, phone);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String phone, double toan, double ly, double hoa, String msv) {
		super(name, age, phone);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		this.msv = msv;
	}
	
	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s - age:%d - dtb:%.2f", name, age, diemTrungBinh());
	}
}
