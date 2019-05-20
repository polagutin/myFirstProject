package lesson12;

public class Main {
    public static void main(String[] args) {
        FractionNumberimpl number1 = new FractionNumberimpl(1,4);

        FractionNumberimpl number2 = new FractionNumberimpl();
        number2.setDividend(3);
        number2.setDivisor(5);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();

        FractionNumber resultAdd = operation.add(number1,number2);
        resultAdd.printToConsole();

        FractionNumber resultSub = operation.sub(number1,number2);
        resultSub.printToConsole();

        FractionNumber resultMul = operation.mul(number1,number2);
        resultMul.printToConsole();

        FractionNumber resultDiv = operation.div(number1,number2);
        resultDiv.printToConsole();

    }
}
