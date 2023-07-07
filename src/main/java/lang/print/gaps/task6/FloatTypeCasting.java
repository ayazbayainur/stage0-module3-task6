package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        System.out.println(Math.round(numberToBeRounded));
    }

    public static void main(String[] args){
        var classInstance  = new FloatTypeCasting();
        classInstance.roundNumber(12.5f);
    }
}
