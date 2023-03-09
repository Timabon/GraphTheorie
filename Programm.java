package org.example;

import java.util.Arrays;

public class Programm {

    public static boolean[][] werte = {
            {false, false, false, true, true, true, false, false, true, true, false, false},
            {false, true, true, true, false, true, true, true, true, false, false, false},
            {true, false, true, true, false, false, true, true, false, false, true, true},
            {true, false, false, false, true, true, true, false, false, true, true, true},
            {true, true, true, false, false, false, false, true, true, true, false, false},
            {true, true, false, true, true, false, false, true, false, false, true, true},
            {false, false, false, true, false, false, true, false, true, true, true, false},
            {false, false, false, false, false, true, true, true, true, false, false, false}
    };

    private static String[][] result = new String[werte.length][werte[1].length];

    public static void main(String[] args) {
        writeX(werte);
    }
    public static void writeX(boolean[][] werte) {
        Boolean dot = false;
        Boolean x = true;
        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte[1].length; j++) {
                if (dot.equals(werte[i][j])) {
                    result[i][j] = ".";
                } else {
                    result[i][j] = "X";
                }
            }
        }

        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte[1].length; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }

    public static void findTheAmount() {
        int a = 0;

        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte[1].length; j++) {
                    if(result[i][j] != "X"){

                    }else if(result[i+1][j] == "."){
                            for(int k = j; k < werte.length;){
                              int minus = k;
                              int plus = k;
                              if(result[i][plus + 1] == "X"){
                                  a++;
                                  plus++;
                              }
                              if(result[i][minus-1] == "X"){
                                  a++;
                                  minus--;
                              }
                              else{
                                  i--;
                              }
                            }
                        }
                    else{break;}
                    }
                }

        System.out.println(a);
        }
    }



