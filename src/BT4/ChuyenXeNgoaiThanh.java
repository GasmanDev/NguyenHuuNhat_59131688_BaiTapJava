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
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    
    String noiDen;
    int soNgayDiDuoc;
    //getter setter
    public String getNoiDen()
    {
        return this.noiDen;
    }
    public void setNoiDen(String noiDen)
    {
        this.noiDen = noiDen;
    }
    public int getSoNgayDiDuoc()
    {
        return this.soNgayDiDuoc;
    }
    public void setSoNgayDiDuoc(int soNgayDiDuoc)
    {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    //PT
    public ChuyenXeNgoaiThanh()
    {
        
    }
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    @Override
    public void inThongTinChuyenXe()
    {
        super.inThongTinChuyenXe();
        System.out.println("Nơi đến: " + this.noiDen);
        System.out.println("Số ngày đi được: " + this.soNgayDiDuoc);
    }
    
}
