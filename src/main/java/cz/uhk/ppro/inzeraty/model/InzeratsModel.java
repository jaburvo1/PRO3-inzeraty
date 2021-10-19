package cz.uhk.ppro.inzeraty.model;

import java.util.ArrayList;
import java.util.List;

public class InzeratsModel implements Inzeraty {

    private List<Inzerat> buyInzerat = new ArrayList<>();
    private List<Inzerat> sellInzrtaty= new ArrayList<>();
    //private List<Item> polozky = new ArrayList<>();
    private Inzerat inzerat;
    /*Override
    public List<Item> getItem() {
        return null;
    }*/


    public void add() {

    }

    @Override
    public List<Inzerat> getInzerat() {
        return null;
    }

    @Override
    public void add(Inzerat inzerat) {
       Inzerat inzerat1 = new Inzerat(1,"jmno","popis",1,"heslo");
       if(inzerat1.getTyp()==1){
           buyInzerat.add(inzerat1);
       }
       else{
           sellInzrtaty.add(inzerat1);
       }


    }


    @Override
    public void remove(int id) {

    }

    @Override
    public Inzerat getById(int id) {
        return null;
    }


    public List<Inzerat> getBuyInzeraty() {
        return buyInzerat;
    }

    public List<Inzerat> getSellInzrtaty() {
        return sellInzrtaty;
    }
}
