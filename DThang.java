package test4;

import java.util.Scanner;

public class DThang {
	Diem p1;
	Diem p2;
	public DThang() {
		p1 = new Diem();
		p2 = new Diem();
	}
	public DThang(Diem p1, Diem p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public void nhapDT() {
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap diem t1:");
		this.p1.nhapDiem();
		System.out.println("Nhap diem t2:");
		this.p2.nhapDiem();
	}
	public void hienDT() {
		System.out.println("P1:" + this.p1.toString());
		System.out.println("P2:" + this.p2.toString());
	}
	public double tinhDT() {
		return Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX())+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
	}
}
