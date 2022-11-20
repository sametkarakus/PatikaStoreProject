public class MobilePhone extends Product {



    public MobilePhone(int id, double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi,
                       Brand brand, int hafiza, double ekranBoyutu, double pilGucu, int ram, String renk) {
        super(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, brand);
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

}