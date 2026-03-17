package string;

public class ReverseString {
    public static void main(String[] args) {
        String string = "fburfbef";
        reversStringWithLoop(string);
        reversStringWithBuilder(string);


    }

    public static void reversStringWithLoop(String string){
        char[] charArray = string.toCharArray();
        for(int i=string.length()-1; i>0;i--){
            System.out.print(charArray[i]);
        }
        System.out.println();

    }
    public static void reversStringWithBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        System.out.println( "revers with StringBuilder : "+stringBuilder);
    }

    }
