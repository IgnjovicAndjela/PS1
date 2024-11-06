/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Agent;

/**
 *
 * @author Strahinja
 */
public class Controller {
    
    private List<Agent> listaAgenata = new ArrayList<>();

    public List<Agent> getListaAgenata() {
        return listaAgenata;
    }

    public void setListaAgenata(List<Agent> listaAgenata) {
        this.listaAgenata = listaAgenata;
    }
    
    private static Controller instance;
    public static Controller getInstance() {
        if(instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Controller() {
        
        Agent a1 = new Agent(1, "andjela", "andjela1", "andjela", "ignjovic");
        Agent a2 = new Agent(2, "milica", "milica1", "milica", "vukovljak");
        Agent a3 = new Agent(3, "sara", "sara1", "sara", "debeljevic");
        
        listaAgenata.add(a1);
        listaAgenata.add(a2);
        listaAgenata.add(a3);

    }

    public boolean login(String korisnickoIme, String sifra) {
        for(Agent a : listaAgenata) {
            if(a.getKorisnickoIme().equals(korisnickoIme) && a.getSifra().equals(sifra)) {
                return true;
        }
        }
        return false;

    }
    
    
    
    
}


