package tuan6_QuanLiThuVien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuanLi {
	 public static void main(String[] args) {
	        ThuVien thuVien = new ThuVien();
	        Scanner scanner = new Scanner(System.in);

	        // Nhập sách giáo khoa
	        System.out.println("Nhập số lượng sách giáo khoa:");
	        int nGiaoKhoa = scanner.nextInt();
	        scanner.nextLine(); // Đọc dòng mới

	        for (int i = 0; i < nGiaoKhoa; i++) {
	            System.out.println("Nhập thông tin sách giáo khoa (Mã, Ngày nhập (dd/MM/yyyy), Đơn giá, Số lượng, Nhà xuất bản, Tình trạng):");
	            String maSach = scanner.nextLine();
	            String ngayNhapStr = scanner.nextLine();
	            LocalDate ngayNhap = convertToDate(ngayNhapStr);
	            double donGia = scanner.nextDouble();
	            int soLuong = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng mới
	            String nhaXB = scanner.nextLine();
	            String tinhTrang = scanner.nextLine();
	            thuVien.themSach(new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXB, tinhTrang));
	        }

	        // Nhập sách tham khảo
	        System.out.println("Nhập số lượng sách tham khảo:");
	        int nThamKhao = scanner.nextInt();
	        scanner.nextLine(); // Đọc dòng mới

	        for (int i = 0; i < nThamKhao; i++) {
	            System.out.println("Nhập thông tin sách tham khảo (Mã, Ngày nhập (dd/MM/yyyy), Đơn giá, Số lượng, Nhà xuất bản, Thuế):");
	            String maSach = scanner.nextLine();
	            String ngayNhapStr = scanner.nextLine();
	            LocalDate ngayNhap = convertToDate(ngayNhapStr);
	            double donGia = scanner.nextDouble();
	            int soLuong = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng mới
	            String nhaXB = scanner.nextLine();
	            double thue = scanner.nextDouble();
	            thuVien.themSach(new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXB, thue));
	        }

	        // Xuất danh sách sách
	        System.out.println("Danh sách sách:");
	        thuVien.xuatDanhSach();

	        // Tính tổng thành tiền
	        System.out.println("Tổng thành tiền: " + thuVien.tongThanhTien());

	        // Tính trung bình cộng đơn giá sách tham khảo
	        System.out.println("Trung bình cộng đơn giá sách tham khảo: " + thuVien.trungBinhDonGiaSachThamKhao());

	        // Xuất ra sách giáo khoa của nhà xuất bản cụ thể
	        System.out.println("Nhập nhà xuất bản để tìm sách giáo khoa:");
	        String nhaXB = scanner.nextLine();
	        thuVien.xuatSachGiaoKhoaNhaXuatBan(nhaXB);

	        scanner.close();
	    }

	    // Phương thức chuyển đổi chuỗi ngày thành LocalDate
	    public static LocalDate convertToDate(String dateString) {
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return LocalDate.parse(dateString, dateFormatter);
	    }
	}

