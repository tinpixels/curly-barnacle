import controller.Application;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        final Application application = new Application();

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                application.getMainWindow().setVisible(true);
            }
        });
    }
}
