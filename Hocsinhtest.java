package test1;

import java.util.Scanner;

public class Hocsinhtest {
	public static void main(String[] args) {
	   Hocsinhlist hs;
	   hs = new Hocsinhlist();
	   int control;
	   do{
	   System.out.println("======BANG TIM KIEM======");
	   System.out.println("Bam 1:Nhap thong tin hoc sinh");
	   System.out.println("Bam 2:Hien danh sach hoc sinh");
	   System.out.println("Bam 3:Tong tien an cua hoc sinh");
	   System.out.println("Bam 4:Danh sach hoc sinh co buoi an ban tru tren 20");
	   System.out.println("===========***==========");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Nhap so can chon:");
	   control = Integer.parseInt(sc.nextLine());
	   switch (control) {
	case 1:
		hs.inputHSlist();
		break ;
	case 2:
		hs.showHSlist();
		break;
	case 3:
		hs.tongTienan();
		break;
	case 4:
		hs.timHSlist();
		break;
	}
	}while(control!=0);
    }
}
