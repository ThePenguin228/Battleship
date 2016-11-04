
package battleship;

import java.awt.*;


public class Window {
    static final int XBORDER = 20;
    static final int YBORDER = 20;
    static final int YTITLE = 30;
    static final int WINDOW_BORDER = 8;
    static final int WINDOW_WIDTH = 700;
    static final int WINDOW_HEIGHT = YTITLE + WINDOW_BORDER + 2 * YBORDER + 950;
    static int xsize = -1;
    static int ysize = -1;
//    Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize(); 
//    windowSize.width -= screenInsets.right + screenInsets.left + (INSET * 2); 
//    windowSize.height -= screenInsets.top + screenInsets.bottom + (INSET * 2); 
/////////////////////////////////////////////////////////////////////////
    public static int getX(int x) {
        return (x + XBORDER + WINDOW_BORDER);
    }

    public static int getY(int y) {
        return (y + YBORDER + YTITLE );
    }

    public static int getYNormal(int y) {
        return (-y + YBORDER + YTITLE + getHeight2());
    }
    
    public static int getWidth2() {
        return (xsize - 2 * (XBORDER + WINDOW_BORDER));
    }

    public static int getHeight2() {
        return (ysize - 2 * YBORDER - WINDOW_BORDER - YTITLE);
    }    
}
