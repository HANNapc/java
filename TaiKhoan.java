package test5;

import java.util.Scanner;

public class TaiKhoan {
	String stk;
	String name;
	private double tien;
	
	public TaiKhoan(String stk, String name, double tien) {
		this.stk = stk;
		this.name = name;
		this.tien = tien;
	}
	public TaiKhoan() {
	}
	public String getStk() {
		return stk;
	}
	public void setStk(String stk) {
		this.stk = stk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTien() {
		return tien;
	}
	public void setTien(double tien) {
		this.tien = tien;
	}
	public void nhapTK() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so stk:");
		this.stk = sc.nextLine();
		System.out.println("Nhap ho ten:");
		this.name = sc.nextLine();
		System.out.println("Nhap so tien:");
		this.tien = Double.parseDouble(sc.nextLine());
	}
	static double LX = 0.05;
	public TaiKhoan(String stk,String name) {
		this(stk,name,100);
	}
	
	@Override
	public String toString() {
		return "TaiKhoan [stk=" + stk + ", name=" + name + ", tien=" + tien + "]";
	}
	public void guiTien() {
	double tieng;
	Scanner sc  = new Scanner(System.in);
	System.out.println("Nhap so tien gui:");
	tieng = Double.parseDouble(sc.nextLine());
	this.tien = this.tien + tieng;
	System.out.println(toString());
	}
	public void rutTien() {
		double tienr;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Nhap so tien muon rut:");
		tienr = Double.parseDouble(sc.nextLine());
		if(tienr > tien || tienr < 0) {
			System.out.println("Loi!Khong the thanh cong");
			break;
		}
		this.tien = this.tien - tienr;
		System.out.println(toString());
		}while(tienr > tien|| tienr < 0);
	}
	public void daohanT() {
		this.tien = this.tien + this.tien*LX;
	}
}
