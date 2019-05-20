package lesson12;

public class FractionNumberOperationImpl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor=a.getDivisor()*b.getDivisor();
        int resultChisl = (a.getDividend()*b.getDivisor())+(a.getDivisor()*b.getDividend());

        FractionNumberimpl result = new FractionNumberimpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor=a.getDivisor()*b.getDivisor();
        int resultChisl = (a.getDividend()*b.getDivisor())-(a.getDivisor()*b.getDividend());

        FractionNumberimpl result = new FractionNumberimpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor=a.getDivisor()*b.getDivisor();
        int resultChisl = a.getDividend()*b.getDividend();

        FractionNumberimpl result = new FractionNumberimpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int commonDivisor=a.getDivisor()*b.getDividend();
        int resultChisl = a.getDividend()*b.getDivisor();

        FractionNumberimpl result = new FractionNumberimpl();
        result.setDividend(resultChisl);
        result.setDivisor(commonDivisor);
        return result;
    }
}
