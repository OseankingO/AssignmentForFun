package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            res.append(" ");
        }
        return res.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < string.length(); i ++) {
            if(Character.isUpperCase(string.charAt(i))) {
                res.append(Character.toLowerCase(string.charAt(i)));
            } else if(Character.isLowerCase(string.charAt(i))) {
                res.append(Character.toUpperCase(string.charAt(i)));
            } else {
                res.append(string.charAt(i));
            }
        }
        return res.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder res = new StringBuilder();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        char[] max;
        char[] min;
        boolean string1Max = true;
        if(array1.length >= array2.length) {
            max = array1;
            min = array2;
        } else {
            max = array2;
            min = array1;
            string1Max = false;
        }
        for(int i = 0; i < min.length; i ++) {
            if(string1Max) {
                res.append(max[i]);
                res.append(min[i]);
            } else {
                res.append(min[i]);
                res.append(max[i]);
            }
        }
        for(int i = min.length; i < max.length; i ++) {
            res.append(max[i]);
        }
        return res.toString();
    }
}
