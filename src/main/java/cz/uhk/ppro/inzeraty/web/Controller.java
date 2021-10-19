package cz.uhk.ppro.inzeraty.web;


import cz.uhk.ppro.inzeraty.model.Inzerat;
import cz.uhk.ppro.inzeraty.model.InzeratsModel;
import cz.uhk.ppro.inzeraty.model.Inzeraty;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;


import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@org.springframework.stereotype.Controller
public class Controller {


    private List<Inzerat> seznamInzer = new ArrayList<>();

    @GetMapping("/inzeraty")
    public void readSell(Model model, HttpServletResponse response) throws IOException {
        /*response.setContentType("txt/html");
        return "templateInzeraty";*/
        //response.getWriter().println("ok");
        int n =5;
        Inzerat inzerat1 = new Inzerat(1, "aa", "co", 1, "heslo");
        Inzerat inzerat2 = new Inzerat(1, "aa", "co",2 , "heslo");

        List<Inzerat> seznamBuy = new ArrayList<>();
        List<Inzerat> seznamSell = new ArrayList<>();
        int typ = inzerat1.getTyp();
        response.getWriter().println(typ);

        if(typ==1)
        {
            seznamBuy.add(inzerat1);
        }
        else if(typ==2){
            {
                seznamSell.add(inzerat2);
            }
        }

        response.getWriter().println("interaty pro nakup:");
        for (int i=0; i<seznamBuy.size()-1; i++) {

            response.getWriter().println("nazev: " + seznamBuy.get(0).getName() +"  popis: " + seznamBuy.get(0).getDescription() + "  id "  + seznamBuy.get(0).getId());
       }

        response.getWriter().println("inzeraty pro prodej:");
        for(int i=0; i<seznamSell.size()-1; i++) {

            response.getWriter().println("nazev: " + seznamBuy.get(i).getName() +"  popis: " + seznamBuy.get(i).getDescription() + "  id "  + seznamBuy.get(i).getId());
        }

        //seznamBuy.add(new Inzerat(1,"ssss","hh",1,"555"));
        /*for(int i=0; i<seznamBuy.size()-1; i++){
            response.getWriter().println("text");

        }*/



    }

    /*@PostMapping(path = "inzerat",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Inzerat> create(@RequestBody Inzerat newInzerat) {
        Inzerat inzerat = inzeratService.save(newInzerat);
        if ( inzerat == null) {
            throw new ServerException();
                    ;
        } else {
            return new ResponseEntity<>(inzerat, HttpStatus.CREATED);
        }
    }*/
    @PostMapping(path = "/inzeraty")
    public void addMember_V1(@RequestBody Inzerat inzerat,  HttpServletRequest request) {
        String name =  request.getParameter("name");
        String description = request.getParameter("description");
        String type = request.getParameter("typ");
        int typ = Integer.parseInt(type);
        int passwordInt = (int) Math.round(Math.random());
        String password = Integer.toString(passwordInt);
        int id = (int) Math.round(Math.random());
        Inzerat newInzerat = new Inzerat(id, name, description,typ,password);
        seznamInzer.add(newInzerat);
    }
}
