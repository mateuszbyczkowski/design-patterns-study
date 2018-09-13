package strategia;

import java.util.Scanner;

interface Tax {
    double count(double amount);
}

class TaxPL implements Tax {
    public double count(double taxAmount) {
        return 0.23 * taxAmount;
}
}

class TaxEN implements Tax {
    public double count(double taxAmount) {
        return 0.15 * taxAmount;
    }
}

class Context {
    private Tax tax;

    public Context(Tax tax) {
        this.tax = tax;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}

class Main {
    public static void main(String[] args) {
        Context context = new Context(new TaxPL());

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kwotę do obliczenia");
        int num = scan.nextInt();
        Tax tax = new TaxPL();
        tax.count(num);
        System.out.println("Podatek Polski wyniósł");
        context.setTax(new TaxPL());
        System.out.println(context.getTax().count(num));

        System.out.println("Podatek Angielski wyniósł");
        context.setTax(new TaxEN());
        System.out.println(context.getTax().count(num));

    }
}
