/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import battleship.BattleShip;

/**
 *
 * @author 147003615
 */
public class boats {
    public static final int peiceLenth[]={2,3,4,4,5};
    static int peiceNum=0;
    private int peicelenth;
    private int direction=1;
    private int zCol;
    private int zRow;
    boats(){
        
    }
    public void setINFO(int _zCol,int _zRow){
        boolean validpeiceset=true;
        //////////////////////////////
        System.out.println(peicelenth);
        if (direction == 1)
            for(int i =0; i<peicelenth;i++){
                if(Board.board2[zCol+i][zRow]==Board.SHIP)
                    validpeiceset=false;
            }
        else if (direction == 2)
            for(int i =0; i<peicelenth;i++){
                if(Board.board2[zCol][zRow+i]==Board.SHIP)
                    validpeiceset=false;
            }
        else if (direction == 3)
            for(int i =0; i<peicelenth;i++){
                if(Board.board2[zCol-i][zRow]==Board.SHIP)
                    validpeiceset=false;
            }
        else if (direction == 4)
            for(int i =0; i<peicelenth;i++){
                if(Board.board2[zCol+i][zRow]==Board.SHIP)
                    validpeiceset=false;
            }
        //////////////////////////////    
        if(validpeiceset){
            zCol=_zCol;
            zRow=_zRow;
//            System.out.println(peiceLenth[peiceNum]+""+peiceNum);
            peicelenth=peiceLenth[peiceNum];
            peiceNum++;
            if (direction == 1)
                for(int i =0; i<peicelenth;i++)
                 Board.board2[zCol+i][zRow]=Board.SHIP;
            else if (direction == 2)
                for(int i =0; i<peicelenth;i++)
                 Board.board2[zCol][zRow+i]=Board.SHIP;
            else if (direction == 3)
                for(int i =0; i<peicelenth;i++)
                 Board.board2[zCol-i][zRow]=Board.SHIP;
            else if (direction == 4)
                for(int i =0; i<peicelenth;i++)
                 Board.board2[zCol][zRow-i]=Board.SHIP;
        
        }
            
        
    }
    public void setdir(int dir ){
        direction= dir;
    }
    public int getpeicelenth(){
        return (peicelenth);
    }
    public int getdirection(){
        return (direction);
    }
    public int getzCol(){
        return (zCol);
    }
    public int getzRow(){
        return (zRow);
    }
    public int getDirection(){
        return(direction);
    }
}
