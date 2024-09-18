package tuan6_QuanLiThuVien;

import java.util.ArrayList;

public class ThuVien {
	 private ArrayList<Sach> danhSachSach;

	    public ThuVien() {
	        danhSachSach = new ArrayList<>();
	    }

	    public void themSach(Sach sach) {
	        danhSachSach.add(sach);
	    }

	    public void xuatDanhSach() {
	        for (Sach sach : danhSachSach) {
	            System.out.println(sach);
	        }
	    }

	    public double tongThanhTien() {
	        double tong = 0;
	        for (Sach sach : danhSachSach) {
	            tong += sach.thanhTien();
	        }
	        return tong;
	    }

	    public double trungBinhDonGiaSachThamKhao() {
	        double tongDonGia = 0;
	        int count = 0;
	        for (Sach sach : danhSachSach) {
	            if (sach instanceof SachThamKhao) {
	                tongDonGia += sach.getDonGia();
	                count++;
	            }
	        }
	        return count > 0 ? tongDonGia / count : 0;
	    }

	    public void xuatSachGiaoKhoaNhaXuatBan(String nhaXB) {
	        for (Sach sach : danhSachSach) {
	            if (sach instanceof SachGiaoKhoa && sach.nhaXB.equalsIgnoreCase(nhaXB)) {
	                System.out.println(sach);
	            }
	        }
	    }
}
