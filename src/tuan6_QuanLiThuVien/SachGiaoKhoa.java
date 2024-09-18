package tuan6_QuanLiThuVien;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	 private String tinhTrang; // "mới" hoặc "cũ"

	    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB, String tinhTrang) {
	        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
	        this.tinhTrang = tinhTrang;
	    }

	    @Override
	    public double thanhTien() {
	        if ("mới".equalsIgnoreCase(tinhTrang)) {
	            return soLuong * donGia;
	        } else {
	            return soLuong * donGia * 0.5;
	        }
	    }
}
