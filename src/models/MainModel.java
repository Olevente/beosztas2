/*
* File: MainModel.java
* Author:Orosz Levente
* Copyright: 2022, Orosz Levente 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    public Group[] groupArray = {
            new Group(1, "Eladó"),
            new Group(2, "Szabó"),
            new Group(3, "Lakatos"),
            new Group(4, "Kereskedő"),
            new Group(5, "Kőműves"),
            new Group(6, "Villanyszerelő"),
            new Group(7, "Felszolgáló"),
            new Group(8, "Óvónő"),
            new Group(9, "Forgácsoló"),
            new Group(10, "Targoncavezető"),
            new Group(11, "Kubikos")
    };
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    public Dolgozok[] workerArray = {
            new Dolgozok(1, "Nyomo Réka", 1),
            new Dolgozok(2, "Remek Elek", 6),
            new Dolgozok(3, "Para Zita", 7),
            new Dolgozok(4, "Pop Simon", 4),
            new Dolgozok(5, "Har Mónika", 8),
            new Dolgozok(6, "Kiss János", 11),
            new Dolgozok(7, "Dil Emma", 1),
            new Dolgozok(8, "Szalmon Ella", 2),
            new Dolgozok(9, "Feles Elek", 4),
            new Dolgozok(10, "Heu Réka", 1),
            new Dolgozok(11, "Kér Ede", 3),
            new Dolgozok(12, "Zsíros B. Ödön", 9),
            new Dolgozok(13, "Külö Nóra", 7),
            new Dolgozok(14, "Kandisz Nóra", 8),
            new Dolgozok(15, "Virra Dóra", 1),
            new Dolgozok(16, "Mike Oxlong", 8),
            new Dolgozok(17, "Annie Position", 5),

    };
    public Vector<Dolgozok> workersList = new Vector<>(Arrays.asList(workerArray));

}
