/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

import BT1.NhanVien;
/**
 *
 * @author MSI
 */
public class QuanLyNhanVien implements IQuanLy {
    
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv)
    {
        dsNhanVien.add(nv);
    }
    
    @Override
    public void inDS(){
        dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
    }
}
