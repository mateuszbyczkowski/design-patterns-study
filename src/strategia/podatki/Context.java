package strategia.podatki;

class Context {
    private Tax tax;

    double performAction(double amount) {
        return this.tax.count(amount);
    }

    Tax getTax() {
        return tax;
    }

    void setTax(Tax tax) {
        this.tax = tax;
    }
}
