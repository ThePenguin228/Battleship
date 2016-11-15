/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.*;
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
    public static int PlayerMostRecentRowMove ;
    public static int PlayerMostRecentColMove ;
    Board board[][] = new Board[Board.NUM_ROWS][Board.NUM_COLUMNS];
    Board board2[][] = new Board[Board.NUM_ROWS][Board.NUM_COLUMNS];
    static boats ships[] = new boats[boats.PEICELEGNTH.length];
    static boats AIShips[] = new boats[boats.PEICELEGNTH.length];
    static int currentShipNum=0;
<<<<<<< Updated upstream
    static boolean shipset;
    static boolean shoot = false;
=======
    public static boolean shipset = true;
>>>>>>> Stashed changes
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
//                    if(shipset){
                        if(shipset && currentShipNum<boats.peiceLenth.length){
                            int ydelta = Board.ydelta;
                            int xdelta = Board.xdelta;

<<<<<<< Updated upstream
                            int zcol = 0;
                            int zcolLoc = xdelta;
=======
                    if(shipset){
                        int ydelta = Board.ydelta;
                        int xdelta = Board.xdelta;
>>>>>>> Stashed changes

                            int zrowLoc = ydelta;
                            for (int i=0;i<Board.NUM_COLUMNS;i++)
                            {
                                if (zcolLoc*i < e.getX()-Window.getX(0)-xdelta)
                                    zcol = i;
                            } 

                            for (int i=Board.NUM_ROWS-1;i>=0;i--)
                            {
<<<<<<< Updated upstream
                                if (board[i][zcol] == null)
                                {
                                    if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta))
                                    {   
                                        if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta)) 
                                        {
                                            ships[currentShipNum].setINFO(zcol,i);
                                            currentShipNum++;
                                            mostRecentRow = i;
                                            System.out.println("row set"+i);
                                            mostRecentCol = zcol;
                                            System.out.println("col set"+zcol);
                                            if(currentShipNum>=ships.length){
                                                shipset= false;
                                            }
                                            break;
                                        }
=======
                                if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta))
                                {   
                                    
                                    if (zrowLoc*i < e.getY()-Window.getY((Window.WINDOW_HEIGHT/2+(ydelta-10))-ydelta)) 
                                    {
                                    ships[currentShipNum].setINFO(zcol,i);
                                    currentShipNum++;
                                    mostRecentRow = i;
                                    System.out.println("row set"+i);
                                    mostRecentCol = zcol;
                                    System.out.println("col set"+zcol);
                                    shipset=true;
                                    if(currentShipNum>ships.length-1){
                                        shipset= false;
                                    }
                                        break;
>>>>>>> Stashed changes
                                    }
                                }
                            }
                        }
<<<<<<< Updated upstream
                        else 
                        {

                        }
//                    }
                    
                }
                if(!shipset){
                    int ydelta = Board.ydelta;
                    int xdelta = Board.xdelta;

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
                            if (zrowLoc*i < e.getY()-Window.getY(0)-ydelta)
                            {   
        //                        ships[currentShipNum]=new boats(zcol,i);
        //                        Board.board2[zcol][i]=Board.ShowCrouser;
                                shoot = true;
                                PlayerMostRecentRowMove=i;
                                PlayerMostRecentColMove=zcol;
                                break;
                            }
                        }
=======
                    }
                    else 
                    {
                      //check to see if hit or miss if hit call hitWich  
>>>>>>> Stashed changes
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
        if(shipset){
<<<<<<< Updated upstream
            if(currentShipNum<boats.peiceLenth.length){

                int ydelta = Board.ydelta;
                int xdelta = Board.xdelta;
=======
>>>>>>> Stashed changes

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
                            if(ships[currentShipNum]==null)
                                ships[currentShipNum]=new boats();
                            mostRecentRowMove=i;
                            mostRecentColMove=zcol;
                            break;
                        }
                    }
                }
            }
        }
        if(!shipset){
            int ydelta = Board.ydelta;
            int xdelta = Board.xdelta;

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
                    if (zrowLoc*i < e.getY()-Window.getY(0)-ydelta)
                    {   
//                      ships[currentShipNum]=new boats(zcol,i);
//                        Board.board2[zcol][i]=Board.ShowCrouser;
                        
                        PlayerMostRecentRowMove=i;
                        PlayerMostRecentColMove=zcol;
                        break;
                    }
                }
            }
        }
        //location marker code here
        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
//Keys that determine the direction of the ship.    
<<<<<<< Updated upstream
                if(shipset){
                    if (e.VK_RIGHT == e.getKeyCode()){
                            if(currentShipNum>-1&&currentShipNum<ships.length){
                                    if(Board.board2[ships[currentShipNum].getzCol() + boats.peiceLenth[currentShipNum]][ships[currentShipNum].getzRow() ]==0)
                                        ships[currentShipNum].setdir(1);
                            }
                    }
                    if (e.VK_LEFT == e.getKeyCode()){
                            if(currentShipNum>-1&&currentShipNum<ships.length){
                                    if(Board.board2[ships[currentShipNum].getzCol()][ships[currentShipNum].getzRow() ]==0)
                                        ships[currentShipNum].setdir(3);
                            }
                    }
                    if (e.VK_UP == e.getKeyCode()){
                            if(currentShipNum>-1&&currentShipNum<ships.length){
                                    if(Board.board2[ships[currentShipNum].getzCol()][ships[currentShipNum].getzRow() ]==0)
                                        ships[currentShipNum].setdir(4);
                            }
                    }
                    if (e.VK_DOWN == e.getKeyCode()){
                            if(currentShipNum>-1&&currentShipNum<ships.length){
                                    if(Board.board2[ships[currentShipNum].getzCol() ][ships[currentShipNum].getzRow()+ boats.peiceLenth[currentShipNum] ]==0)
                                        ships[currentShipNum].setdir(2);
                            }
                    }
                }
=======
            if(shipset){
                if (e.VK_RIGHT == e.getKeyCode()){
                    if(currentShipNum>-1&&currentShipNum<ships.length){
                            if(Board.board2[ships[currentShipNum].getzCol() + boats.PEICELEGNTH[currentShipNum]][ships[currentShipNum].getzRow() ]==0)
                                ships[currentShipNum].setdir(1);
                    }
                }
                if (e.VK_LEFT == e.getKeyCode()){
                    if(currentShipNum>-1&&currentShipNum<ships.length){
                            if(Board.board2[ships[currentShipNum].getzCol()][ships[currentShipNum].getzRow() ]==0)
                                ships[currentShipNum].setdir(3);
                    }
                }
                if (e.VK_UP == e.getKeyCode()){
                    if(currentShipNum>-1&&currentShipNum<ships.length){
                            if(Board.board2[ships[currentShipNum].getzCol()][ships[currentShipNum].getzRow() ]==0)
                                ships[currentShipNum].setdir(4);
                    }
                }
                if (e.VK_DOWN == e.getKeyCode()){
                    if(currentShipNum>-1&&currentShipNum<ships.length){
                            if(Board.board2[ships[currentShipNum].getzCol() ][ships[currentShipNum].getzRow()+ boats.PEICELEGNTH[currentShipNum] ]==0)
                                ships[currentShipNum].setdir(2);
                    }
                }
            }
>>>>>>> Stashed changes
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
        for(int i=0;i<ships.length;i++)
            ships[i]=new boats();
<<<<<<< Updated upstream
        shipset = false;
=======
        //    static boats AIShips[] = new boats[boats.peiceLenth.length];
        switch ((int) (Math.random() * 5)) {
            case 1:
                AIShips[0] = new boats(0,0,2);
                AIShips[1] = new boats(9,9,4);
                AIShips[2] = new boats(6,3,1);
                AIShips[3] = new boats(8,0,1);
                AIShips[4] = new boats(2,4,1);
                break;
            case 2:
                AIShips[0] = new boats(0,0,2);
                AIShips[1] = new boats(0,1,2);
                AIShips[2] = new boats(0,2,2);
                AIShips[3] = new boats(0,3,2);
                AIShips[4] = new boats(0,4,2);
                break;
            case 3:
                AIShips[0] = new boats(9,0,2);
                AIShips[1] = new boats(5,5,3);
                AIShips[2] = new boats(4,1,1);
                AIShips[3] = new boats(8,5,3);
                AIShips[4] = new boats(0,0,2);
                break;
            case 4:
                AIShips[0] = new boats(5,0,1);
                AIShips[1] = new boats(6,0,1);
                AIShips[2] = new boats(7,0,1);
                AIShips[3] = new boats(8,0,1);
                AIShips[4] = new boats(9,0,1);
                break;
            default:
                AIShips[0] = new boats(5,1,1);
                AIShips[1] = new boats(6,1,1);
                AIShips[2] = new boats(7,1,1);
                AIShips[3] = new boats(8,1,1);
                AIShips[4] = new boats(9,1,1);
                break;
        }
        
>>>>>>> Stashed changes
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
