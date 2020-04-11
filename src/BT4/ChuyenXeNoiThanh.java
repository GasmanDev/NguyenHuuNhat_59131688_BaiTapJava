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
public class ChuyenXeNoiThanh extends ChuyenXe{
    
    String soTuyen;
    double soKmDiDuoc;
    //getter setter
    public String getSoTuyen()
    {
        return this.soTuyen;
    }
    public void setSoTuyen(String soTuyen)
    {
        this.soTuyen = soTuyen;
    }
    public double getSoKmDiDuoc()
    {
        return this.soKmDiDuoc;
    }
    public void setSoKmDiDuoc(double soKmDiDuoc)
    {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    //pt
    public ChuyenXeNoiThanh(){};
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public void inThongTinChuyenXe()
    {
        super.inThongTinChuyenXe();
        System.out.println("Số tuyến: " + this.soTuyen);
        System.out.println("Số Km đi được: " + this.soKmDiDuoc);
    }
    
}
