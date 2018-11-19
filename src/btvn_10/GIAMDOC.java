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
public class GIAMDOC extends BTVN_10{

    @Override
    void TINHTOAN() {
        System.out.println("TIỀN TIÊU HÀNG NGÀY");
    }

    public static void main(String[] args) {
        GIAMDOC gd1 = new GIAMDOC();
        System.out.println("NHẬP THÔNG TIN GIÁM ĐỐC:");
        gd1.INSERT();
        gd1.SHOW();
        gd1.TINHTOAN();
    }
}
