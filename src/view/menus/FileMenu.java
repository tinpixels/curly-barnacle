package view.menus;

import view.menuitems.*;

import javax.swing.*;

public class FileMenu extends JMenu
{

    public NewMenuItem getNewMenuItem() {
        return _newMenuItem;
    }

    public void setNewMenuItem(NewMenuItem newMenuItem) {
        this._newMenuItem = newMenuItem;
    }

    public OpenMenuItem getOpenMenuItem() {
        return _openMenuItem;
    }

    public void setOpenMenuItem(OpenMenuItem openMenuItem) {
        this._openMenuItem = openMenuItem;
    }

    public SaveMenuItem getSaveMenuItem() {
        return _saveMenuItem;
    }

    public void setSaveMenuItem(SaveMenuItem saveMenuItem) {
        this._saveMenuItem = saveMenuItem;
    }

    public SaveAsMenuItem getSaveAsMenuItem() {
        return _saveAsMenuItem;
    }

    public void setSaveAsMenuItem(SaveAsMenuItem saveAsMenuItem) {
        this._saveAsMenuItem = saveAsMenuItem;
    }

    public CloseMenuItem getCloseMenuItem() {
        return _closeMenuItem;
    }

    public void setCloseMenuItem(CloseMenuItem closeMenuItem) {
        this._closeMenuItem = closeMenuItem;
    }


    private NewMenuItem _newMenuItem;
    private OpenMenuItem _openMenuItem;
    private SaveMenuItem _saveMenuItem;
    private SaveAsMenuItem _saveAsMenuItem;
    private CloseMenuItem _closeMenuItem;

    public FileMenu()
    {
        super("File");

        // Add menu items.
        this.setNewMenuItem(new NewMenuItem());
        this.setOpenMenuItem(new OpenMenuItem());
        this.setSaveMenuItem(new SaveMenuItem());
        this.setSaveAsMenuItem(new SaveAsMenuItem());
        this.setCloseMenuItem(new CloseMenuItem());

        this.add(this.getNewMenuItem());
        this.add(this.getOpenMenuItem());
        this.add(this.getSaveMenuItem());
        this.add(this.getSaveAsMenuItem());
        this.add(this.getCloseMenuItem());
    }
}
