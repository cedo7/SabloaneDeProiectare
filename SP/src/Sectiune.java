import java.util.ArrayList;

/**
 * Created by secul on 18-Oct-17.
 */
public class Sectiune implements Element {

    private String titlu;
    private ArrayList<Element> continutSectiune = new ArrayList<Element>();

    public void Add(Element e) {
        continutSectiune.add(e);
    }
    public void Remove(Element x){
        continutSectiune.remove(x);
    }

    public Element getElement(int index){
        return continutSectiune.get(index);
    }

    public void Print(){
        for(Element e : continutSectiune){
            e.Print();
        }
    }

}
