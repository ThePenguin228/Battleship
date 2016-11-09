/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;


public class BattleShip extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;
    int mostRecentRow;
    int mostRecentCol;
    public static int mostRecentRowMove ;
    public static int mostRecentColMove ;
    Board board[][] = new Board[Board.NUM_ROWS][Board.NUM_COLUMNS];
    Board board2[][] = new Board[Board.NUM_ROWS][Board.NUM_COLUMNS];
    static boats ships[] = new boats[boats.peiceLenth.length];
    int currentShipNum=0;
    boolean shipset = false;
    public static void main(String[] args) {
        BattleShip frame = new BattleShip();
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public BattleShip() {

       addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.BUTTON1 == e.getButton() ) {
//                    if(currentShipNum<boats.peiceLenth.length){
//                        int ydelta = Window.getHeight2()/Board.NUM_ROWS;
//                        int xdelta = Window.getWidth2()/Board.NUM_COLUMNS;
////                        Window.getX(31)+zy*Window.getWidth2()/(xdelta-18),
////                    Window.getY(31)+zx*Window.getHeight2()/(ydelta-6),
//                        int zcol = 0;
//                        int zcolLoc = xdelta;
//
//                        int zrowLoc = ydelta;
//                        for (int i=0;i<Board.NUM_COLUMNS;i++)
//                        {
//                            if (zcolLoc*i < e.getX()-Window.getX(0)-xdelta)
//                                zcol = i;
//                        } 
//
//                        for (int i=Board.NUM_ROWS-1;i>=0;i--)
//                        {
//                            if (board[i][zcol] == null)
//                            {
//                                if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta)) 
//                                {
//    //                            if (player1Turn)
//    //                                board[i][zcol] = new Piece(Color.red);            
//    //                            else
//    //                                board[i][zcol] = new Piece(Color.black);
//    //                            player1Turn = !player1Turn;
//                                ships[currentShipNum]=new boats(zcol,i);
//                                currentShipNum++;
//                                mostRecentRow = i+5;
//                                System.out.println("row set"+i);
//                                mostRecentCol = zcol;
//                                System.out.println("col set"+zcol);
//                                shipset=true;
//                                if(currentShipNum==ships.length){
//                                    shipset= false;
//                                }
//                                break;
//                                }
//                            }
//                        }
                        
//                    }
                    if(currentShipNum<boats.peiceLenth.length){
                //<<<<<<< Updated upstream
                //            int ydelta = (Window.getHeight2()/2)/Board.NUM_ROWS;
                //            int xdelta = Window.getWidth2()/Board.NUM_COLUMNS;
                            int ydelta = Board.ydelta;
                            int xdelta = Board.xdelta;

                //=======

                //            int ydelta = Window.getHeight2()/Board.NUM_ROWS;
                //            int xdelta = Window.getWidth2()/Board.NUM_COLUMNS;


                //>>>>>>> Stashed changes
                            int zcol = 0;
                            int zcolLoc = xdelta;

                            int zrowLoc = ydelta;
                            for (int i=0;i<Board.NUM_COLUMNS;i++)
                            {
                                if (zcolLoc*i < e.getX()-Window.getX(0)-xdelta)
                                    zcol = i;
                            } 

                            for (int i=Board.NUM_ROWS-1;i>=0;i--)
                            {
                                if (board[i][zcol] == null)
                                {
                                    if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta))
                                    {   
                //                      ships[currentShipNum]=new boats(zcol,i);
                //                        Board.board2[zcol][i]=Board.ShowCrouser;

                                    if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta)) 
                                    {
        //                            if (player1Turn)
        //                                board[i][zcol] = new Piece(Color.red);            
        //                            else
        //                                board[i][zcol] = new Piece(Color.black);
        //                            player1Turn = !player1Turn;
                                    ships[currentShipNum]=new boats(zcol,i);
                                    currentShipNum++;
                                    mostRecentRow = i+5;
                                    System.out.println("row set"+i);
                                    mostRecentCol = zcol;
                                    System.out.println("col set"+zcol);
                                    shipset=true;
                                    if(currentShipNum==ships.length){
                                        shipset= false;
                                    }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else 
                    {
                        
                    }
                    
                }

                if (e.BUTTON3 == e.getButton()) {

                }
                repaint();
            }
        });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        if(currentShipNum<boats.peiceLenth.length){
//<<<<<<< Updated upstream
//            int ydelta = (Window.getHeight2()/2)/Board.NUM_ROWS;
//            int xdelta = Window.getWidth2()/Board.NUM_COLUMNS;
            int ydelta = Board.ydelta;
            int xdelta = Board.xdelta;
            
//=======

//            int ydelta = Window.getHeight2()/Board.NUM_ROWS;
//            int xdelta = Window.getWidth2()/Board.NUM_COLUMNS;


//>>>>>>> Stashed changes
            int zcol = 0;
            int zcolLoc = xdelta;

            int zrowLoc = ydelta;
            for (int i=0;i<Board.NUM_COLUMNS;i++)
            {
                if (zcolLoc*i < e.getX()-Window.getX(0)-xdelta)
                    zcol = i;
            } 

            for (int i=Board.NUM_ROWS-1;i>=0;i--)
            {
                if (board[i][zcol] == null)
                {
                    if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta))
                    {   
//                      ships[currentShipNum]=new boats(zcol,i);
//                        Board.board2[zcol][i]=Board.ShowCrouser;
                        
                        mostRecentRowMove=i;
                        mostRecentColMove=zcol;
                        break;
                    }
                }
            }
        }
        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
//Keys that determine the direction of the ship.    
            
                if (e.VK_RIGHT == e.getKeyCode()){
                    if(shipset){
//                        if ((ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])>-1
//                            &&(ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])<Board.NUM_COLUMNS
//                            && (ships[currentShipNum-1].getzRow())>0&&(ships[currentShipNum-1].getzRow())>Board.NUM_ROWS)
                                if(Board.board2[ships[currentShipNum-1].getzCol() + boats.peiceLenth[currentShipNum]][ships[currentShipNum-1].getzRow() ]==0)
                                    ships[currentShipNum-1].setdir(1);
                    
                    }
                }
                if (e.VK_LEFT == e.getKeyCode()){
                    if(shipset){
//                        if ((ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])>-1
//                            &&(ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])<Board.NUM_COLUMNS
//                            && (ships[currentShipNum-1].getzRow())>0&&(ships[currentShipNum-1].getzRow())>Board.NUM_ROWS)
                                if(Board.board2[ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum]][ships[currentShipNum-1].getzRow() ]==0)
                                    ships[currentShipNum-1].setdir(3);
                    
                    }
                }
                if (e.VK_UP == e.getKeyCode()){
                    if(shipset){
//                        if ((ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])>-1
//                            &&(ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])<Board.NUM_COLUMNS
//                            && (ships[currentShipNum-1].getzRow())>0&&(ships[currentShipNum-1].getzRow())>Board.NUM_ROWS)
                                if(Board.board2[ships[currentShipNum-1].getzCol()][ships[currentShipNum-1].getzRow() - boats.peiceLenth[currentShipNum] ]==0)
                                    ships[currentShipNum-1].setdir(4);
                    
                    }
                }
                if (e.VK_DOWN == e.getKeyCode()){
                    if(shipset){
                        if ((ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])>-1
                            &&(ships[currentShipNum-1].getzCol() - boats.peiceLenth[currentShipNum])<Board.NUM_COLUMNS
                            && (ships[currentShipNum-1].getzRow())>0&&(ships[currentShipNum-1].getzRow())>Board.NUM_ROWS)
                                if(Board.board2[ships[currentShipNum-1].getzCol() ][ships[currentShipNum-1].getzRow() + boats.peiceLenth[currentShipNum]]==0)
                                    ships[currentShipNum-1].setdir(2);
                    
                    }
                }

                repaint();
            }
        });
        init();
        start();
    }




    Thread relaxer;
////////////////////////////////////////////////////////////////////////////
    public void init() {
        requestFocus();
    }
////////////////////////////////////////////////////////////////////////////
    public void destroy() {
    }
////////////////////////////////////////////////////////////////////////////
    public void paint(Graphics gOld) {
        if (image == null || Window.xsize != getSize().width || Window.ysize != getSize().height) {
            Window.xsize = getSize().width;
            Window.ysize = getSize().height;
            image = createImage(Window.xsize, Window.ysize);
            g = (Graphics2D) image.getGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }
//fill background
//        g.setColor(Color.LIGHT_GRAY);
        g.setColor(Color.blue);
        g.fillRect(0, 0, Window.xsize, Window.ysize);

        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
//fill border
        g.setColor(Color.white);
        g.fillPolygon(x, y, 4);
// draw border
        g.setColor(Color.black);
        g.drawPolyline(x, y, 5);

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }

        Board.Draw(g);
        
        gOld.drawImage(image, 0, 0, null);
    }
////////////////////////////////////////////////////////////////////////////
// needed for     implement runnable
    public void run() {
        while (true) {
            animate();
            repaint();
            double seconds = 0.1;    //time that 1 frame takes.
            int miliseconds = (int) (1000.0 * seconds);
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
            }
        }
    }
/////////////////////////////////////////////////////////////////////////
    public void reset() {
    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {
        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }

            reset();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void start() {
        if (relaxer == null) {
            relaxer = new Thread(this);
            relaxer.start();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void stop() {
        if (relaxer.isAlive()) {
            relaxer.stop();
        }
        relaxer = null;
    }
}
