package view.menus;

import view.menuitems.AboutMenuItem;
import view.menuitems.HelpMenuItem;

import javax.swing.*;

public class HelpMenu extends JMenu
{
    public HelpMenuItem getHelpMenuItem() {
        return _helpMenuItem;
    }

    public void setHelpMenuItem(HelpMenuItem helpMenuItem) {
        this._helpMenuItem = helpMenuItem;
    }

    public AboutMenuItem getAboutMenuItem() {
        return _aboutMenuItem;
    }

    public void setAboutMenuItem(AboutMenuItem aboutMenuItem) {
        this._aboutMenuItem = aboutMenuItem;
    }

    private HelpMenuItem _helpMenuItem;
    private AboutMenuItem _aboutMenuItem;

    public HelpMenu()
    {
        super("Help");

        this.setHelpMenuItem(new HelpMenuItem());
        this.setAboutMenuItem(new AboutMenuItem());

        this.add(this.getHelpMenuItem());
        this.add(this.getAboutMenuItem());

    }
}
