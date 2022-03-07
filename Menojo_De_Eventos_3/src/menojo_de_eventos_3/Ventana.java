/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menojo_de_eventos_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class Ventana extends JFrame {

    private JPanel Panel;
    private JButton boton1;
    private JTextArea text_area1 = new JTextArea();
    private JTextField textbox1 = new JTextField();

    public Ventana() {
        JFrame Ventana = new JFrame();

        this.setTitle("Eventos en Java");
        //setBounds equivale a setSize y setLocation  
        this.setBounds(330, 100, 600, 400);
        this.getContentPane().setBackground(Color.black);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {
        Colocar_Paneles();
        Colocar_TextBox();
        Colocar_TextArea();
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

    private void Colocar_TextBox()//Una sola fila
    {
        //Caja de texto vacía       
        textbox1.setBounds(70, 40, 300, 40);
        Panel.add(textbox1);
        Evento_Teclado();

    }

    private void Colocar_TextArea()//Una sola fila
    {
        //Caja de texto vacía       
        text_area1.setBounds(70, 100, 300, 200);
        Panel.add(text_area1);
       

    }
    
     private void Colocar_Botones() {
        //Boton normal con texto
        boton1 = new JButton();
        boton1.setText("Limpiar");//Establece texto al botón
        boton1.setBounds(380, 100, 100, 40);
        boton1.setEnabled(true);//Habilita o deshabilita el botón
        boton1.setMnemonic('a');//Establece para el botón la interacción de la tecla alt+ a o la letra que se asigne
        boton1.setForeground(Color.blue);//Establece el color de la fuente
        boton1.setFont(new Font("times roman", Font.BOLD, 10));//Establece el diseño de la fuente
        Panel.add(boton1);
        boton1.addActionListener(AgregarTexto());
        
        
        

    }

    private void Evento_Teclado() {
        KeyListener evento = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //text_area1.append("\nkeyTyped");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //text_area1.append("\nkeyPressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                text_area1.append("\nkeyReleased");
            }
        };

        textbox1.addKeyListener(evento);

    }
    
     private ActionListener AgregarTexto() {

        //Agregando Evento de tipo ActionListener
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               text_area1.setText("");

            }

        };
        return accion;

    }
}
