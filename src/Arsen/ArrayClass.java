package Arsen;

import java.util.Random;

public class ArrayClass {
    public static void main(String[] args) {
        String[] names = {"Elena","Hamilton","Tohmas","Syuzi","Fil","Jems","Makron","Wiliams","J.Jon","Will"};
        int[] tames = {341,287,345,338,298,286,320,325,350,291};
        String win = "";
        int min =0;

        for (int i = 0; i < tames.length; i++) {
            min = tames[i];
            if (min  > tames[i])
            {
                min = tames[i];

            }

        }
        win +=min;
        win +="-";
        int indx = 0;
        for (int i = 0; i <names.length ; i++) {
            Random  rnd = new Random();
             indx = new Random().nextInt(names.length);

        }
        win  += names[indx];

        System.out.println(win);

        }

    }

