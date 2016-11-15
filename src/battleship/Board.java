/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import static battleship.BattleShip.*;
import java.awt.*;

public class Board {
    final static int NUM_ROWS = 10;
    final static int NUM_COLUMNS = 10;
<<<<<<< Updated upstream
    
    public final static int EMPTY = 0;
    public final static int SHIP = 1;
    public final static int HIT = 2;
    public final static int MISS = 3;
    public final static int ShowCrouser = 5;
=======
    final static int NUM_AI_BOARDS=2;
            
    final static int WATR = 0;
    final static int SHIP = 1;
    final static int ShowCrouser = 2;
>>>>>>> Stashed changes
//Calculate the width and height of each board square.
    final static int ydelta = 30; // rows
    final static int xdelta = 30; // columns
    
//    static int board[][] = new int [NUM_ROWS][NUM_COLUMNS];
    static int board1[][] = new int [NUM_ROWS][NUM_COLUMNS];
    
    static int board2[][] = new int [NUM_ROWS][NUM_COLUMNS];
    
    static int board3[][] = new int [NUM_ROWS][NUM_COLUMNS];
    
    public static void Draw(Graphics2D g)
    {
        

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
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
           for (int zx = 0;zx<NUM_COLUMNS;zx++)
           {
               {
                   switch (board1[zi][zx]) {
                   //0
                       case EMPTY:
                           g.setColor(Color.WHITE);
                           break;
                   //2
                       case HIT:
                           g.setColor(Color.RED);
                           break;
                   //3
                       case MISS:
                           g.setColor(Color.BLUE);
                           break;
                       default:
                           break;
                   }
                    g.fillOval(Window.getX(31)+zx*Window.getWidth2()/(xdelta-18),
                    Window.getY(31)+zi*Window.getHeight2()/(ydelta-6),
                    xdelta-1,
                    ydelta-1);
               }
               {
                   switch (board2[zi][zx]) {
                   //0
                       case EMPTY:
                           g.setColor(Color.WHITE);
                           break;
                   //1
                       case SHIP:
                           g.setColor(Color.DARK_GRAY);
                           break;
                   //2
                       case HIT:
                           g.setColor(Color.RED);
                           break;
                   //3
                       case MISS:
                           g.setColor(Color.BLUE);
                           break;
                       default:
                           break;
                   }
                    g.fillOval(Window.getX(31)+zi*Window.getWidth2()/(xdelta-18),
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
        if(BattleShip.shipset){
            g.setColor(Color.LIGHT_GRAY);
<<<<<<< Updated upstream
            if(BattleShip.shipset){
                if(BattleShip.currentShipNum<boats.peiceLenth.length){
                    switch (BattleShip.ships[BattleShip.currentShipNum].getDirection()) {
                         case 1:
                            if(mostRecentColMove+boats.peiceLenth[BattleShip.currentShipNum]>NUM_COLUMNS)
                                g.setColor(Color.red);
                            break;
                        case 2:
                            if(mostRecentRowMove+boats.peiceLenth[BattleShip.currentShipNum]>NUM_ROWS)
                                g.setColor(Color.red);
                            break;
                        case 3:
                            if(mostRecentColMove-boats.peiceLenth[BattleShip.currentShipNum]<0)
                                g.setColor(Color.red);
                            break;
                        case 4:
                            if(mostRecentRowMove-boats.peiceLenth[BattleShip.currentShipNum]<0)
                                g.setColor(Color.red);
                            break;
                        default:
                            break;
                    }
                }
            }
            if(BattleShip.shipset){
                if(BattleShip.currentShipNum<boats.peiceLenth.length){
                    switch (BattleShip.ships[BattleShip.currentShipNum].getDirection()) {
                        case 1:
                            for(int i=0;i<boats.peiceLenth[BattleShip.currentShipNum];i++)
                                g.fillOval(Window.getX(31)+(mostRecentColMove+i)*Window.getWidth2()/(xdelta-18),
                                        Window.getY(391)+(mostRecentRowMove)*Window.getHeight2()/(ydelta-6),
                                        xdelta-1,
                                        ydelta-1);
                            break;
                        case 2:
                            for(int i=0;i<boats.peiceLenth[BattleShip.currentShipNum];i++)
                                g.fillOval(Window.getX(31)+(mostRecentColMove)*Window.getWidth2()/(xdelta-18),
                                        Window.getY(391)+(mostRecentRowMove+i)*Window.getHeight2()/(ydelta-6),
                                        xdelta-1,
                                        ydelta-1);
                            break;
                        case 3:
                            for(int i=0;i<boats.peiceLenth[BattleShip.currentShipNum];i++)
                                g.fillOval(Window.getX(31)+(mostRecentColMove-i)*Window.getWidth2()/(xdelta-18),
                                        Window.getY(391)+(mostRecentRowMove)*Window.getHeight2()/(ydelta-6),
                                        xdelta-1,
                                        ydelta-1);
                            break;
                        case 4:
                            for(int i=0;i<boats.peiceLenth[BattleShip.currentShipNum];i++)
                                g.fillOval(Window.getX(31)+(mostRecentColMove)*Window.getWidth2()/(xdelta-18),
                                        Window.getY(391)+(mostRecentRowMove-i)*Window.getHeight2()/(ydelta-6),
                                        xdelta-1,
                                        ydelta-1);
                            break;
                        default:
                            break;
                    }
                }
            }
            if(!shipset && shoot)
                g.fillOval(Window.getX(31)+(PlayerMostRecentColMove)*Window.getWidth2()/(xdelta-18),
                    Window.getY(31)+(PlayerMostRecentRowMove)*Window.getHeight2()/(ydelta-6),
                    xdelta-1,
                    ydelta-1);
                
=======
            switch (BattleShip.ships[BattleShip.currentShipNum].getDirection()) {
                 case 1:
                    if(mostRecentColMove+boats.PEICELEGNTH[BattleShip.currentShipNum]>NUM_COLUMNS)
                        g.setColor(Color.red);
                    break;
                case 2:
                    if(mostRecentRowMove+boats.PEICELEGNTH[BattleShip.currentShipNum]>NUM_ROWS)
                        g.setColor(Color.red);
                    break;
                case 3:
                    if(mostRecentColMove-boats.PEICELEGNTH[BattleShip.currentShipNum]<0)
                        g.setColor(Color.red);
                    break;
                case 4:
                    if(mostRecentRowMove-boats.PEICELEGNTH[BattleShip.currentShipNum]<0)
                        g.setColor(Color.red);
                    break;
                default:
                    break;
            }

            switch (BattleShip.ships[BattleShip.currentShipNum].getDirection()) {
                case 1:
                    for(int i=0;i<boats.PEICELEGNTH[BattleShip.currentShipNum];i++)
                        g.fillOval(Window.getX(31)+(mostRecentColMove+i)*Window.getWidth2()/(xdelta-18),
                                Window.getY(391)+(mostRecentRowMove)*Window.getHeight2()/(ydelta-6),
                                xdelta-1,
                                ydelta-1);
                    break;
                case 2:
                    for(int i=0;i<boats.PEICELEGNTH[BattleShip.currentShipNum];i++)
                        g.fillOval(Window.getX(31)+(mostRecentColMove)*Window.getWidth2()/(xdelta-18),
                                Window.getY(391)+(mostRecentRowMove+i)*Window.getHeight2()/(ydelta-6),
                                xdelta-1,
                                ydelta-1);
                    break;
                case 3:
                    for(int i=0;i<boats.PEICELEGNTH[BattleShip.currentShipNum];i++)
                        g.fillOval(Window.getX(31)+(mostRecentColMove-i)*Window.getWidth2()/(xdelta-18),
                                Window.getY(391)+(mostRecentRowMove)*Window.getHeight2()/(ydelta-6),
                                xdelta-1,
                                ydelta-1);
                    break;
                case 4:
                    for(int i=0;i<boats.PEICELEGNTH[BattleShip.currentShipNum];i++)
                        g.fillOval(Window.getX(31)+(mostRecentColMove)*Window.getWidth2()/(xdelta-18),
                                Window.getY(391)+(mostRecentRowMove-i)*Window.getHeight2()/(ydelta-6),
                                xdelta-1,
                                ydelta-1);
                    break;
                default:
                    break;
            }
        }   
>>>>>>> Stashed changes
            
        
    }
}
