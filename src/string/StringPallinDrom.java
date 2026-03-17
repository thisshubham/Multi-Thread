package string;

public class StringPallinDrom {
    public static void main(String[] args) {
        String str = "MAMS";
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversedString = String.valueOf(stringBuilder.reverse());
        if(reversedString.equalsIgnoreCase(str)){
            System.out.println("String is PAllINDROM");
        }else {
            System.out.println("String is not a PAllINDROM");

        }
    }
}
