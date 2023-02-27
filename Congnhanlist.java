package test3;

import java.util.Scanner;

public class Congnhanlist {
     Congnhan arr[];
     int n;
	public Congnhanlist() {
	}
	public Congnhanlist(Congnhan[] arr, int n) {
		this.arr = arr;
		this.n = n;
	}

	public void inputCNList() {
    	 Scanner sc = new Scanner(System.in);
    	 do {
    	 System.out.println("Nhap so cong nhan");
    	 this.n = Integer.parseInt(sc.nextLine());
    	 if(this.n <= 0 || this.n >= 20) {
    		 System.out.println("Nhap sai. Vui long xem lai dieu kien");
    	 }
    	 }while(this.n <= 0 || this.n >= 20);
    	 this.arr = new Congnhan[n];
    	 for(int i=0;i<n;i++) {
    		 this.arr[i] = new Congnhan();
    		 this.arr[i].nhapThongtin();
    	}
     }
	public void outputCNList() {
		for(int i=0;i<n;i++) {
			this.arr[i].showThongtin();
		}
	}
	public void timLuong() {
		float s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong s:");
		s = Float.parseFloat(sc.nextLine());
		for(int i=0;i<n;i++) {
			if(arr[i].luong > s) {
				arr[i].showThongtin();
			}
		}
	}
}
