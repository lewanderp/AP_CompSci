package finalProgram;

import java.util.Calendar;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PageOpener {

    private Calendar toUse;
    private String urlTemplate;
    private URI toOpen;
    private final String YEAR = "§";
    private final String MONTH = "¶";
    private final String DAY = "†";

    public PageOpener(Calendar d, String urlBase) {
        toUse = d;
        urlTemplate = urlBase;
        URIGenerator();
    }

    public void openPage() {
        try {
            Desktop.getDesktop().browse(toOpen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Calendar getCalendar() {
        return toUse;
    }

    public URI getURI() {
        return toOpen;
    }

    private void URIGenerator() {
        String url = urlTemplate;
        for (int i = 0; i < urlTemplate.length(); i++) {
            if (urlTemplate.substring(i, i + 1).equals(YEAR)) {
                String temp1 = url.substring(0, i);
                String temp2 = url.substring(i + 1, url.length());
                url = temp1 + toUse.get(1) + temp2;
            } else if (urlTemplate.substring(i, i + 1).equals(MONTH)) {
                String temp1 = url.substring(0, i);
                String temp2 = url.substring(i + 1, url.length());
                url = temp1 + toUse.get(2) + temp2;
            } else if (urlTemplate.substring(i, i + 1).equals(DAY)) {
                String temp1 = url.substring(0, i);
                String temp2 = url.substring(i + 1, url.length());
                url = temp1 + toUse.get(5) + temp2;
            }

        }
        
        try {
            toOpen = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}