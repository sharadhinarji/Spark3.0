public class TryWithMultipleException {
    public static void main(String[] args) {
        try {
            m1();
        }

        catch (ArrayIndexOutOfBoundsException a){//---child exception so should before parent exception
            a.printStackTrace();

        }
        catch (ArithmeticException ar){ //---child exception so should before parent exception
            ar.printStackTrace();
        }
        catch (Exception e){  //parent exception should retrun after child
            e.printStackTrace();
        }

    }

    public static int m1() {//here there is two child exception so it is multiple exception
        int[] arr = new int[5];
        if (arr.length > 3) {
            return arr[6];//ArrayIndexOutOfBoundsException

        }
        else
            return arr[0]/arr[1];//Arthematic Exception

        }
    }

