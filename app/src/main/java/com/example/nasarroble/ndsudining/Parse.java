package com.example.nasarroble.ndsudining;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nasarroble
 */
public class Parse{

    private String url = "https://www.ndsu.edu/dining/menu/longmenu.asp?" +
            "sName=MENUS+ON+THE+WEB&locationNum=04&locationName=Residence+Dining+Center&naFlag=1&" +
            "WeeksMenus=This+Week%27s+Menus&dtdate=09%2F26%2F2015&mealName=Lunch";
    private ArrayList<String> menu = new ArrayList<>();
    private HashMap<String, String> nutrient = new HashMap<>();
    public Parse() {
        try {

            Document doc = Jsoup.connect(url).get();
            Elements bn = doc.select("div[class=\"longmenucoldispname\"]");

            if (bn != null && bn.size() > 0) {
                System.out.println("not empty");
                for (int i = 0; i < bn.size(); i++) {
                    menu.add(bn.get(i).text());
                   // System.out.println(bn.get(i).text());
                    Elements links = bn.get(i).getElementsByTag("a");
                    for (Element link : links) {

                        String url = link.attr("href");
                      //  String text = link.text();
                        nutrient.put(bn.get(i).text(),link.text());
                  //      System.out.println(url);
                    }
                }
            }


        } catch (IOException ex) {
            Logger.getLogger(Parse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


