package test3;

import java.util.Scanner;

public class Congnhantest {
	public static void main(String[] args) {
		Congnhanlist cn;
		cn = new Congnhanlist();
		int c;
		do {
		System.out.println("=====BANG TIM KIEM=====");
		System.out.println("Bam 1:Nhap thong tin");
		System.out.println("Bam 2:Hien thong tin");
		System.out.println("Bam 3:Tim luong cong nhan");
		System.out.println("=========***===========");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lua chon cua ban:");
		c = Integer.parseInt(sc.nextLine());
		switch (c) {
		case 1:
			cn.inputCNList();
			break;
		case 2:
			cn.outputCNList();
			break;
		case 3:
			cn.timLuong();
			break;
		}
		}while(c!=0);
	}
}
