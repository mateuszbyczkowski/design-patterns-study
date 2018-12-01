package strategia.podatki;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Context context = new Context();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kwotę do obliczenia");
        int num = scan.nextInt();

        Tax tax = new TaxPL();
        tax.count(num);
        System.out.println("Podatek Polski wyniósł");
        context.setTax(new TaxPL());
        System.out.println(context.performAction(num));

        System.out.println("Podatek Niemiecki wyniósł");
        context.setTax(new TaxDE());
        System.out.println(context.performAction(num));


        //alternatywna wersja - gorsza
        System.out.println("Podaj wersje podatku 1 dla PL, 2 dla DE");
        int taxToCount = scan.nextInt();
        System.out.println("Podaj kwotę do obliczenia");
        int numb = scan.nextInt();

        switch (numb) {
            case 1: {
                System.out.println("Podatek Polski wyniósł");
                System.out.println(taxToCount * 0.23);
            }
            case 2: {
                System.out.println(taxToCount * 0.23);
                System.out.println("Podatek Niemiecki wyniósł");
            }
            case 3: {
                System.out.println(taxToCount * 0.53);
                System.out.println("Podatek Norwegia wyniósł");
            }
        }
    }
}
