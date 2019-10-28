import java.util.ArrayList;

public class Cipher {

    private String txt;
    private ArrayList<Integer> key;

    public Cipher(String txt, ArrayList<Integer> key){
        this.txt=txt;
        this.key=key;
    }
    public void setKey(){
        this.key.add(9);
        this.key.add(5);
        this.key.add(3);
        this.key.add(2);
        this.key.add(1);
        this.key.add(4);


    }
    public ArrayList getKey(){
        return this.key;
    }
    public String getCipherTxt(){
        String cipher = "";
        this.txt = txt.toUpperCase();
        for(int i=0; i < txt.length(); i++){
            if (i == key.size())
                setKey();
            char c = txt.charAt(i);
            c += key.get(i);
            if((int)c>90) {
                c = (char) ((int)c - 90);
                c += 64;
            }
            cipher+= c;

        }
        return cipher;
    }
    public String getDecipherTxt(){
        String deCipher = "";
        this.txt = txt.toUpperCase();
        for(int i=0; i < txt.length(); i++){
            if (i == key.size())
                setKey();
            char c = txt.charAt(i);
            c -= key.get(i);
            if((int)c<65) {
                c = (char) (64-(int)c);
                c = (char) (90 - c);
            }
            deCipher+= c;

        }
        return deCipher;
    }


}
