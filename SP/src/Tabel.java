/**
 * Created by secul on 03-Nov-17.
 */
public class Tabel extends AbstractElement {
    private String text;

    public Tabel(String Filename){
        this.text = Filename;
    }

    public void Print(){
        System.out.println("File"+text);
    }
}
