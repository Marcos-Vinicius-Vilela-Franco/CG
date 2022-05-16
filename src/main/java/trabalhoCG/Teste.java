/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoCG;
import javax.swing.*;

/**
 *
 * @author Marcos Vinicius
 */
public class Teste extends JFrame {
    public  Teste (){
        initial();
         this.setTitle("Algoritmo e Geração de Linhas - todos os algoritmos");
           this.setSize(500,500);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
    }
    public void initial(){
        JPanel JPanel = new javax.swing.JPanel();
        JButton jButton1 = new javax.swing.JButton();
        JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        JMenu jMenu1 = new javax.swing.JMenu();
        JMenu jMenu3 = new javax.swing.JMenu();
        JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        JMenu jMenu4 = new javax.swing.JMenu();
        JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem5 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        JMenu jMenu5 = new javax.swing.JMenu();
        JMenuItem jMenuItem7 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem8 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem9 = new javax.swing.JMenuItem();
        JMenu jMenu2 = new javax.swing.JMenu();
        JMenuItem jMenuItem10 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem11 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem12 = new javax.swing.JMenuItem();
        JMenuItem jMenuItem13 = new javax.swing.JMenuItem();
        
        
        jMenu1.setText("Primitivas");
        jMenu1.setMinimumSize(new java.awt.Dimension(75, 30));
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 39));

        jMenu3.setText("Linhaas");

        jMenuItem1.setText("Analítico");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("DDA");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Bresenham");
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenu4.setText("Poligonos");

        jMenuItem4.setText("Varredura");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("BoundarFill");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Análise Geométrica");
        jMenu4.add(jMenuItem6);

        jMenu1.add(jMenu4);

        jMenu5.setText("Circulos");

        jMenuItem7.setText("Paramétrica");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Incremental com Simetria");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Bresenham");
        jMenu5.add(jMenuItem9);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cores");

        jMenuItem10.setText("Azul");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Vermelho");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Azul");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Amarelo");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
    }
}
