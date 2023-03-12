package test4;

import java.util.Scanner;

public class Dttest {
	public static void main(String[] args) {
		DTList b;
		b = new DTList();
		int c;
		do {
		System.out.println("=====BANG TIM KIEM=====");
		System.out.println("Bam 1:Nhap thong tin");
		System.out.println("Bam 2:Hien thong tin");
		System.out.println("Bam 3:Tim max doan thang");
		System.out.println("Bam 4:Tinh tong do dai");
		System.out.println("=========***===========");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lua chon cua ban:");
		c = Integer.parseInt(sc.nextLine());
		switch (c) {
		case 1:
			b.inDT();
			break;
		case 2:
			b.showDT();
			break;
		case 3:
			b.maxDT();
			break;
		case 4:
			b.sumDT();
			break;
		}
		}while(c!=0);
	}
}
