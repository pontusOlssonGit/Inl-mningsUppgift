import java.util.ArrayList;


public class Ceasar {



    public static void main(String[] args) {

        Cipher c = new Cipher("TextToCipherOrDecipher", new ArrayList<>());
        c.setKey();
        System.out.println(c.getKey());
        System.out.println(c.getCipherTxt());



    }
}
