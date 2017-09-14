/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor_ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Soria Láscares Joshua
 * @version 1.0
 */
public class ventana extends JFrame implements ActionListener{
    
    
    private JTextField cantidad;
    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, numP;
    private JButton  converitr, limpiar;
    private JPanel todito;
    private JLabel titulo;
    private Font fuente;
    
    /**
     * Inicializa la ventana con sus caracteristicas y componentes
     * 
     */
    
   
    public ventana(){
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(450, 450);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("convertidor de pesos a dolares");
        
        
        //todito = new JPanel();
        //todito.setBounds(0, 0, 200, 200);
        
        fuente= new Font("arial", NORMAL, 15);
        
        titulo = new JLabel("Convertidor");
        titulo.setFont(fuente);
        titulo.setBounds(20, 20, 160, 50);
        titulo.setVisible(true);
        
        add(titulo);
        
        cantidad = new JTextField(10);
        cantidad.setFont(fuente);
        cantidad.setBounds(20, 60, 300, 50);
        cantidad.setEditable(false);
        cantidad.setVisible(true);
        add(cantidad);
        
        num1 = new JButton("1");
        num1.setFont(fuente);
        num1.setBounds(30, 120, 50, 50);
        num1.addActionListener(this);
        num1.setVisible(true);
        add(num1);

        num2 = new JButton("2");
        num2.setFont(fuente);
        num2.setBounds(85, 120, 50, 50);
        num2.addActionListener(this);
        num2.setVisible(true);
        add(num2);

        num3 = new JButton("3");
        num3.setFont(fuente);
        num3.setBounds(140, 120, 50, 50);
        num3.addActionListener(this);
        num3.setVisible(true);
        add(num3);

        num4 = new JButton("4");
        num4.setFont(fuente);
        num4.setBounds(30, 175, 50, 50);
        num4.addActionListener(this);
        num4.setVisible(true);
        add(num4);

        num5 = new JButton("5");
        num5.setFont(fuente);
        num5.setBounds(85, 175, 50, 50);
        num5.addActionListener(this);
        num5.setVisible(true);
        add(num5);

        num6 = new JButton("6");
        num6.setFont(fuente);
        num6.setBounds(140, 175, 50, 50);
        num6.addActionListener(this);
        num6.setVisible(true);
        add(num6);

        num7 = new JButton("7");
        num7.setFont(fuente);
        num7.setBounds(30, 230, 50, 50);
        num7.addActionListener(this);
        num7.setVisible(true);
        add(num7);

        num8 = new JButton("8");
        num8.setFont(fuente);
        num8.setBounds(85, 230, 50, 50);
        num8.addActionListener(this);
        num8.setVisible(true);
        add(num8);

        num9 = new JButton("9");
        num9.setFont(fuente);
        num9.setBounds(140, 230, 50, 50);
        num9.addActionListener(this);
        num9.setVisible(true);
        add(num9);

        num0 = new JButton("0");
        num0.setFont(fuente);
        num0.setBounds(30, 285, 50, 50);
        num0.addActionListener(this);
        num0.setVisible(true);
        add(num0);

        numP = new JButton(".");
        numP.setFont(fuente);
        numP.setBounds(85, 285, 50, 50);
        numP.addActionListener(this);
        numP.setVisible(true);
        add(numP);

        converitr = new JButton("converitir");
        converitr.setFont(fuente);
        converitr.setBounds(220, 150, 160, 50);
        converitr.addActionListener(this);
        converitr.setVisible(true);
        add(converitr);
        
        limpiar = new JButton("limpiar");
        limpiar.setFont(fuente);
        limpiar.setBounds(220, 210, 160, 50);
        limpiar.addActionListener(this);
        limpiar.setVisible(true);
        add(limpiar);
                
        //this.add(todito);
        
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String canti;
        canti=cantidad.getText();
        
        
        
        if(e.getActionCommand().equals(converitr.getText())){
            convertidor con = new convertidor();
            cantidad.setText(con.convertir(canti));
               
           }else{
                if(e.getActionCommand().equals(limpiar.getText())){
                    cantidad.setText("");

           }else{
                if(e.getActionCommand().equals(".")){
                    
                    if(!canti.contains(".")){
                        cantidad.setText(canti+".");
                    }
                    }else{
                    cantidad.setText(canti+e.getActionCommand());
                } 
            }

        }
    }
    
    
    
}
