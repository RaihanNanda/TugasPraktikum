
public class PersegiPanjang extends BangunDatar{
    
     PersegiPanjang (int p, int l){
        super(p,l);
    }
    int HitungLuas(){
        int p = super.getP();
        int l = super.getL();
        
        return p * l;
    }
    
    int HitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        
        return 2*p + 2*1;
    }
    
    public String toString(){
        String hasil = "Luas Persegi Panjang :" + HitungLuas() + "\n"+
        "Keliling Persegi Panjang :" + HitungKeliling();
        
        return hasil;
    
}
    
}
