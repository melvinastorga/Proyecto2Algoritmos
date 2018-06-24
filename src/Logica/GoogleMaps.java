package Logica;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author deltadragon
 */
public class GoogleMaps {

    /**
     * In map.html file default zoom value is set to 4.
     */

    public void getMapa(String latitud, String longitud) {
        final Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame("GoogleMaps");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL("https://www.google.com/maps/place/" + latitud + "," + longitud);
    }
}
