package java11.example;

class DivisionResult {

    /*商*/
    int quotient;
    /*余り*/
    int remainder;
    /*商（小数）*/
    double quotientDecimal;

    public int getQuotient() {
        return quotient;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public double getQuotientDecimal() {
        return quotientDecimal;
    }

    public void setQuotientDecimal(double quotientDecimal) {
        this.quotientDecimal = quotientDecimal;
    }
}
