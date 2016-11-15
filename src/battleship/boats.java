/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import battleship.BattleShip;
import static battleship.BattleShip.mostRecentColMove;
import static battleship.BattleShip.mostRecentRowMove;
import static battleship.Board.NUM_COLUMNS;
import java.awt.Color;

/**
 *
 * @author 147003615
 */
public class boats {
    public static final int PEICELEGNTH[]={2,3,4,4,5};
    static int peiceNum=0;
    static int AIPeiceNum=0;
    private int peicelenth;
    private int direction=1;
    private int zCol;
    private int zRow;
    private int numHits;
    boats(){
        
    }
    boats(int row, int col, int dir){
        zCol=col;
        zRow=row;
        direction=dir;
        peicelenth=PEICELEGNTH[AIPeiceNum];
        numHits=peicelenth;
        AIPeiceNum++;
        switch (direction) {
            case 1:
                for(int i =0; i<peicelenth;i++)
                    Board.board3[zCol+i][zRow]=Board.SHIP;
                break;
            case 2:
                for(int i =0; i<peicelenth;i++)
                    Board.board3[zCol][zRow+i]=Board.SHIP;
                break;
            case 3:
                for(int i =0; i<peicelenth;i++)
                    Board.board3[zCol-i][zRow]=Board.SHIP;
                break;
            case 4:
                for(int i =0; i<peicelenth;i++)
                    Board.board3[zCol][zRow-i]=Board.SHIP;
                break;
            default:
                break;
        }
    }
    public void setINFO(int _zCol,int _zRow){
        boolean validpeiceset=true;
        //////////////////////////////
        switch (direction) {
            case 1:
                for(int i =0; i<peicelenth;i++){
                    if(Board.board2[zCol+i][zRow]==Board.SHIP)
                        validpeiceset=false;
                }   break;
            case 2:
                for(int i =0; i<peicelenth;i++){
                    if(Board.board2[zCol][zRow+i]==Board.SHIP)
                        validpeiceset=false;
                }   break;
            case 3:
                for(int i =0; i<peicelenth;i++){
                    if(Board.board2[zCol-i][zRow]==Board.SHIP)
                        validpeiceset=false;
                }   break;
            case 4:
                for(int i =0; i<peicelenth;i++){
                    if(Board.board2[zCol+i][zRow]==Board.SHIP)
                        validpeiceset=false;
                }   break;
            default:
                break;
        }
        //////////////////////////////    
        if(validpeiceset){
            zCol=_zCol;
            zRow=_zRow;
//            System.out.println(peiceLenth[peiceNum]+""+peiceNum);
            peicelenth=PEICELEGNTH[peiceNum];
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
    public static void hitWich(int clickRow,int clickCol){
        for(int i = 0;i<PEICELEGNTH.length;i++){
            boats currentShip = BattleShip.AIShips[i];
            switch (currentShip.getDirection()) {
                 case 1:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }//Board.board2[zCol+i][zRow]=Board.SHIP;
                    break;
                case 2:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }///Board.board2[zCol][zRow+i]=Board.SHIP;
                    break;
                case 3:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    } //Board.board2[zCol-i][zRow]=Board.SHIP;
                    break;
                case 4:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }//Board.board2[zCol][zRow-i]=Board.SHIP;
                    break;
                default:
                    break;
            }
        }
    }
    public static void hitWichForAI(int clickRow,int clickCol){
        for(int i = 0;i<PEICELEGNTH.length;i++){
            boats currentShip = BattleShip.ships[i];
            switch (currentShip.getDirection()) {
                 case 1:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }//Board.board2[zCol+i][zRow]=Board.SHIP;
                    break;
                case 2:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }///Board.board2[zCol][zRow+i]=Board.SHIP;
                    break;
                case 3:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    } //Board.board2[zCol-i][zRow]=Board.SHIP;
                    break;
                case 4:
                    for(int i2 =0; i2<currentShip.getpeicelenth();i2++){
                        
                    }//Board.board2[zCol][zRow-i]=Board.SHIP;
                    break;
                default:
                    break;
            }
        }
    }
            
}
