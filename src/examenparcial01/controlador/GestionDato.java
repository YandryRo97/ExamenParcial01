/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.FestivalMusical;
import examenparcial01.modelo.Orden;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionDato 
{
    private List<FestivalMusical> festivalMusicalList;
    private List<Boleto> boletoList;
    private List<Artista> artistaList;
    private List<Asistente> asistenteList;
    private List<Orden> ordenList;

    public GestionDato(List<FestivalMusical> festivalMusicalList, List<Boleto> boletoList, List<Artista> artistaList, List<Asistente> asistenteList, List<Orden> ordenList) {
        this.festivalMusicalList = festivalMusicalList;
        this.boletoList = boletoList;
        this.artistaList = artistaList;
        this.asistenteList = asistenteList;
        this.ordenList = ordenList;
    }

    public List<FestivalMusical> getFestivalMusicalList() {
        return festivalMusicalList;
    }

    public void setFestivalMusicalList(List<FestivalMusical> festivalMusicalList) {
        this.festivalMusicalList = festivalMusicalList;
    }

    public List<Boleto> getBoletoList() {
        return boletoList;
    }

    public void setBoletoList(List<Boleto> boletoList) {
        this.boletoList = boletoList;
    }

    public List<Artista> getArtistaList() {
        return artistaList;
    }

    public void setArtistaList(List<Artista> artistaList) {
        this.artistaList = artistaList;
    }

    public List<Asistente> getAsistenteList() {
        return asistenteList;
    }

    public void setAsistenteList(List<Asistente> asistenteList) {
        this.asistenteList = asistenteList;
    }

    public List<Orden> getOrdenList() {
        return ordenList;
    }

    public void setOrdenList(List<Orden> ordenList) {
        this.ordenList = ordenList;
    }
    public boolean addFestivalMusical(FestivalMusical fM)
    {
      return this.festivalMusicalList.add(fM);
    }
    public boolean addBoleto(Boleto b)
    {
      return this.boletoList.add(b);
    }
     public boolean addOrden(Orden o)
    {
      return this.ordenList.add(o);
    }
     public boolean addArtista(Artista a)
    {
      return this.artistaList.add(a);
    }
      public boolean addAsistente(Asistente aS)
    {
      return this.asistenteList.add(aS);
    }
    public Asistente bucarAsistente (String x){
        Asistente retorno=null;
        for(Asistente aS:this.asistenteList){
            if(aS.getNombre()==x){
                retorno=aS;
            }
        }
        return retorno;
    }

    
}
