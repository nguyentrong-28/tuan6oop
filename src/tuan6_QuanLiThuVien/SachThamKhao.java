package tuan6_QuanLiThuVien;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	    private double thue;

	    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB, double thue) {
	        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
	        this.thue = thue;
	    }

	    @Override
	    public double thanhTien() {
	        return soLuong * donGia + thue;
	    }
	}

