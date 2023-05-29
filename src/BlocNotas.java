
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
public class BlocNotas {




    public static void main(String[] args) {
        Color amarillo;
        amarillo= new Color (237, 227, 177);

        ImageIcon copiarImg = new ImageIcon("assents/copiar.png");
        ImageIcon cortarImg = new ImageIcon("assents/cortar.png");
        ImageIcon pegarImg = new ImageIcon("assents/pegar.png");
        ImageIcon mayImg = new ImageIcon("assents/may.png");
        ImageIcon minImg = new ImageIcon("assents/min.png");
        ImageIcon masImg = new ImageIcon("assents/mas.png");
        ImageIcon menosImg = new ImageIcon("assents/menos.png");

        MenuBar menu;
        menu= new MenuBar();
        Menu archivo, ayuda, acerca;

        archivo=new Menu("Archivo");
        ayuda = new Menu("Ayuda");
        acerca=new Menu("Acerca");

        menu.add(archivo);
        menu.add(ayuda);
        menu.add(acerca);


        JPanel panel = new JPanel();
        JButton copiar = new JButton();
        JButton cortar = new JButton();
        JButton pegar = new JButton();
        JButton may = new JButton();
        JButton min = new JButton();
        JButton mas = new JButton();
        JButton menos = new JButton();
        JFrame ventana = new JFrame ("Bloc de notas");
        TextArea texto = new TextArea();
        texto.setBackground(amarillo);




        copiar.setIcon(copiarImg);
        cortar.setIcon(cortarImg);
        pegar.setIcon(pegarImg);
        may.setIcon(mayImg);
        min.setIcon(minImg);
        mas.setIcon(masImg);
        min.setIcon(minImg);
        menos.setIcon(menosImg);

        panel.add(copiar);
        panel.add(cortar);
        panel.add(pegar);
        panel.add(may);
        panel.add(min);
        panel.add(mas);
        panel.add(menos);
        ventana.setMenuBar(menu);
        ventana.add(panel, BorderLayout.NORTH);
        ventana.add(texto);
        ventana.setSize(550,550);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}