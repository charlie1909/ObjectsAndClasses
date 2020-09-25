public class ObjectsAndClasses {

    //question 1-2
    public boolean isMultiple(long n, long m){
        int i=0;
        for(i=1; i<20; i++){
            if((n == m * i)){
                return true;
            }
        } return false;
    }

    public boolean isOdd(int i){
        boolean isOdd=false;
        for(int x = 1; x <= i ; x++){
            isOdd = !isOdd;
        }
        return isOdd;
    }

}
