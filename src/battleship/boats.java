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
    public static final int peiceLenth[]={2,3,3,4,5};
    static int peiceNum=0;
    private int peicelenth;
    private int direction;
    private int zCol;
    private int zRow;
    boats(int _zCol,int _zRow){
        if(Board.board2[_zCol][_zRow]==0){
            zCol=_zCol;
            zRow=_zRow;
            System.out.println(peiceLenth[peiceNum]+""+peiceNum);
            peicelenth=peiceLenth[peiceNum];
            peiceNum++;
        }
            
        
    }
    public void setdir(int dir ){
        direction= dir;
        System.out.println(peicelenth);
        if (dir == 1)
            for(int i =0; i<peicelenth;i++)
             Board.board2[zCol+i][zRow]=Board.SHIP;
        else if (dir == 2)
            for(int i =0; i<peicelenth;i++)
             Board.board2[zCol][zRow+i]=Board.SHIP;
        else if (dir == 3)
            for(int i =0; i<peicelenth;i++)
             Board.board2[zCol-i][zRow]=Board.SHIP;
        else if (dir == 4)
            for(int i =0; i<peicelenth;i++)
             Board.board2[zCol][zRow-i]=Board.SHIP;
        
           System.out.println("zcol="+zCol+"zrow"+zRow); 
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
}
