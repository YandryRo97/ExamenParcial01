/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.FestivalMusical;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends JFrame{
    
    private JMenuBar menu;
    private JDesktopPane escritorio;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private Artista artista;
    private Asistente asistente;
    private FestivalMusical festival;
    private GestionDato gD;
    
    
    public VentanaPrincipal(String titulo, GestionDato gD) {
        this.setTitle(titulo);
        this.setSize(700, 600);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        iniciaComponente();
    }
    
    public void iniciaComponente(){
        
        this.menu = new JMenuBar();
        this.escritorio = new JDesktopPane();
        this.menuList = new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Crear"));
        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Artista"));
        this.menuItemList.add(new JMenuItem("Asistente"));
        this.menuItemList.add(new JMenuItem("Boleto"));
        this.menuItemList.add(new JMenuItem("Festival Musical"));
        this.menuItemList.add(new JMenuItem("Orden"));
        
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(menu);

        this.menu.add(this.menuList.get(0));
        
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(2));
        this.menuList.get(2).add(this.menuItemList.get(3));
        this.menuList.get(2).add(this.menuItemList.get(4));
        
       // this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        //this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
       // this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
       // this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));
       // this.menuItemList.get(4).addActionListener(new EventoVentanaPrincipal(this));
           
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public FestivalMusical getFestival() {
        return festival;
    }

    public void setFestival(FestivalMusical festival) {
        this.festival = festival;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    
}
    
