package cz.uhk.ppro.inzeraty.model;

import java.util.List;

public interface Inzeraty {


    List<Inzerat> getInzerat();



    void add(Inzerat inzerat);

    void remove(int id);

    Inzerat getById(int id);

}
