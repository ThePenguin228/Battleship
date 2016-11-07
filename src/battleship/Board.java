/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import static battleship.BattleShip.mostRecentColMove;
import static battleship.BattleShip.mostRecentRowMove;
import java.awt.*;

public class Board {
    final static int NUM_ROWS = 10;
    final static int NUM_COLUMNS = 10;
    
    final static int WATR = 0;
    final static int SHIP = 1;
    final static int ShowCrouser=2;
    
//    static int board[][] = new int [NUM_ROWS][NUM_COLUMNS];
    static int board1[][] = {{SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP},  
                             {SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,WATR,WATR,WATR,WATR,SHIP},  
                             {SHIP,WATR,WATR,WATR,SHIP,SHIP,WATR,SHIP,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,WATR,WATR,WATR,WATR,SHIP,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,WATR,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,WATR,SHIP,SHIP,SHIP},  
                             {SHIP,WATR,WATR,SHIP,WATR,WATR,SHIP,WATR,WATR,SHIP,WATR},  
                             {SHIP,SHIP,WATR,WATR,WATR,SHIP,WATR,WATR,SHIP,SHIP,SHIP},  
                             {SHIP,SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,SHIP,SHIP,SHIP},
                             {SHIP,SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,SHIP,SHIP,SHIP}}; 
    
    static int board2[][] = {{SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,SHIP},  
                             {SHIP,SHIP,SHIP,SHIP,SHIP,SHIP,WATR,WATR,WATR,WATR,SHIP},  
                             {SHIP,WATR,WATR,WATR,SHIP,SHIP,WATR,SHIP,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,WATR,WATR,WATR,WATR,SHIP,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,WATR,WATR,SHIP,SHIP},  
                             {SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,WATR,SHIP,SHIP,SHIP},  
                             {SHIP,WATR,WATR,SHIP,WATR,WATR,SHIP,WATR,WATR,SHIP,WATR},  
                             {SHIP,SHIP,WATR,WATR,WATR,SHIP,WATR,WATR,SHIP,SHIP,SHIP},  
                             {SHIP,SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,SHIP,SHIP,SHIP},
                             {SHIP,SHIP,WATR,SHIP,SHIP,SHIP,WATR,SHIP,SHIP,SHIP,SHIP}}; 
    
    public static void Draw(Graphics2D g)
    {
//Calculate the width and height of each board square.
        int ydelta = 30; // rows
        int xdelta = 30; // columns
        

 //draw grid
        g.setColor(Color.black);
        for (int zi = 0;zi<=NUM_ROWS+1;zi++)
        {
            //for board1
            g.drawLine(Window.getX(30),Window.getY(zi*ydelta),
                    Window.getX((NUM_ROWS+1)*ydelta),Window.getY(zi*ydelta));
            //for board2
            g.drawLine(Window.getX(30),Window.getYNormal(zi*ydelta),
                    Window.getX((NUM_ROWS+1)*ydelta),Window.getYNormal(zi*ydelta));
        }
        for (int zx = 0;zx<=NUM_COLUMNS+1;zx++)
        {
            //for board1
            g.drawLine(Window.getX(zx*xdelta),Window.getY(30),
                    Window.getX(zx*xdelta),Window.getY((NUM_COLUMNS+1)*xdelta));
            //for board2
            g.drawLine(Window.getX(zx*xdelta),Window.getYNormal(30),
                    Window.getX(zx*xdelta),Window.getYNormal((NUM_COLUMNS+1)*xdelta));
        }
        for (int zx = 1;zx<NUM_COLUMNS;zx++)
        {
           for (int zy = 1;zy<NUM_ROWS;zy++)
           {
                if (board1[zx][zy] == WATR )
                {
                    g.setColor(Color.blue);
                    g.fillOval(Window.getX(31)+zy*Window.getWidth2()/(xdelta-18),
                    Window.getY(31)+zx*Window.getHeight2()/(ydelta-6),
                    xdelta-1,
                    ydelta-1);
                }
                if (board2[zx][zy] == SHIP )
                {
                    g.setColor(Color.DARK_GRAY);
                    g.fillOval(Window.getX(31)+zy*Window.getWidth2()/(xdelta-18),
                    Window.getY(391)+zx*Window.getHeight2()/(ydelta-6),
                    xdelta-1,
                    ydelta-1);
                }
//                if (board2[zx][zy] == ShowCrouser )
//                {
//                    g.setColor(Color.LIGHT_GRAY);
//                    g.fillOval(Window.getX(31)+zy*Window.getWidth2()/(xdelta-18),
//                    Window.getY(391)+zx*Window.getHeight2()/(ydelta-6),
//                    xdelta-1,
//                    ydelta-1);
//                }
           }   
        }

            g.setColor(Color.LIGHT_GRAY);
            g.fillOval(Window.getX(31)+mostRecentColMove*Window.getWidth2()/(xdelta-18),
            Window.getY(391)+mostRecentRowMove*Window.getHeight2()/(ydelta-6),
            xdelta-1,
            ydelta-1);
        
    }
}
