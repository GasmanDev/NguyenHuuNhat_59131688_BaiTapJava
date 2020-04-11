/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;

/**
 *
 * @author MSI
 */
public class BT2Main {
    public static void main(String[] args)
    {
        QuanLyNhanVien ds = new QuanLyNhanVien();
        
        NhanVien nv1 = new NhanVien("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        NhanVien nv2 = new NhanVien("Nguyễn Hữu", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        NhanVien nv3 = new NhanVien("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        NhanVien nv4 = new NhanVien("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        NhanVien nv5 = new NhanVien("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        
        ds.them(nv1);
        ds.them(nv2);
        ds.them(nv3);
        ds.them(nv4);
        ds.them(nv5);
        
        ds.inDS();
    }
}
