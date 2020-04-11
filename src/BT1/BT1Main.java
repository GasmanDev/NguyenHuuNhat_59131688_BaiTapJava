/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author MSI
 */
public class BT1Main {
    public static void main(String[] args)
    {
        NhanVien nv1 = new NhanVien("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", 1000000, 300);
        System.out.println(nv1.getThongTin());
    }
}
