/*
 *  CodeSignal/arcade/intro/addBorder.java
 *
 * Given a rectangular matrix of characters, add a border of asterisks(*) to it. *  
 * Example
 *
 * For picture = ["abc","ded"] the output should be  addBorder(picture) = ["*****", "*abc*","*ded*", "*****"]
 *
 *
 *  @author Mohammad AlMahamed 
 *
 */
 
 String[] addBorder(String[] picture) {

String[] arr = new String[picture.length + 2];
        String star = stars(picture[0].length() + 2);
        arr[0] = star;
        arr[arr.length - 1] = star;
        for (int i = 1; i < picture.length + 1; i++) {
            arr[i] = "*" + picture[i - 1] + "*";
        }
        return arr;
    }

    private static String stars(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append("*");
        }
        return s.toString();
    }
