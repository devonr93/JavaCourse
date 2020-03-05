public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(!barking){
            System.out.println("false");
            return false;
        } else if(barking && hourOfDay < 8 && hourOfDay > -1 || hourOfDay == 23){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}