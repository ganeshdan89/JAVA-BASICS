/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class Ventana extends JFrame {

    public JPanel Panel;

    public Ventana() {
        JFrame Ventana = new JFrame();

        Ventana.setTitle("Usando JFrame");
        this.setSize(800, 800);
        //this.setLocation(330,100);
        //setBounds equivale a setSize y setLocation  
        //this.setBounds(330, 100, 800, 600);
        //setLocatinoRelativeTo permite a la ventana ajustarse por si sola a la resolución, debe tener un tamaño mediante el uso de setSize
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.red);
        IniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {
        Colocar_Paneles();
        Colocar_Etiquetas();
        Colocar_Botones();
        Colocar_Boton_Opcion();
        Colocar_TextBox();
        Colocar_TextArea();
        Colocar_ComboBox();

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

    private void Colocar_Etiquetas() {
        JLabel etiqueta = new JLabel("Conspirancy Cicle", SwingConstants.CENTER);//Crea la etiqueta y la ubica 
        etiqueta.setFont(new Font("chiller", Font.BOLD, 40));
        etiqueta.setBounds(50, 5, 400, 30);//Posiciona y da tamaño a la etiqueta 
        Panel.add(etiqueta).setForeground(Color.RED);
        etiqueta.setOpaque(true);
        //etiqueta.setBackground(Color.WHITE);//Cambia el color del fondo de la etiqueta
        Panel.add(etiqueta);

        //Etiqueta tipo Imagen
        JLabel etiqueta2 = new JLabel(new ImageIcon("C:\\Users\\Daniel\\Documents\\NetBeansProjects\\Manejo_de_JFrame\\triquetra300x288.PNG"));
        etiqueta2.setBounds(40, 50, 420, 300);
        Panel.add(etiqueta2);
        //Agragar Imagen con ImageIcon
        ImageIcon imagen = new ImageIcon("C:\\Users\\Daniel\\Pictures\\Wallpapers\\99791.JPG");

        //Dar valores para escalar la imagen
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(40, 40, 420, 300);
        etiqueta3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        Panel.add(etiqueta3);

    }

    private void Colocar_Botones() {
        //Boton normal con texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//Establece texto al botón
        boton1.setBounds(480, 60, 100, 40);
        boton1.setEnabled(true);//Habilita o deshabilita el botón
        boton1.setMnemonic('a');//Establece para el botón la interacción de la tecla alt+ a o la letra que se asigne
        boton1.setForeground(Color.blue);//Establece el color de la fuente
        boton1.setFont(new Font("times roman", Font.BOLD, 10));//Establece el diseño de la fuente
        Panel.add(boton1);

        //Boton 
        JButton boton2 = new JButton();
        boton2.setBounds(600, 60, 100, 40);
        //boton2.setBackground(Color.black);
        ImageIcon click = new ImageIcon("C:\\Users\\Daniel\\Pictures\\Bulb.png");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));

        Panel.add(boton2);

    }

    private void Colocar_Boton_Opcion() {
        //Creación de radio botones
        JRadioButton radiob1 = new JRadioButton("Opción 1", true);
        radiob1.setBounds(480, 100, 100, 40);
        Panel.add(radiob1);
        JRadioButton radiob2 = new JRadioButton("Opción 2", false);
        radiob2.setBounds(480, 140, 100, 40);
        Panel.add(radiob2);
        JRadioButton radiob3 = new JRadioButton("Opción 3", false);
        radiob3.setBounds(600, 100, 100, 40);
        Panel.add(radiob3);

        //Agrupación de radio botones
        ButtonGroup radio_grupo = new ButtonGroup();
        radio_grupo.add(radiob1);
        radio_grupo.add(radiob2);
        radio_grupo.add(radiob3);

    }

    private void Colocar_TextBox()//Una sola fila
    {
        //Caja de texto vacía
        JTextField texbox1 = new JTextField();
        texbox1.setBounds(480, 180, 300, 40);
        Panel.add(texbox1);
        //Caja de texto con texto
        JTextField texbox2 = new JTextField();
        texbox2.setBounds(480, 240, 300, 40);
        texbox2.setText("JTextField solo escribe una linea de texto");
        Panel.add(texbox2);

        //Caja de texto con texto obtenido de texbox2
        JTextField texbox3 = new JTextField();
        texbox3.setBounds(480, 300, 300, 40);
        texbox3.setText("Texto obtenido de " + texbox2.getText());
        Panel.add(texbox3);
    }

    private void Colocar_TextArea() {
        JTextArea text_area1 = new JTextArea("JTextArea1 : \nPermite escribir más de una línea de texto.");
        text_area1.setBounds(40, 360, 420, 40);
        //setEditable permite editar el texto contenido en el area de texto
        //text_area1.setEditable(true);
        Panel.add(text_area1);
        
        JTextArea text_area2 = new JTextArea("JTextArea2 : \nPermite escribir este texto junto con el que  agregue utilizando append.");
        text_area2.append("\nEscriba aquí su texto");//Agrega texto
        text_area2.setText(text_area2.getText()+"\nTexto obtenido de "+text_area1.getText());//Permite obtener texto 
        text_area2.setBounds(40, 420, 420, 80);
        Panel.add(text_area2);
    }
    
    
        private void Colocar_ComboBox()
        {        
        String[] paises = {"Canadá","Estados Unidos","Puerto Rico","Belice","México","Nicaragua","Costa Rica"};    
            
        JComboBox combo1 = new JComboBox(paises);
        combo1.setBounds(40, 520, 420, 30);
        combo1.addItem("Dinamarca");//Agrega nuevos objetos 
        combo1.setSelectedItem("Costa Rica");//Selecciona el primer objeto de la lista mostrado
        Panel.add(combo1);
        
        }
}
