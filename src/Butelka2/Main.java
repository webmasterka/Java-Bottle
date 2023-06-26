package Butelka2;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        try {

            if (a == 10)
                throw new NaszWyjatek("a równe 10, grzeszysz :) ");
        }
        catch (NaszWyjatek ex) {
            System.out.println(ex.getMessage());
        }
    }


}

class NaszWyjatek extends Exception {
    public NaszWyjatek(String string) {
        super(string);
    }

}