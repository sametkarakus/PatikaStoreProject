import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {

    private String name;
    private static ArrayList<Brand> markalar;
    private static ArrayList<Product> urunler;
    private static Scanner scanner = new Scanner(System.in);

    public void notebookModel(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | �r�n Ad�                      | Fiyat     | Brand     | Depolama  | Ekran     | RAM         |");
        System.out.print("----------------------------------------------------------------------------------------------------\n|");
    }
    public void mobilePhoneModel(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | �r�n Ad�                      | Fiyat     | Brand     | Depolama  | Ekran    | Pil       | RAM       | Renk      |");
        System.out.print("--------------------------------------------------------------------------------------------------------------------------------------\n|");
    }
    static {
        markalar = new ArrayList<>();
        markalar.add(new Brand(1, "Samsung"));
        markalar.add(new Brand(2, "Lenovo"));
        markalar.add(new Brand(3, "Apple"));
        markalar.add(new Brand(4, "Huawei"));
        markalar.add(new Brand(5, "Casper"));
        markalar.add(new Brand(6, "Asus"));
        markalar.add(new Brand(7, "HP"));
        markalar.add(new Brand(8, "Xiaomi"));
        markalar.add(new Brand(9, "Monster"));

        urunler = new ArrayList<>();

        // Cep Telefonu
        urunler.add(new MobilePhone(1, 3199.0, 0, 1, "SAMSUNG GALAXY A51",
                markalar.get(1), 128, 6.5, 32, 4000, "Siyah"));

        urunler.add(new MobilePhone(2, 7379.0, 0, 1, "iPhone 11 64 GB",
                markalar.get(3), 128, 6.1, 5, 3046,  "Mavi"));

        urunler.add(new MobilePhone(3, 4012.0, 0, 1, "Redmi Note 10 Pro 8GB",
                markalar.get(8), 128, 6.5, 35, 4000,  "Beyaz"));

        // Notebook
        urunler.add(new Notebook(1, 7000.0, 0, 1, "HUAWEI Matebook 14", markalar.get(3),
                16, 512, 14.0));

        urunler.add(new Notebook(2, 3699.0, 0, 1, "LENOVO V14 IGL", markalar.get(1),
                8, 1024, 14.0));

        urunler.add(new Notebook(3, 8199.0, 0, 1, "ASUS Tuf Gaming", markalar.get(5),
                32, 2048, 15.6));
    }

    public PatikaStore(String name) {
        this.name = name;
    }

    public void urunleriListeleByKategori() {}

    public void printMenu() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook Islemleri");
        System.out.println("2 - Cep Telefonu Islemleri");
        System.out.println("3 - Brand Listele");
        System.out.println("4 - Urunleri Listele");
        System.out.println("0 - Cikis Yap");
        System.out.print("Tercihiniz : ");
    }

    public void markaListele() {
        System.out.println("Markalarimiz");
        System.out.println("-------------------");
        for(int i = 0; i < markalar.size(); i++) {
            System.out.println("- " + markalar.get(i).getName());
        }
        System.out.println();
    }

    public void urunleriListele() {

        System.out.println("Notebook Listesi\n");
        notebookModel();

        boolean check = false;
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i) instanceof Notebook) {
                Notebook n = (Notebook) urunler.get(i);
                if(check) System.out.print("|");
                String temp = "";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAdý());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyati());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
                if(!check) check = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("\nCep Telefonu Listesi\n");
        mobilePhoneModel();

        check = false;
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i) instanceof MobilePhone) {
                MobilePhone c = (MobilePhone) urunler.get(i);
                if(check) System.out.print("|");
                String temp = "";
                temp += " " + String.format("%-" + 3 + "s" ,c.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,c.getUrunAdý());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getBirimFiyati());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getBrand().getName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getHafiza());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getPilGucu());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getRam());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getRenk());
                temp += "|";
                System.out.println(temp);
                if(!check) check = true;
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void cepTelefonlariniListele() {
        System.out.println("\nCep Telefonu Listesi\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | �r�n Ad�                      | Fiyat     | Brand     | Depolama  | Ekran    | Pil       | RAM       | Renk      |");
        System.out.print("--------------------------------------------------------------------------------------------------------------------------------------\n|");
        boolean check = false;
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i) instanceof MobilePhone) {
                MobilePhone c = (MobilePhone) urunler.get(i);
                if(check) System.out.print("|");
                String temp = "";
                temp += " " + String.format("%-" + 3 + "s" ,c.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,c.getUrunAdý());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getBirimFiyati());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getBrand().getName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getHafiza());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getPilGucu());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getRam());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,c.getRenk());
                temp += "|";
                System.out.println(temp);
                if(!check) check = true;
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void notebooklariListele() {
        System.out.println("Notebook Listesi\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | �r�n Ad�                      | Fiyat     | Brand     | Depolama  | Ekran     | RAM         |");
        System.out.print("----------------------------------------------------------------------------------------------------\n|");
        boolean check = false;
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i) instanceof Notebook) {
                Notebook n = (Notebook) urunler.get(i);
                if(check) System.out.print("|");
                String temp = "";
                temp += " " + String.format("%-" + 3 + "s" ,n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s" ,n.getUrunAdý());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBirimFiyati());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getBrand().getName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getDepolama());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s" ,n.getEkranBoyutu());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s" ,n.getRam());
                temp += "|";
                System.out.println(temp);
                if(!check) check = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public boolean urunEkle(String urunClassName) {
        if(urunClassName.equals("MobilePhone")) {
            System.out.print("Urunun id'sini giriniz: ");
            int id = scanner.nextInt();

            System.out.print("Urunun birim fiyatini giriniz: ");
            double birimFiyati = scanner.nextDouble();

            System.out.print("Urunun indirim oranini giriniz: ");
            double indirimOrani = scanner.nextDouble();

            System.out.print("Urunun stok miktarini giriniz: ");
            int stokMiktari = scanner.nextInt();

            System.out.print("Urunun adini giriniz: ");
            String urunAdi = scanner.nextLine();

            for(int i = 0; i < markalar.size(); i++) {
                System.out.println(i + ") " + markalar.get(i).getName());
            }
            System.out.println();
            System.out.print("Urunun markasini seciniz: ");
            int markaIndex = scanner.nextInt();
            Brand brand = markalar.get(markaIndex - 1);

            System.out.print("Urunun hafizasini giriniz: ");
            int hafiza = scanner.nextInt();

            System.out.print("Urunun ekran boyutunu giriniz: ");
            double ekranBoyutu = scanner.nextDouble();

            System.out.print("Urunun pil gucunu giriniz: ");
            double pilGucu = scanner.nextDouble();

            System.out.print("Urunun ram'ini giriniz: ");
            int ram = scanner.nextInt();

            System.out.print("Urunun rengini giriniz: ");
            String renk = scanner.nextLine();

            Product yeniProduct = new MobilePhone(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, brand, hafiza, ekranBoyutu,pilGucu, ram, renk);
            urunler.add(yeniProduct);
            return true;
        } else if(urunClassName.equals("Notebook")) {
            System.out.print("Urunun id'sini giriniz: ");
            int id = scanner.nextInt();

            System.out.print("Urunun birim fiyatini giriniz: ");
            double birimFiyati = scanner.nextDouble();

            System.out.print("Urunun indirim oranini giriniz: ");
            double indirimOrani = scanner.nextDouble();

            System.out.print("Urunun stok miktarini giriniz: ");
            int stokMiktari = scanner.nextInt();

            System.out.print("Urunun adini giriniz: ");
            String urunAdi = scanner.nextLine();

            for(int i = 0; i < markalar.size(); i++) {
                System.out.println(i + ") " + markalar.get(i).getName());
            }
            System.out.println();
            System.out.print("Urunun markasini seciniz: ");
            int markaIndex = scanner.nextInt();
            Brand brand = markalar.get(markaIndex - 1);

            System.out.print("Urunun ram'ini giriniz: ");
            int ram = scanner.nextInt();

            System.out.print("Urunun depolama alanini giriniz: ");
            int depolama = scanner.nextInt();

            System.out.print("Urunun ekran boyutunu giriniz: ");
            double ekranBoyutu = scanner.nextDouble();

            Product yeniProduct = new Notebook(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, brand, ram, depolama, ekranBoyutu);
            urunler.add(yeniProduct);
            return true;
        } else {
            System.out.println("Yanlis urun grubu sectiniz. Boyle bir urun grubu bulunmamakta.");
            return false;
        }
    }

    public boolean urunSil(String className, int id) {
        for(int i = 0; i < urunler.size(); i++) {
            try {
                if(urunler.get(i).getId() == id && Class.forName(className).isInstance(urunler.get(i))) {
                    urunler.remove(i);
                    return true;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Product filterUrunById(int id) {
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i).getId() == id) return urunler.get(i);
        }
        return null;
    }

    public ArrayList<Product> filterUrunByMarka(Brand brand) {
        ArrayList<Product> filteredUrunler = new ArrayList<>();
        for(int i = 0; i < urunler.size(); i++) {
            if(urunler.get(i).getBrand().getName().equals(brand.getName())) {
                filteredUrunler.add(urunler.get(i));
            }
        }
        return filteredUrunler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Brand> getMarkalar() {
        return markalar;
    }
}