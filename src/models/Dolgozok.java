/*
* File: Beosztas.java
* Author:Orosz Levente
* Copyright: 2022, Orosz Levente
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package models;

public class Dolgozok {

    public int id;
    public String name;
    public int groupId;

    public Dolgozok(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }

}
