package server.controller;

import server.model.MainModel;
import server.view.MainView;

public class Controller {
    private MainModel mainModel;
    private MainView mainView;
    public Controller(MainView mainView, MainModel mainModel){
        this.mainView = mainView;
        this.mainModel = mainModel;
    }
}
