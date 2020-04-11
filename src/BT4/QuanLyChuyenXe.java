/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.util.ArrayList;
/**
 *
 * @author MSI
 */
public class QuanLyChuyenXe {
    public ArrayList<ChuyenXe> ds = new ArrayList<>();
    
    public void themChuyenXe(ChuyenXe cx)
    {
        ds.add(cx);
    }
    public ArrayList<ChuyenXe> xuatDSChuyenXe()
    {
        return this.ds;
    }
    public void inDSChuyenXe()
    {
        ds.forEach(cx -> cx.inThongTinChuyenXe());
    }
    
    public double tongDoanhThuNgoaiThanh()
    {
        double doanhThu = 0;
        for (ChuyenXe i : ds)
        {
            if (i instanceof ChuyenXeNgoaiThanh)
            {
                doanhThu += ((ChuyenXeNgoaiThanh) i).doanhThu;
            }
        }
        return doanhThu;
    }
    public double tongDoanhThuNoiThanh()
    {
        double doanhThu = 0;
        for (ChuyenXe i : ds)
        {
            if (i instanceof ChuyenXeNoiThanh)
            {
                doanhThu += ((ChuyenXeNoiThanh) i).doanhThu;
            }
        }
        return doanhThu;
    }
    public double tongDoanhThu()
    {
        double s = 0;
        for (ChuyenXe i : ds)
        {
            s += i.doanhThu;
        }
        return s;
    }
}
