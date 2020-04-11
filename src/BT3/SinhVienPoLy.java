/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author MSI
 */
public abstract class SinhVienPoLy {
    public String hoTen;
    public String nganh;
    //getter setter
    public String getHoTen()
    {
        return this.hoTen;
    }
    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public String getNganh()
    {
        return this.nganh;
    }
    public void setNganh(String nganh)
    {
        this.nganh = nganh;
    }
    //PT
    public SinhVienPoLy()
    {
        
    }
    public SinhVienPoLy(String hoTen, String nganh)
    {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        if (getDiem() < 5) return "Yếu";
        else if (getDiem() < 6.5) return "Trung Bình";
        else if (getDiem() < 7.5) return "Khá";
        else if (getDiem() < 9) return "Giỏi";
        else return "Xuất sắc";
    }
    
    public void xuat()
    {
        System.out.println("Sinh viên: " + hoTen);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
