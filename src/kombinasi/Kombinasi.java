/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kombinasi;

/**
 *
 * @author AdiRahmad
 */
public class Kombinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kombinasi kombi = new Kombinasi();
        System.out.println("Hasil Kombinasi " + kombi.Kombinasi(20 , 11));
    }

    public double Kombinasi(double bilanganN, double bilanganK) {

        double bilanganC = bilanganN - bilanganK;

        double hasilS1 = 1;
        double hasilS2 = 1;
        double hasilS3 = 1;

        for (int i = 2; i <= bilanganN; i++) {
            hasilS1 = hasilS1 * i;
        }

        for (int i = 2; i <= bilanganK; i++) {
            hasilS2 = hasilS2 * i;
        }
                        
        for (int i = 2; i <= bilanganC; i++) {
            hasilS3 = hasilS3 * i;
        }
        double hasilS4 = hasilS2 * hasilS3;

//            
        double hasilkombinasi = hasilS1/hasilS4;
        
//double hasilkombinasi = hasilS1 / (hasilS3 * hasilS2);
//        

        return hasilkombinasi;

    }
}
