package advance.dev;

import java.util.Scanner;

/**
 * Viet chuong trinh xay dung 3 lop ConNguoi, SinhVien, GiaoVien
 * Khai bao mang sinh vien gom 2 phan tu
 * Mang giao vien gom 2 phan tu
 * Nhap du lieu tu ban phim thong qua Scanner
 * @author tranthanhbinh
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persons[] = new Person[5];
		input(persons);
		print(persons);
		findTeacher(persons);
		findStudent(persons);
		
	}

	private static void findStudent(Person[] persons) {
		// TODO Auto-generated method stub
		double max = 0;
		for (Person person : persons) {
			if(person instanceof Student) {
				Student std = (Student)person;
				if(max < std.diemTrungBinh()) max = std.diemTrungBinh();
			}
		}
	}

	private static void findTeacher(Person[] persons) {
		// TODO Auto-generated method stub
		double max = 0;
		for (Person person : persons) {
			if(person instanceof Teacher) {
				Teacher tc = (Teacher)person;
				if(max < tc.tinhLuong()) max = tc.tinhLuong();
			}
		}
	}

	private static void print(Person[] persons) {
		// TODO Auto-generated method stub
		for (Person person : persons) {
			System.out.println(person);
		}
	}

	private static void input(Person[] persons) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 giao vien");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ten:");
			String name = sc.nextLine();
			
			System.out.println("Nhap tuoi");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("He so luong");
			double hsl = sc.nextDouble();
			sc.nextLine();

			System.out.println("Nhap phone:");
			String phone = sc.nextLine();

			System.out.println("Nhap mgv:");
			String mgv = sc.nextLine();
			
			Teacher tc = new Teacher(name, age, phone, hsl, mgv);
			persons[i] = tc;
		}
		
		System.out.println("Nhap 3 sinh vien");
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhap ten:");
			String name = sc.nextLine();
			
			System.out.println("Nhap tuoi");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Diem toan");
			double toan = sc.nextDouble();
			sc.nextLine();

			System.out.println("Diem ly");
			double ly = sc.nextDouble();
			sc.nextLine();

			System.out.println("Diem hoa");
			double hoa = sc.nextDouble();
			sc.nextLine();

			System.out.println("Nhap phone:");
			String phone = sc.nextLine();

			System.out.println("Nhap masv:");
			String masv = sc.nextLine();
			
			Student std = new Student(name, age, phone, toan, ly, hoa, masv);
			persons[i + 2] = std;
		}
		
		sc.close();
	}

}
