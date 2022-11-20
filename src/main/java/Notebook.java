
public class Notebook extends Product {



    public Notebook(int id, double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi, Brand brand,
                    int ram, int depolama, double ekranBoyutu) {
        super(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, brand);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }




}