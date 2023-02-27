package test2;

import java.util.Scanner;

public class Nhapthongtin {
	private double cd, cr,s,c;
	public Nhapthongtin() {
	}
	public Nhapthongtin(double cd, double cr, double s, double c) {
		this.cd = cd;
		this.cr = cr;
		this.s = s;
		this.c = c;
	}

	public double getCd() {
		return cd;
	}

	public void setCd(double cd) {
		this.cd = cd;
	}

	public double getCr() {
		return cr;
	}

	public void setCr(double cr) {
		this.cr = cr;
	}
      public void nhapHCN() {
    	  Scanner sc = new Scanner(System.in);
    	  do {
    	  System.out.println("Nhap chieu dai:");
    	  this.cd = sc.nextDouble();
    	  System.out.println("Nhap chieu rong:");
    	  this.cr = sc.nextDouble();
    	  if(cd<cr) {
    		  System.out.println("Nhap sai. Vui long nhap lai!");
    	  }
    	  }while(cd<cr);
      }

	@Override
	public String toString() {
		return "Hinh chu nhat: chieu dai=" + cd + ", chieu rong =" + cr + ", dien tich=" + s + ", chu vi=" + c;
	}
      public void tinhHCN() {
    	  this.s = cd*cr;
    	  this.c = (cd+cr)*2;	
	}
     public void showHCN() {
    	 System.out.println(toString());
		
	}
      
}
