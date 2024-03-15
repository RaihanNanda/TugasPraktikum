
public class BangunDatar {
    private int p; //panjang
    private int l; //lebar
    private int s; //sisi
    
    //konstruktur untuk persegi panjang
    BangunDatar (int p, int l){
        this.p = p;
        this.l = l;    
    }
    
    //konstruktur untuk BujurSangkar
    BangunDatar (int s){
        this.s = s;
    }
    
    void setPl(int p,int l){
        this.p = p;
        this.l = l;
    }
    
    void setS(int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL(){
        return l;
    }
    
    int getS(){
        return s;
    }
    
}
