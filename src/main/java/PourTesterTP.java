import java.util.Arrays;
import java.util.Locale;

public class PourTesterTP {
    static boolean isPrefix(String str1,String str2){
        if(str1.length()>str2.length()){
            return str1.substring(0,str2.length()).equals(str2);
        }else{
            return str2.substring(0,str1.length()).equals(str1);
        }
    }
    public static boolean isAnagram(String str1,String str2) {
        String[] str1Format = (str1.replaceAll("[^A-Za-z]", "").toLowerCase(Locale.ROOT).split(""));
        String[] str2Format = (str2.replaceAll("[^A-Za-z]", "").toLowerCase(Locale.ROOT).split(""));

        Arrays.sort(str1Format);
        Arrays.sort(str2Format);

        if (str1.length() != str2.length()) {
            return false;
        }

        StringBuilder  arrStr1=new StringBuilder();
        for(String letter:str1Format){
            arrStr1.append(letter);
        }

        StringBuilder  arrStr2=new StringBuilder();
        for(String letter:str2Format){
            arrStr2.append(letter);
        }
        return (!arrStr1.toString().equals(arrStr2.toString()));
    }
    public static String reverseString(String str){
        String reversed="";
        for(String letter:str.split("")){
            reversed = letter+reversed;
        }
        return reversed;
    }

    public static boolean isPalindrom(String str) {
        String formattedStr=str.replaceAll("[^A-Za-z]","");
        String reversedStr=reverseString(formattedStr);
        return  formattedStr.equals(reversedStr);
    }

    public static int reverseInt(int number){
        String numberToStr=Integer.toString(number).replaceAll("[^0-9]","");//retirer le "-"

        String reversedStr="";
        for(String letter:numberToStr.split("")){
            reversedStr=letter+reversedStr;
        }

        int reversedToInt=(int) (Integer.parseInt(reversedStr)*Math.signum(number));
        return reversedToInt;
    }

    //    Mettre toutes les premieres lettre des mots en majuscule
    public static String capitalize(String str) {
        String capitalized=String.valueOf(str.charAt(0)).toUpperCase();
        String[] strToArr=str.split("");
        System.out.println(Arrays.toString(strToArr));
        for(int i=1;i<strToArr.length;i++){
            if(strToArr[i-1].equals(" ")){
                capitalized +=strToArr[i].toUpperCase();
            }else{
                capitalized +=strToArr[i];
            }
        }
        return capitalized;
    }

    //   Dans un tableau de charactère, mettre un caractère sur deux en majuscule
    static char[] alternate(char[] chars){
        char[] alternateChar=new char[chars.length];
        alternateChar[0]=chars[0];
        for (int i = 1; i < chars.length; i ++) {
            if(chars[i]%2==0){
                alternateChar[i]=String.valueOf(chars[i]).toUpperCase().charAt(0);
            }else{
                alternateChar[i]=chars[i];
            }
        }
        return alternateChar;
    }

    // Déplacement sur une grille
    static int[] direction(String[] directionStr){
        int[] result={0,0};
        for(int i=0;i<directionStr.length;i++){
            switch (directionStr[i]){
                case "haut":
                    result[1] +=1;
                    break;
                case "bas":
                    result[1] -=1;
                    break;
                case "gauche":
                    result[0] -=1;
                    break;
                case "droite":
                    result[0] +=1;
                    break;
            }
        }
        return result;
    }
}