package ClassReplacement;

import java.util.Random;

public class VusalinSinifiApp {
    public static void main(String[] args) {
        String[] telebeler = { "Fexri", "Fexri A", "Fexri B","Fexri C","Fexri D","Fexri E","Fexri F","Fexri G","Fexri H","Fexri I","Fexri J","Fexri K","Fexri L","Fexri M","Fexri N","Fexri R"};
        int[] sira = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        Siralama(telebeler);

        for (int i = 0; i < sira.length; i++) {
            System.out.println(sira[i] + ". " + telebeler[i]);

        }
    }

    public static void Siralama(String[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i >0 ; i--) {
            int j = random.nextInt(i + 1);
            String temp =array[i];
            array[i]= array[j];
            array[j]=temp;
            
        }

    }
}
