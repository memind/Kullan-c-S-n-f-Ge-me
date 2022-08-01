import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fiz = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        tur = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kim = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muz = inp.nextInt();

        if (mat < 0 || mat > 100)
            mat = 0;
        if (fiz < 0 || fiz > 100)
            fiz = 0;
        if (kim < 0 || kim > 100)
            kim = 0;
        if (tur < 0 || tur > 100)
            tur = 0;
        if (muz < 0 || muz > 100)
            muz = 0;

        double ort = (mat+fiz+tur+kim+muz)/5;
        
        if (ort < 55){
            System.out.print("Sınıfta Kaldınız! Not Ortalamanız: " + ort);
        }
        else{
            System.out.println("Geçtiniz! Not Ortalamanız: " + ort);
        }
    }
}