package PBO;
public class Customer {
    
    public static void main(String[] args) {
        System.out.println("Selamat Datang di BeliKopi!");
        Customer s = new Customer();
        s.tampilNama();
        String menu = "Matcha Latte";
        System.out.println("Menu yang dipesan: "+menu);
    }
        public void tampilNama(){
            String nama = "Valencia";
            System.out.println("Nama Customer: "+ nama);
        }

        public String usia (String menuDipesan){
            String menu = menuDipesan;
            return menu;
        }
    }

