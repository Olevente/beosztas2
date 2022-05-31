/*
* File: MainController.java
* Author:Orosz Levente
* Copyright: 2022, Orosz Levente 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;

    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Orosz Levente");
        this.mainModel.groupList.forEach(group -> {
            this.mainFrame.groupModel.addElement(group.name);
        });
        this.setEvents();
    }

    private void setEvents() {
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());

    }

    private void onActionGroupCombo() {
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectGroupId = index;
        this.mainFrame.workersModel.clear();
        this.mainModel.workersList.forEach(workers -> {
            System.out.println(workers.groupId);

            if (selectGroupId == workers.groupId) {
                this.mainFrame.workersModel.addElement(workers.name);
            }
        });

    }

}
