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
public class SinhVienBiz extends SinhVienPoLy{
    public double diemMarketing;
    public double diemSales;
    //getter setter
    public double getDiemMarketing()
    {
        return this.diemMarketing;
    }
    public void setDiemMarketing(double diemMarketing)
    {
        this.diemMarketing = diemMarketing;
    }
    public double getDiemSales()
    {
        return this.diemSales;
    }
    public void setDiemSales(double diemSales)
    {
        this.diemSales = diemSales;
    }
    //pt
    public SinhVienBiz(){}
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales)
    {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem()
    {
        return ((2*diemMarketing + diemSales)/3);
    }
}
