package Leo.sumanEx1;

import java.time.LocalDate;
import java.util.Map;

import static java.util.Map.entry;

public class lastViews {
    //Get total number of Page Views for last 2 days

    //I need to ask if this will inlcude today and yesterday. Or yesterday and dobleYesterday
    public static void main(String[] args) {
        Map < String, Map < String, Map< String, Integer >>> originMAP = Map.ofEntries(
                entry("2023-02-07",
                        Map.ofEntries(entry("new reddit",
                                Map.ofEntries(entry("uniques", 111902),
                                        entry("pageviews", 221081))), entry("android", Map.ofEntries(entry("uniques", 298063), entry("pageviews", 1153728))), entry("old reddit", Map.ofEntries(entry("uniques", 132801), entry("pageviews", 723509))), entry("ios", Map.ofEntries(entry("uniques", 311642), entry("pageviews", 755030))), entry("mobile web", Map.ofEntries(entry("uniques", 130288), entry("pageviews", 219457))))),
                entry("2023-02-08", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 118371), entry("pageviews", 225093))), entry("android", Map.ofEntries(entry("uniques", 280199), entry("pageviews", 1291546))), entry("old reddit", Map.ofEntries(entry("uniques", 145437), entry("pageviews", 760191))), entry("ios", Map.ofEntries(entry("uniques", 257443), entry("pageviews", 575184))), entry("mobile web", Map.ofEntries(entry("uniques", 116411), entry("pageviews", 191464))))),
                entry("2023-01-11", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 175446), entry("pageviews", 300378))), entry("android", Map.ofEntries(entry("uniques", 331628), entry("pageviews", 1613490))), entry("old reddit", Map.ofEntries(entry("uniques", 164052), entry("pageviews", 830788))), entry("ios", Map.ofEntries(entry("uniques", 288464), entry("pageviews", 626490))), entry("mobile web", Map.ofEntries(entry("uniques", 111844), entry("pageviews", 193197))))),
                entry("2023-01-10", Map.ofEntries(entry("new reddit", Map.ofEntries(entry("uniques", 140548), entry("pageviews", 267522))), entry("android", Map.ofEntries(entry("uniques", 375491), entry("pageviews", 1336061))), entry("old reddit", Map.ofEntries(entry("uniques", 189477), entry("pageviews", 957462))), entry("ios", Map.ofEntries(entry("uniques", 418290), entry("pageviews", 985014))), entry("mobile web", Map.ofEntries(entry("uniques", 198403), entry("pageviews", 336195)))))
        );


        LocalDate todaysDate = LocalDate.now();
        long pageViews = 0;
        long uniquesViews=0;
        int daysToView = 2;

        for(Map.Entry< String, Map < String, Map < String, Integer>>> entryFirstLayer : originMAP.entrySet()){
            int temp = 0;
            LocalDate layerDate = LocalDate.parse(entryFirstLayer.getKey());
            while (temp < daysToView){
                int condition = todaysDate.minusDays(temp).compareTo(layerDate);
                if(condition == 0){
                    for(Map.Entry< String, Map < String, Integer>> entrySecondLayer : entryFirstLayer.getValue().entrySet()){
                        if(entrySecondLayer.getKey()=="new reddit") { //If i want all, i will erase this.
                            for (Map.Entry<String, Integer> entryThirdLayer : entrySecondLayer.getValue().entrySet()) {
                                if (entryThirdLayer.getKey() == "pageviews") {
                                    pageViews += entryThirdLayer.getValue();
                                } //if i want uniques, i will create a long uniquesViews and acumulate.
                                if (entryThirdLayer.getKey() == "uniques") {
                                    uniquesViews += entryThirdLayer.getValue();
                                }
                            }
                        }
                    }
                }
                temp++;
            }
        }
        System.out.println("this are the pageViews =" +pageViews);
        System.out.println("this are the uniques =" +uniquesViews);
    }
}

