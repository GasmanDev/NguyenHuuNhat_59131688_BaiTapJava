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
public class SinhVienIT extends SinhVienPoLy {
    
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    //getter setter
    public double getDiemJava()
    {
        return this.diemJava;
    }
    public void setDiemJava(double diemJava)
    {
        this.diemJava = diemJava;
    }
    public double getDiemCss()
    {
        return this.diemCss;
    }
    public void setDiemCss(double diemCss)
    {
        this.diemCss = diemCss;
    }
    public double getDiemHtml()
    {
        return this.diemHtml;
    }
    public void setDiemHtml(double diemHtml)
    {
        this.diemHtml = diemHtml;
    }
    //PT
    public SinhVienIT()
    {
        
    }
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml)
    {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem()
    {
        return ((2*diemJava+diemHtml+diemCss)/4);
    }
}
