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
public abstract class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;
    
    //getter setter
    public String getMaSoChuyen()
    {
        return this.maSoChuyen;
    }
    public void setMaSoChuyen(String maSoChuyen)
    {
        this.maSoChuyen = maSoChuyen;
    }
    public String getHoTenTaiXe()
    {
        return this.hoTenTaiXe;
    }
    public void setHoTenTaiXe(String hoTenTaiXe)
    {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public String getSoXe()
    {
        return this.soXe;
    }
    public void setSoXe(String soXe)
    {
        this.soXe = soXe;
    }
    public double getDoanhThu()
    {
        return  this.doanhThu;
    }
    public void setDoanhThu(double doanhThu)
    {
        this.doanhThu = doanhThu;
    }
    //PT
    public ChuyenXe(){}
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu)
    {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public void inThongTinChuyenXe()
    {
        System.out.print("Mã số chuyến: " + this.maSoChuyen + "\nHọ Tên tài xế: " + this.hoTenTaiXe +
                "\nSố xe: " + this.soXe + "\nDoanh thu: " + this.doanhThu);
    }
}
