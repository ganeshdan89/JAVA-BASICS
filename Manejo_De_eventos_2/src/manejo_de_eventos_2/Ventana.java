/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_eventos_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class Ventana extends JFrame {

    JPanel Panel;
    private JButton boton1;
    private JTextArea text_area1;

    public Ventana() {
        JFrame Ventana = new JFrame();
        this.setTitle("Eventos en Java");
        this.getContentPane().setBackground(Color.black);
        //setBounds equivale a setSize y setLocation  
        this.setBounds(330, 100, 600, 600);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void Colocar_Paneles() {
        Panel = new JPanel(); //Crea el Panel
        Panel.setLayout(null);//Desactiva el formato preestablecido
        //Panel.setBackground(Color.black); //Establece el color del Panel
        this.getContentPane().add(Panel);//Agrega el Panel a la ventana      
        //Etiqueta de tipo texto
        //JLabel etiqueta = new JLabel("Mi Primer Etiqueta",SwingConstants.RIGHT);//Crea la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); ubica la etiqueta        

    }

    private void IniciarComponentes() {
        Colocar_Paneles();
        Colocar_TextArea();
        Colocar_Botones();

    }

    private void Colocar_Botones() {
        //Boton normal con texto
        boton1 = new JButton();
        boton1.setText("Click");//Establece texto al botón
        boton1.setBounds(350, 60, 100, 40);
        boton1.setEnabled(true);//Habilita o deshabilita el botón
        boton1.setMnemonic('a');//Establece para el botón la interacción de la tecla alt+ a o la letra que se asigne
        boton1.setForeground(Color.blue);//Establece el color de la fuente
        boton1.setFont(new Font("times roman", Font.BOLD, 10));//Establece el diseño de la fuente
        Panel.add(boton1);
        Evento_Raton();

    }

    private void Colocar_TextArea() {
        text_area1 = new JTextArea();
        text_area1.setBounds(30, 30, 300, 300);
        //setEditable permite editar el texto contenido en el area de texto
        //text_area1.setEditable(true);
        Panel.add(text_area1);

    }

    private void Evento_Raton() {
        //Agrega evento de ratón = MouseListener
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text_area1.append("\nmouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                text_area1.append("\nmousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                text_area1.append("\nmouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                text_area1.append("\nmouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                text_area1.append("\nmouseExited");
            }
        };
        boton1.addMouseListener(evento);

    }

}
