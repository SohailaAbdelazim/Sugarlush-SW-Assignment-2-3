package src;
import src.GUIManagement.GUI;
import src.ShoppingManagement.ProudctsCatalog;

import javax.mail.MessagingException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, MessagingException {
        GUI viewer = new GUI();
        viewer.view();
    }
}