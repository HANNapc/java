package test3;

import java.util.Scanner;

public class Congnhan {
    static float lcb = 1150;
    private float hsl;
    private String hoten;
    float luong;
	public Congnhan(float hsl, String hoten,float luong) {
		this.hsl = hsl;
		this.hoten = hoten;
		this.luong = luong;
	}
	public Congnhan() {
	}
	public float getHsl() {
		return hsl;
	}
	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public void nhapThongtin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten:");
		this.hoten= sc.nextLine();
		System.out.println("Nhap hsl:");
		this.hsl =sc.nextFloat();
		this.luong = lcb*this.hsl;
	}
	
	@Override
	public String toString() {
		return "hsl=" + hsl + ", hoten=" + hoten + ", luong=" + luong + "]";
	}
	public void showThongtin() {
    	System.out.println(toString());
    }
}
