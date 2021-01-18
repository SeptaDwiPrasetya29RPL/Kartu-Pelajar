
package kartupelajar;

import java.util.Scanner;

public class kartupelajarr {
    Scanner in = new Scanner(System.in);
    String nama;
    String nisn;
    String ttl;
    String kelamin;
    String agama;
    String alamat;
    
    
    String nama(){    
        System.out.print("NAMA           : ");
        nama = in.nextLine();
        return nama;
    }
    String nisn(){
        System.out.print("NISN           : ");
        nisn = in.nextLine();
        return nisn;
    }
    String kelamin(){
        System.out.print("JENIS KELAMIN  : ");
        kelamin = in.nextLine();
        return kelamin;
    }
    String ttl(){
        System.out.print("T.T.L          : ");
        ttl = in.nextLine();
        return ttl;
    }
    String agama(){
        System.out.print("AGAMA          : ");
        agama = in.nextLine();
        return agama;
    }
    String alamat(){
        System.out.print("ALAMAT         : ");
        alamat = in.nextLine();
        return alamat;
    }

    
    
    
}
