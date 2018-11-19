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
public class GIANGVIEN extends BTVN_10{

    @Override
    void TINHTOAN() {
        System.out.println("TIỀN LƯƠNG HÀNG THÁNG");
    }

    public static void main(String[] args) {
        GIANGVIEN gv1 = new GIANGVIEN();
        System.out.println("NHẬP THÔNG TIN GIẢNG VIÊN:");
        gv1.INSERT();
        gv1.SHOW();
        gv1.TINHTOAN();
    }
}
