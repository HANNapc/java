package test5;

import java.util.Scanner;

public class TaiKhoanTest {
	public static void main(String[] args) {
		TaiKhoanList a;
		int n;
		   a = new TaiKhoanList();
		   int control;
		   do{
		   System.out.println("======BANG TIM KIEM======");
		   System.out.println("Bam 1:Nhap thong tin");
		   System.out.println("Bam 2:Hien danh sach");
		   System.out.println("Bam 3:Gui tien");
		   System.out.println("Bam 4:Rut tien");
		   System.out.println("Bam 5:Tien dao han");
		   System.out.println("===========***==========");
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Nhap so can chon:");
		   control = Integer.parseInt(sc.nextLine());
		   switch (control) {
		case 1:
			a.nhapCTK();
			break ;
		case 2:
			a.hienCTK();
			break;
		case 3:
			a.guiCT();
			break;
		case 4:
			a.rutCT();
			break;
		case 5:
			a.daohanCT();
			break;
		}
		}while(control!=0);
	    }
	}

