
package battleship;
import battleship.Window;
import java.awt.*;

public class Menu {
    private static boolean menu;
    
    Menu(){
        menu = true;
    }
    public static boolean getMenuState(){
        return menu;
    }
    public static void Draw(Graphics2D g){
        int playButtonWidth = 130;
        int playButtonHeight = 23;
        
        g.setColor(Color.blue);
        g.fillRect(Window.getX(0)+Window.getWidth2()/2-playButtonWidth/2, 
                    Window.getY(0)+Window.getHeight2()/2-playButtonHeight/2, playButtonWidth, playButtonHeight);
        g.setColor(Color.white);
        g.setFont(new Font("Arial Black",Font.BOLD,20));
        g.drawString("Play Game",Window.getX(0)+Window.getWidth2()/2-playButtonWidth/2+2, 
                    Window.getY(0)+Window.getHeight2()/2); 
    }
}
