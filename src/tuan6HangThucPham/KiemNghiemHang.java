package tuan6HangThucPham;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class KiemNghiemHang {
    public static void main(String[] args) {
        // Tạo đối tượng HangThucPham và kiểm tra
        HangTP htp1 = new HangTP("TP01", "Sữa tươi", 15000, new Date(), new Date(new Date().getTime() + 1000L * 60 * 60 * 24 * 10));
        System.out.println(htp1);

        System.out.println("\n---\n");

        HangTP htp2 = new HangTP("TP02");
        htp2.setTenHang("Bánh mì");
        htp2.setDonGia(5000);
        htp2.setNgaySX(new Date());

        // Nhập ngày hết hạn từ người dùng
        System.out.println("Nhập ngày hết hạn (dd/MM/yyyy):");
        String ngayChuoi = new Scanner(System.in).nextLine();
        LocalDate ngayNhap = HangTP.convertToDate(ngayChuoi);
        htp2.setNgayHH(java.sql.Date.valueOf(ngayNhap)); // convert LocalDate to Date

        System.out.println(htp2);
    }
}
