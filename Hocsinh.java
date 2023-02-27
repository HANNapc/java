package test1;

import java.util.Scanner;

public class Hocsinh {
      private String id,name,lop;
      private int sobuoi;
      int tienan;
      static final int dongia=30000;
	public Hocsinh() {
	}
	public Hocsinh(String id, String name, String lop, int sobuoi) {
		this.id = id;
		this.name = name;
		this.lop = lop;
		this.sobuoi = sobuoi;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getSobuoi() {
		return sobuoi;
	}
	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}
	
	public void inputHS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien");
		this.id = sc.nextLine();
		System.out.println("Nhap ho ten:");
		this.name = sc.nextLine();
		System.out.println("Nhap ten lop:");
		this.lop = sc.nextLine();
		System.out.println("Nhap so buoi an:");
		this.sobuoi = Integer.parseInt(sc.nextLine());
		this.tienan = this.sobuoi*dongia;
		}
	
	@Override
	public String toString() {
		return "Hocsinh [id=" + id + ", name=" + name + ", lop=" + lop + ", sobuoi=" + sobuoi + ", tienan=" + tienan
				+ "]";
	}
      
}
