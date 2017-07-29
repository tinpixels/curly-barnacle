package view.menus;

import view.menuitems.*;

import javax.swing.*;

public class EditMenu extends JMenu
{
    public UndoMenuItem getUndoMenuItem() {
        return _undoMenuItem;
    }

    public void setUndoMenuItem(UndoMenuItem undoMenuItem) {
        this._undoMenuItem = undoMenuItem;
    }

    public RedoMenuItem getRedoMenuItem() {
        return _redoMenuItem;
    }

    public void setRedoMenuItem(RedoMenuItem redoMenuItem) {
        this._redoMenuItem = redoMenuItem;
    }

    public CutMenuItem getCutMenuItem() {
        return _cutMenuItem;
    }

    public void setCutMenuItem(CutMenuItem cutMenuItem) {
        this._cutMenuItem = cutMenuItem;
    }

    public CopyMenuItem getCopyMenuItem() {
        return _copyMenuItem;
    }

    public void setCopyMenuItem(CopyMenuItem copyMenuItem) {
        this._copyMenuItem = copyMenuItem;
    }

    public PasteMenuItem getPasteMenuItem() {
        return _pasteMenuItem;
    }

    public void setPasteMenuItem(PasteMenuItem pasteMenuItem) {
        this._pasteMenuItem = pasteMenuItem;
    }

    private UndoMenuItem _undoMenuItem;
    private RedoMenuItem _redoMenuItem;
    private CutMenuItem _cutMenuItem;
    private CopyMenuItem _copyMenuItem;
    private PasteMenuItem _pasteMenuItem;

    public EditMenu()
    {
        super("Edit");

        this.setUndoMenuItem(new UndoMenuItem());
        this.setRedoMenuItem(new RedoMenuItem());
        this.setCutMenuItem(new CutMenuItem());
        this.setCopyMenuItem(new CopyMenuItem());
        this.setPasteMenuItem(new PasteMenuItem());

        this.add(this.getUndoMenuItem());
        this.add(this.getRedoMenuItem());
        this.add(this.getCutMenuItem());
        this.add(this.getCopyMenuItem());
        this.add(this.getPasteMenuItem());

    }
}
