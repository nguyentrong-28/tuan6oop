package tuan6HangThucPham;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangTP {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHH;

    public HangTP(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
    }

    public HangTP(String maHang) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        this.maHang = maHang;
    }

    // Getters and Setters
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = (tenHang == null || tenHang.isEmpty()) ? "Không xác định" : tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = (donGia <= 0) ? 1.0 : donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = (ngaySX == null) ? new Date() : ngaySX;
    }

    public Date getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(Date ngayHH) {
        if (ngayHH == null || (ngaySX != null && ngayHH.before(ngaySX))) {
            this.ngayHH = new Date(ngaySX.getTime() + (1000L * 60 * 60 * 24 * 30)); 
        } else {
            this.ngayHH = ngayHH;
        }
    }

    public boolean isHetHan() {
        Date currentDate = new Date();
        return ngayHH.before(currentDate);
    }

    public static LocalDate convertToDate(String dateString) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, dateFormatter);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00 VND");
        String donGiaString = decimalFormat.format(donGia);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return String.format("Mã hàng: %s\nTên hàng: %s\nĐơn giá: %s\nNgày sản xuất: %s\nNgày hết hạn: %s\nHết hạn: %s",
                maHang, tenHang, donGiaString, dateFormat.format(ngaySX), dateFormat.format(ngayHH), isHetHan() ? "Có" : "Không");
    }
}
