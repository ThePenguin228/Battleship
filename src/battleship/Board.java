/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.*;

public class Board {
    static boolean SecretPathActive = false;
    Window window;
    final static int NUM_ROWS = 20;
    final static int NUM_COLUMNS = 20;
    
    final static int PATH = 0;
    final static int WALL = 1;
    final static int SECR = 2;
    
    static int board[][] = new int [NUM_ROWS][NUM_COLUMNS];
//    static int boardOrig[][] = {{WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL},  //1
//                                {WALL,WALL,WALL,WALL,WALL,WALL,PATH,PATH,PATH,PATH,PATH,PATH,PATH,WALL,WALL,PATH,PATH,PATH,PATH,WALL},  //2
//                                {WALL,PATH,PATH,PATH,WALL,WALL,PATH,WALL,PATH,WALL,WALL,WALL,PATH,WALL,WALL,PATH,WALL,WALL,PATH,WALL},  //3
//                                {WALL,PATH,WALL,PATH,PATH,PATH,PATH,WALL,PATH,WALL,WALL,WALL,PATH,WALL,WALL,PATH,WALL,WALL,PATH,WALL},  //4
//                                {WALL,PATH,WALL,WALL,WALL,PATH,WALL,PATH,PATH,WALL,PATH,PATH,PATH,WALL,WALL,PATH,WALL,PATH,PATH,WALL},  //5
//                                {WALL,PATH,WALL,WALL,WALL,PATH,WALL,PATH,WALL,WALL,PATH,WALL,WALL,WALL,WALL,PATH,WALL,PATH,WALL,WALL},  //6
//                                {WALL,PATH,PATH,WALL,PATH,PATH,WALL,PATH,PATH,PATH,PATH,PATH,PATH,PATH,PATH,PATH,WALL,PATH,WALL,WALL},  //7
//                                {WALL,WALL,PATH,PATH,PATH,WALL,PATH,PATH,WALL,WALL,WALL,PATH,WALL,WALL,WALL,WALL,WALL,PATH,WALL,WALL},  //8
//                                {WALL,WALL,PATH,WALL,WALL,WALL,PATH,WALL,WALL,WALL,WALL,PATH,WALL,WALL,WALL,WALL,WALL,PATH,WALL,WALL},  //9
//                                {WALL,PATH,PATH,WALL,PATH,PATH,PATH,WALL,WALL,PATH,PATH,PATH,WALL,WALL,WALL,PATH,PATH,PATH,WALL,WALL},  //10
//                                {WALL,PATH,WALL,WALL,PATH,WALL,WALL,WALL,WALL,PATH,WALL,WALL,WALL,WALL,WALL,PATH,WALL,PATH,WALL,WALL},  //11
//                                {WALL,PATH,PATH,PATH,PATH,WALL,WALL,WALL,PATH,PATH,WALL,WALL,PATH,PATH,PATH,PATH,WALL,PATH,PATH,WALL},  //12
//                                {WALL,PATH,WALL,WALL,SECR,SECR,SECR,PATH,PATH,WALL,WALL,WALL,PATH,WALL,SECR,WALL,WALL,WALL,PATH,WALL},  //13
//                                {WALL,PATH,PATH,WALL,WALL,WALL,WALL,PATH,WALL,WALL,WALL,PATH,PATH,WALL,SECR,WALL,WALL,PATH,PATH,WALL},  //14
//                                {WALL,WALL,PATH,PATH,WALL,WALL,WALL,PATH,PATH,WALL,WALL,PATH,WALL,WALL,SECR,WALL,WALL,PATH,WALL,WALL},  //15
//                                {WALL,WALL,WALL,PATH,PATH,PATH,WALL,WALL,PATH,WALL,WALL,PATH,WALL,WALL,SECR,WALL,WALL,PATH,PATH,WALL},  //16
//                                {WALL,PATH,PATH,PATH,WALL,PATH,WALL,WALL,PATH,WALL,WALL,PATH,WALL,WALL,SECR,WALL,WALL,WALL,PATH,WALL},  //17
//                                {WALL,PATH,WALL,WALL,WALL,PATH,WALL,WALL,PATH,WALL,PATH,PATH,PATH,PATH,PATH,PATH,WALL,WALL,PATH,WALL},  //18
//                                {WALL,PATH,PATH,PATH,PATH,PATH,PATH,PATH,PATH,PATH,PATH,WALL,WALL,WALL,WALL,PATH,PATH,PATH,PATH,WALL},  //19
//                                {WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL}};
    
    public static void Draw(Graphics2D g)
    {
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        

 //draw grid
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zx = 1;zx<NUM_COLUMNS;zx++)
        {
           for (int zy = 1;zy<NUM_ROWS;zy++)
           {
                if(board[zx][zy]==1){
                    g.setColor(Color.gray);
                    g.fillRect(Window.getX(zx*xdelta), Window.getY(zy*ydelta), xdelta, ydelta);
//                      System.out.println("zy = " + zy + "zx = " + zx);
                }
           }   
        }
    }
}
