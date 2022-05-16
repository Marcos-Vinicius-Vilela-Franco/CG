package trabalhoCG;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.PopupMenu;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TodasLinhas extends JFrame{
    protected int x1, y1,  x2, y2;
       public TodasLinhas(int x1, int y1,int x2,int y2){
           
          
          this.x1=x1;
           this.x2=x2;
           this.y1=y1;
           this.y2=y2;
           
      }
       
      
  

        
        public void paint( Graphics g,int x1, int y1,int x2,int y2) {
           
        //, int x1, int y1,int x2,int y2
//        g.setColor(Color.blue);
//        algAnalitic(g,10,40,60,90);
//        algAnalitic(g,10,40,50,100);
//        algAnalitic(g,10,40,80,40);
//        algAnalitic(g,10,40,10,90);
//         g.setColor(Color.red);
//        algDDA(g,10,40,60,90);
//        algDDA(g,10,40,50,100);
//        algDDA(g,10,40,80,40);
          //  g.setColor(Color.red);
      // algDDA(g,10,40,10,90);
           g.setColor(Color.red);
          // algBres(g,10,40,60,90);
          //algBres(g,10,40,50,100);
            algBres(g,x1, y1, x2, y2);
            System.out.print("ta aqui");
           algBres(g,10,40,10,90);
            //algBres(g,x1,y1,x2,y2);
        }

        public void algAnalitic(Graphics g, int x1, int y1,int x2,int y2) {
            float m, b, dy, dx;
            dy = y2 - y1;
            dx = x2 - x1;

            m = (float) dy / dx;
            //System.out.println(m);

            b = (float) (y1 - m * x1);
           // System.out.println(b);

            for (int x = x1; x<=x2; x++) {
                int y = (int) (m * x + b);
               // System.out.println(y);
                putPixel(g,x,y);
            }
        }
        private void algDDA(Graphics g, int xi, int yi, int xf, int yf) {

            int steps;
            float x=xi, y=yi, incX, incY;

            int dx = xf - xi;
            int dy = yf - yi;

            if(Math.abs(dx)>Math.abs(dy)) {
                steps = Math.abs(dx); incX = 1; incY= (float) dy /dx; }
            else {
                steps = Math.abs(dy); incY = 1; incX= (float) dx /dy; }

            //System.out.println(steps + "-" + dx + "-" + dy+ "-" + incX + "-" + incY );

            for(int i=0; i<steps; i++) {
                x = x + incX;
                y = y + incY;
                putPixel(g,Math.round(x),Math.round(y)); }


        }

        private void algBres(Graphics g, int xi, int yi, int xf, int yf) {

            int x = xi, y = yi, d=0, dx = xf-xi, dy = yf-yi, c, m, incX=1, incY=1;

            if(dx < 0) {incX = -1; dx = -dx;}
            if(dy < 0) {incY = -1; dy = -dy;}
            //System.out.println(dx+"-"+dy+"-"+incX+"-"+incY);

            if(dy <= dx) {
                c = 2 * dx; m = 2 * dy;
               // System.out.println(c+"-"+m);
                if(incX < 0) dx++;
                for(;;) {
                    putPixel(g,x,y);
                    if (x == xf) break;
                    x += incX;
                    d += m;
                    if(d >= dx) {y += incY; d -= c;}
                    //System.out.println(x+"-"+y);
                }
            } else {
                c = 2 * dy; m = 2 * dx;
               // System.out.println(c+"-"+m);
                if(incY < 0) dy++;
                for(;;) {
                    putPixel(g,x,y);
                    if (y == yf) break;
                    y += incY;
                    d += m;
                    if(d >= dy) {x += incX; d -= c;}
                   // System.out.println(x+"-"+y);
                }

            }
        }

        public void putPixel(Graphics g, int x, int y) {
            g.drawLine(x, y, x, y);

        }


    }

