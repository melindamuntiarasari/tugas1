
import java.util.Scanner;

public class MainAlamatBuku {
    public class Main {
    AlamatBuku buku = new AlamatBuku();
    Scanner s = new Scanner(System.in);
    String[][] data = new String[100][4];
    
    private void input(String nama, String alamat, String telepon, String email){
        buku.setNama(nama);
        buku.setAlamat(alamat);
        buku.setTelepon(telepon);
        buku.setEmail(email);
    }
    
    private void insert(int ind1){
        data[ind1-1][0] = buku.getNama();
        data[ind1-1][1] = buku.getAlamat();
        data[ind1-1][2] = buku.getTelepon();
        data[ind1-1][3] = buku.getEmail();
    }
    
    private void update(int ind1, int ind2, String update){
        data[ind1-1][ind2-1] = update;
    }
    
    private void delete(int ind1){
        data[ind1-1][0] = null;
        data[ind1-1][1] = null;
        data[ind1-1][2] = null;
        data[ind1-1][3] = null;
    }
    
    private void show(){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1)+" => "+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
        }
    }
}
    
    public static void main(String[] args) {
        
        
    }
}

