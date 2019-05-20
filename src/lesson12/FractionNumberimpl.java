package lesson12;

public class FractionNumberimpl implements FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumberimpl() {
    }

    public FractionNumberimpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }


    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return dividend / (double) divisor;
    }

    @Override
    public void printToConsole() {
        System.out.println(dividend + "/" + divisor);
    }
}
