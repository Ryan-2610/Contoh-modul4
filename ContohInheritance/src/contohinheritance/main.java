/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contohinheritance;

/**
 *
 * @author AXZ
 */
public class main {
    public static void main(String[] args) {
        
        //Objek Bangun datar
        
        
        Persegi prs = new Persegi();
        prs.sisi = 5;
        
        Lingkaran lkr = new Lingkaran();
        lkr.r = 4;
        lkr.phi = 3.14;
        
        PersegiPanjang prsp = new PersegiPanjang();
        prsp.lebar = 13.4;
        prsp.panjang = 12.7;
        
        Segitiga sgt = new Segitiga();
        sgt.alas = 15;
        sgt.tinggi = 10;
        
        sgt.sisia = 10;
        sgt.sisib= 5;
        sgt.sisic = 7;
        
        // Menunjukan Inheritance
        
    
        
        prs.luaspsg();
        float Luas =  (prs.sisi*prs.sisi);
        System.out.println(prs.sisi+" x "+prs.sisi+" = "+Luas);
        System.out.println("Luas Persegi Adalah: "+Luas);
        System.out.println(" ");
        prs.keliling();
        
        float Keliling = prs.sisi+prs.sisi+prs.sisi+prs.sisi;
        System.out.println("4 x Sisi = "+"4 x "+prs.sisi);
        System.out.println("Keliling Persegi Adalah: "+Keliling);
        System.out.println(" ");
        
        prsp.luas();
        double luasprsp = prsp.panjang*prsp.lebar;
        System.out.println("Panjang x Lebar = "+prsp.panjang+" x "+prsp.lebar);
        System.out.println("Panjang Persegi Panjang adalah: "+luasprsp);
        System.out.println(" ");
        prsp.keliling();
        
                double kelprsp  = 2*prsp.panjang+2*prsp.lebar;
                System.out.println("("+2+" x "+prsp.panjang+") + "+"( "+2+" x "+prsp.lebar+") = "+kelprsp);
                System.out.println("Keliling Persegi Panjang Adalah: "+kelprsp);
                System.out.println(" ");
                
                sgt.luas();
                float luassgt = sgt.alas*sgt.tinggi/2;
                System.out.println("1/2 x "+sgt.alas+" x "+sgt.tinggi+" = "+luassgt);
                System.out.println("Luas Segitiga Adalah: "+luassgt);
                System.out.println(" ");
                
                sgt.keliling();
                float kelsgt = sgt.sisia+sgt.sisib+sgt.sisic;
                System.out.println("Diketahui Sisi A = "+sgt.sisia+" cm "+" Sisi B = "+sgt.sisib+" cm "+" Sisi C = "+sgt.sisic+" cm ");
                System.out.println("Sisi A "+sgt.sisia+"+"+" Sisi B "+sgt.sisib+" + "+" Sisi C "+sgt.sisic+" = "+kelsgt);
                System.out.println("Keliling Segitiga Adalah: "+kelsgt);
                System.out.println(" ");
                
                lkr.luas();
                double luaslkr = lkr.phi*lkr.r*lkr.r;
                System.out.println("Diketahui PHI = "+lkr.phi+" Dan Jari-jari r = "+lkr.r);
                System.out.println(lkr.phi+" x "+lkr.r+" x "+lkr.r+" = "+luaslkr);
                System.out.println("Luas Lingkaran Adalah: "+luaslkr);
                System.out.println(" ");
                lkr.keliling();
                double kellkr = 2*lkr.phi*lkr.r;    
                System.out.println("Keliling Lingkaran = "+2+" x "+lkr.phi+" x "+lkr.r+" = "+kellkr);
                System.out.println("Keliling Lingkaran Adalah: "+kellkr);
    }
    
    
 
}
