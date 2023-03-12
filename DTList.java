package test4;

import java.util.Scanner;

public class DTList {
		DThang a[];
		int n;
		public DTList() {
		}
		public void inDT() {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so doan thang can nhap:");
			n = Integer.parseInt(sc.nextLine());
			a = new DThang[n];
			for(int i=0;i<n;i++) {
				a[i] = new DThang();
				a[i].nhapDT();
			}
		}
		public void showDT() {
			for(int i=0;i<n;i++) {
				a[i].hienDT();
			}
		}
		public void maxDT() {
			double k = a[0].tinhDT();
			for(int i=0;i<n;i++) {
				if(a[i].tinhDT() > k) {
					k = a[i].tinhDT();
				}
			}
			System.out.println("Cac doan thang co ddo dai la lon nhat la:");
					for(int i=0;i<n;i++) {
						if(a[i].tinhDT() == k) {
							a[i].hienDT();
						}
					}
		}
		public void sumDT() {
			double sum =0;
			for(int i=0;i<n;i++) {
				sum += a[i].tinhDT();
			}
			System.out.println("tong do dai cac doan thang la" + sum);
		}
}
