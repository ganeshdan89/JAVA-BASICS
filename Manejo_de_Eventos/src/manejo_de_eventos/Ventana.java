/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_eventos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class Ventana extends JFrame {

    JPanel Panel;
    JTextField texbox1 = new JTextField();

    public Ventana() {
        JFrame Ventana = new JFrame();

        this.setTitle("Eventos en Java");
        //setBounds equivale a setSize y setLocation  
        this.setBounds(330, 100, 600, 300);
        this.getContentPane().setBackground(Color.black);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {
        Colocar_Paneles();
        Colocar_Etiquetas();
        Colocar_TextBox();
        Colocar_Botones();

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

    private JLabel Colocar_Etiquetas() {
        JLabel etiqueta = new JLabel("Escriba su nombre", SwingConstants.CENTER);//Crea la etiqueta y la ubica 
        etiqueta.setFont(new Font("arial", Font.BOLD, 30));
        etiqueta.setBounds(5, 5, 400, 30);//Posiciona y da tamaño a la etiqueta 
        Panel.add(etiqueta).setForeground(Color.DARK_GRAY);
        etiqueta.setOpaque(true);
        //etiqueta.setBackground(Color.WHITE);//Cambia el color del fondo de la etiqueta
        Panel.add(etiqueta);

        JLabel etiqueta2 = new JLabel("", SwingConstants.CENTER);//Crea la etiqueta y la ubica 
        etiqueta2.setFont(new Font("arial", Font.BOLD, 15));
        etiqueta2.setBounds(70, 90, 410, 20);//Posiciona y da tamaño a la etiqueta 
        etiqueta2.setBackground(Color.yellow);
        
        Panel.add(etiqueta2).setForeground(Color.blue);
        etiqueta2.setOpaque(true);
        //etiqueta.setBackground(Color.WHITE);//Cambia el color del fondo de la etiqueta
        Panel.add(etiqueta2);

        return etiqueta2;

    }

    private void Colocar_TextBox()//Una sola fila
    {
        //Caja de texto vacía       
        texbox1.setBounds(70, 40, 300, 40);
        Panel.add(texbox1);     
    
    }

    private JButton Colocar_Botones() {
        //Boton normal con texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establece texto al botón
        boton1.setBounds(380, 40, 100, 40);
        boton1.setEnabled(true);//Habilita o deshabilita el botón
        boton1.setMnemonic('a');//Establece para el botón la interacción de la tecla alt+ a o la letra que se asigne
        boton1.setForeground(Color.blue);//Establece el color de la fuente
        boton1.setFont(new Font("times roman", Font.BOLD, 10));//Establece el diseño de la fuente
        Panel.add(boton1);
        boton1.addActionListener(AgregarTexto());
        return boton1;

    }

    private ActionListener AgregarTexto() {

        //Agregando Evento de tipo ActionListener
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colocar_Etiquetas().setText("Hola " + texbox1.getText()+" esto es un evento del tipo ActionListener ");

            }

        };
        return accion;

    }

}
