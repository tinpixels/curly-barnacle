package view.menubars;

import view.menus.*;

import javax.swing.*;

public class MainMenuBar extends JMenuBar
{
    public FileMenu getFileMenu() {
        return _fileMenu;
    }

    public void setFileMenu(FileMenu fileMenu) {
        this._fileMenu = fileMenu;
    }

    public EditMenu getEditMenu() {
        return _editMenu;
    }

    public void setEditMenu(EditMenu editMenu) {
        this._editMenu = editMenu;
    }

    public ViewMenu getViewMenu() {
        return _viewMenu;
    }

    public void setViewMenu(ViewMenu viewMenu) {
        this._viewMenu = viewMenu;
    }

    public WindowMenu getWindowMenu() {
        return _windowMenu;
    }

    public void setWindowMenu(WindowMenu windowMenu) {
        this._windowMenu = windowMenu;
    }

    @Override
    public HelpMenu getHelpMenu() {
        return _helpMenu;
    }

    public void setHelpMenu(HelpMenu _helpMenu) {
        this._helpMenu = _helpMenu;
    }

    private FileMenu _fileMenu;
    private EditMenu _editMenu;
    private ViewMenu _viewMenu;
    private WindowMenu _windowMenu;



    private HelpMenu _helpMenu;

    public MainMenuBar()
    {
        super();

        // Add menus.
        this.setFileMenu(new FileMenu());
        this.setEditMenu(new EditMenu());
        this.setViewMenu(new ViewMenu());
        this.setWindowMenu(new WindowMenu());
//        this.setHelpMenu(new HelpMenu());
        this.setHelpMenu(new HelpMenu());

        this.add(this.getFileMenu());
        this.add(this.getEditMenu());
        this.add(this.getViewMenu());
        this.add(this.getWindowMenu());
        this.add(this.getHelpMenu());
    }
}
