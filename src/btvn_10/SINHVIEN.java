/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_10;

/**
 *
 * @author leeph
 */
public class SINHVIEN extends BTVN_10{
    
    @Override
    void TINHTOAN() {
        System.out.println("TIỀN HỌC PHÍ CÒN NỢ");
    }
    
    public static void main(String[] args) {
        SINHVIEN sv1 = new SINHVIEN();
        System.out.println("NHẬP THÔNG TIN SINH VIÊN:");
        sv1.INSERT();
        sv1.SHOW();
        sv1.TINHTOAN();
    }
}
