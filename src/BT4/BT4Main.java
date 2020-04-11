/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author MSI
 */
public class BT4Main {
    public static void main(String[] args)
    {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        
        ChuyenXeNgoaiThanh cx1 = new ChuyenXeNgoaiThanh("NGT1", "Hữu Nhật", "85-A", 50000, "Nha Trang", 5);
        ChuyenXeNgoaiThanh cx2 = new ChuyenXeNgoaiThanh("NGT2", "Hữu Nhật", "85-B", 50000, "Nha Trang", 5);
        
        ChuyenXeNoiThanh cx3 = new ChuyenXeNoiThanh("NT1", "Hữu Thạch", "85-C", 30000, "Tuyến 7", 500);
        ChuyenXeNoiThanh cx4 = new ChuyenXeNoiThanh("NT1", "Hữu Thạch", "85-C", 30000, "Tuyến 7", 500);
        
        qlcx.themChuyenXe(cx1);
        qlcx.themChuyenXe(cx2);
        qlcx.themChuyenXe(cx3);
        qlcx.themChuyenXe(cx4);
        
        qlcx.inDSChuyenXe();
        System.out.println("Tổng doanh thu chuyến xe ngoại thành: " + qlcx.tongDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu chuyến xe nội thành: " + qlcx.tongDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu  cả 2 chuyến xe: " + qlcx.tongDoanhThu());
    }
}
