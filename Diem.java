package test4;

import java.util.Scanner;

public class Diem {
     double x,y;
     public Diem() {
	}
     public Diem(double x, double y) {
		this.x = x;
		this.y = y;
	}
     
    public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do:");
		this.x = sc.nextDouble();
		System.out.println("Nhap tung do:");
		this.y = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
    
}
