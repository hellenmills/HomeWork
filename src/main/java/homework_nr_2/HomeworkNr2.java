package homework_nr_2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HomeworkNr2 {

    public static void main(String[] args) {
        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        double Pi = 3.14159;

        System.out.println(CurrentWorldPopulation);
        System.out.println(CarsProducedThisYear);
        System.out.println( FirstLetterInAlphabet);
        System.out.println(JavaIsAmazing );
        System.out.println(Pi);

        double price = 123.4D;
        double tax = 20.4D;
        int quantity = 40;
        double sum = 0;


        System.out.println(price);
        System.out.println(tax);
        System.out.println(quantity);
        System.out.println(sum);

        double total = price + tax * quantity + sum;
        System.out.println(total );



    }
}