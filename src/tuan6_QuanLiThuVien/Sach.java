package tuan6_QuanLiThuVien;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

abstract  class Sach {

	// Lớp cha

	    protected String maSach;
	    protected LocalDate ngayNhap;
	    protected double donGia;
	    protected int soLuong;
	    protected String nhaXB;

	    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB) {
	        this.maSach = maSach;
	        this.ngayNhap = ngayNhap;
	        this.donGia = donGia;
	        this.soLuong = soLuong;
	        this.nhaXB = nhaXB;
	    }

	    public abstract double thanhTien();

	    public LocalDate getNgayNhap() {
	        return ngayNhap;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    @Override
	    public String toString() {
	        DecimalFormat df = new DecimalFormat("#,##0.00 VND");
	        String dongiaString = df.format(getDonGia());
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return String.format("|%-10s|%-15s|%-15s|%-10d|%-20s|", maSach, ngayNhap.format(dtf), dongiaString, soLuong, nhaXB);
	    }

}
