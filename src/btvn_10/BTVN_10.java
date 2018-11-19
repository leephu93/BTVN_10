package btvn_10;

import java.util.Scanner;

abstract public class BTVN_10 {
    
    private String hoten;    
    private String mathe;
    private int namsinh;

    private String getHoten() {
        return hoten;
    }

    private void setHoten(String hoten) {
        this.hoten = hoten;
    }

    private String getMathe() {
        return mathe;
    }

    private void setMathe(String mathe) {
        this.mathe = mathe;
    }

    private int getNamsinh() {
        return namsinh;
    }

    private void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    
    public void INSERT(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP HỌ TÊN: ");
        this.setHoten(scanner.nextLine());
        System.out.print("NHẬP MÃ THẺ: ");
        this.setMathe(scanner.nextLine());
        System.out.print("NHẬP NĂM SINH: ");
        this.setNamsinh(scanner.nextInt());
    }
    
    public void SHOW(){
        System.out.println("HỌ & TÊN: "+this.getHoten());
        System.out.println("NĂM SINH: "+this.getNamsinh());
        System.out.println("MÃ THẺ: "+this.getMathe());
    }
    
    abstract void TINHTOAN();
}
