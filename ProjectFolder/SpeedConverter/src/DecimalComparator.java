public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2 ){

        int no = (int) (number1*1000);
        int no1 = (int) (number2*1000);

        if(no==no1){
            return true;
        }else{
            return false;
        }

    }

}