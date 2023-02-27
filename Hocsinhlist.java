package test1;

import java.util.Scanner;


public class Hocsinhlist {
      Hocsinh arr[];
      int n;
      public Hocsinhlist() {
	}
	public void inputHSlist() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Nhap so hoc sinh");
    	  n = Integer.parseInt(sc.nextLine());
    	  arr = new Hocsinh[n];
    	  for(int i=0;i<n;i++) {
    		  arr[i] = new Hocsinh();
    		  arr[i].inputHS();
    	  }
	}
	public void showHSlist() {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].toString());
		}
	}
	public void tongTienan() {
		int tong=0;
		for(int i=0;i<n;i++) {
			tong += arr[i].tienan;
		}
		System.out.println("Tong tien an so hoc sinh la" + tong);
	}
	public void timHSlist() {
		System.out.println("Hoc sinh co buoi an lon hon 20 la");
		for(int i=0;i<n;i++) {
			if(arr[i].tienan > 20*30000) {
			   System.out.println(arr[i].toString());
			}
		}
	}
}
