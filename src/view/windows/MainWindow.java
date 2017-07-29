package view.windows;

import view.menubars.MainMenuBar;

import javax.swing.*;

public class MainWindow extends JFrame
{
    public MainMenuBar getMainMenuBar() {
        return _mainMenuBar;
    }

    public void setMainMenuBar(MainMenuBar mainMenuBar) {
        this._mainMenuBar = mainMenuBar;
    }

    private MainMenuBar _mainMenuBar;

    public MainWindow()
    {
        super("curly-barnacle");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Add components.
        this.setMainMenuBar(new MainMenuBar());

        this.setJMenuBar(this.getMainMenuBar());
    }
}
