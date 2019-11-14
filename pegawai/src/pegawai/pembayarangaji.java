
package pegawai;
class pembayarangaji {
    
    public int hitungGaji(Pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof staff)
            uang+=((staff)peg).bonus();
        return uang;
        
        
    }
    public static void main(String[] args){
        pembayarangaji pg=new pembayarangaji();
        staff al1 = new staff();
        direktur tony = new direktur();
        System.out.println("gaji yang dibayarkan ke staff = "+pg.hitungGaji(al1));
        System.out.println("gaji yang dibayarkan ke direktur = "+pg.hitungGaji(tony));
    }
    
    }
    
    

    

