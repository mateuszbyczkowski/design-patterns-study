package strategia.podatki;

class TaxDE implements Tax {
    public double count(double taxAmount) {
        return 0.30 * taxAmount;
    }
}
