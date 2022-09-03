package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int integer = (int) numberToBeRounded;
        int number = (numberToBeRounded - integer) >= 0.5 ? integer + 1 : integer;
        System.out.println(number);
    }
}
