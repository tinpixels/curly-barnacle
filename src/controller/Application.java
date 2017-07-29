package controller;

import controller.listeners.*;
import view.windows.MainWindow;

public class Application
{
    public MainWindow getMainWindow() {
        return _mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this._mainWindow = mainWindow;
    }

    private MainWindow _mainWindow;


    private NewActionListener _newActionListener = new NewActionListener();
    private OpenActionListener _openActionListener = new OpenActionListener();
    private SaveActionListener _saveActionListener = new SaveActionListener();
    private SaveAsActionListener _saveAsActionListener = new SaveAsActionListener();
    private CloseActionListener _closeActionListener = new CloseActionListener();
    private UndoActionListener _undoActionListener = new UndoActionListener();
    private RedoActionListener _redoActionListener = new RedoActionListener();
    private CutActionListener _cutActionListener = new CutActionListener();
    private CopyActionListener _copyActionListener = new CopyActionListener();
    private PasteActionListener _pasteActionListener = new PasteActionListener();
    private HelpActionListener _helpActionListener = new HelpActionListener();
    private AboutActionListener _aboutActionListener = new AboutActionListener();


    public Application()
    {
        this.setMainWindow(new MainWindow());

        this.getMainWindow().getMainMenuBar().getFileMenu().getNewMenuItem().addActionListener(this._newActionListener);
        this.getMainWindow().getMainMenuBar().getFileMenu().getOpenMenuItem().addActionListener(this._openActionListener);
        this.getMainWindow().getMainMenuBar().getFileMenu().getSaveMenuItem().addActionListener(this._saveActionListener);
        this.getMainWindow().getMainMenuBar().getFileMenu().getSaveAsMenuItem().addActionListener(this._saveAsActionListener);
        this.getMainWindow().getMainMenuBar().getFileMenu().getCloseMenuItem().addActionListener(this._closeActionListener);
        this.getMainWindow().getMainMenuBar().getEditMenu().getUndoMenuItem().addActionListener(this._undoActionListener);
        this.getMainWindow().getMainMenuBar().getEditMenu().getRedoMenuItem().addActionListener(this._redoActionListener);
        this.getMainWindow().getMainMenuBar().getEditMenu().getCutMenuItem().addActionListener(this._cutActionListener);
        this.getMainWindow().getMainMenuBar().getEditMenu().getCopyMenuItem().addActionListener(this._copyActionListener);
        this.getMainWindow().getMainMenuBar().getEditMenu().getPasteMenuItem().addActionListener(this._pasteActionListener);
        this.getMainWindow().getMainMenuBar().getHelpMenu().getHelpMenuItem().addActionListener(this._helpActionListener);
        this.getMainWindow().getMainMenuBar().getHelpMenu().getAboutMenuItem().addActionListener(this._aboutActionListener);

    }
}
