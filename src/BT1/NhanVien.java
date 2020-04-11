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
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;
    //Getter, Setter
    public String getTen()
    {
        return this.ten;
    }
    public void setTen(String ten)
    {
        this.ten = ten;
    }
    public int getTuoi()
    {
        return this.tuoi;
    }
    public void setTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public double getTienLuong()
    {
        return this.tienLuong;
    }
    public void setTienLuong(double tienLuong)
    {
        this.tienLuong = tienLuong;
    }
    public int getTongSoGioLam()
    {
        return this.tongSoGioLam;
    }
    public void setTongSoGioLam(int tongSoGioLam)
    {
        this.tongSoGioLam = tongSoGioLam;
    }
    //Phuong thuc
    public NhanVien()
    {
        
    }
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public double tinhThuong()
    {
        if (this.tongSoGioLam >= 200)
            return this.tienLuong*0.2;
        else if(this.tongSoGioLam >= 100)
            return this.tienLuong*0.1;
        return 0;
    }
    public String getThongTin()
    {
        String thongtin;
        thongtin = "Tên: " + this.ten + "\nTuổi: " + this.tuoi + "\nĐịa chỉ: " + this.diaChi
      + "\nTiền lương: " + this.tienLuong + "\nTổng số giờ làm: " + this.tongSoGioLam
      + "\nTiền thưởng: " + this.tinhThuong();
        return thongtin;
    }
}
