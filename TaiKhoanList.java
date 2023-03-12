package test5;

import java.util.Scanner;
public class TaiKhoanList {
	TaiKhoan a[];
	int n;
	public void nhapCTK() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap danh sach cac tai khoan:");
		n = Integer.parseInt(sc.nextLine());
		a = new TaiKhoan[n];
		for(int i=0;i<n;i++) {
			a[i] = new TaiKhoan();
			a[i].nhapTK();
		}
	}
	public void hienCTK() {
		for(int i=0;i<n;i++) {
			System.out.println(a[i].toString());
		}
	}
	public void guiCT() {
		for(int i=0;i<n;i++) {
			a[i].guiTien();
		}
	}
	public void rutCT() {
		for(int i=0;i<n;i++) {
			a[i].rutTien();
		}
	}
	public void daohanCT() {
		for(int i=0;i<n;i++) {
			a[i].daohanT();
		}
	}
}
