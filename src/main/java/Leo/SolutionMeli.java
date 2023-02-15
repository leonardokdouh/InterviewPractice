package Leo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Main class should be named 'Solution'
class SolutionMel {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}

class InputClassJava {



    /**
     *What data structures will you use to manipulate this Json?
     * HashMap: Map <Fecha, Map <Platform, Map<page/uniques, Integer> myMap= new HashMap<>();
     * * "2020-01-20": {
     *             "android": {
     *               "pageviews": 1048749,
     *               "uniques": 283306
     *             },
     *             "ios": {
     *               "pageviews": 828792,
     *               "uniques": 390098
     *             },
     *             "mobile_web": {
     *               "pageviews": 184459,
     *               "uniques": 115771
     *             },
     *             "new_reddit": {
     *               "pageviews": 398615,
     *               "uniques": 233145
     *             },
     *             "old_reddit": {
     *               "pageviews": 907138,
     *               "uniques": 196448
     *             }
     *           }
     */


    static public Map<String, DateEntry> generateDataInMapFormat() {
        HashMap<String, DateEntry> mapToReturn = new HashMap<>();
        String[] lines = inputString.split("\n");
        for (int i = 0; i < lines.length; i++) {
            DateEntry dateEntry = new DateEntry();
            String[] split = lines[i].split(",");
            for (int p = 1; p < split.length; p++) {
                String type = split[p];
                int pageView = Integer.parseInt(split[p+1]);
                int uniqueCount = Integer.parseInt(split[p+2]);
                PageViewAndUniquesDataObject pageViewAndUniquesDataObject = new PageViewAndUniquesDataObject(pageView, uniqueCount);
                switch (type) {
                    case "android":
                        dateEntry.android = pageViewAndUniquesDataObject;
                        break;
                    case "iOS":
                        dateEntry.ios = pageViewAndUniquesDataObject;
                        break;
                    case "mobileWeb":
                        dateEntry.mobile_web = pageViewAndUniquesDataObject;
                        break;
                    case "newReddit":
                        dateEntry.new_reddit = pageViewAndUniquesDataObject;
                        break;
                    case "oldReddit":
                        dateEntry.old_reddit = pageViewAndUniquesDataObject;
                        break;
                }
                p = p + 2;
            }
            mapToReturn.put(split[0], dateEntry);
        }
        return mapToReturn;
    }

    static String inputString = "2019-11-26\n" +
            "2019-11-27,android,1336061,375491,iOS,985014,418290,mobileWeb,336195,198403,newReddit,267522,140548,oldReddit,957462,189477\n" +
            "2019-11-28,android,1153728,298063,iOS,755030,311642,mobileWeb,219457,130288,newReddit,221081,111902,oldReddit,723509,132801\n" +
            "2019-11-29,android,1291546,280199,iOS,575184,257443,mobileWeb,191464,116411,newReddit,225093,118371,oldReddit,760191,145437\n" +
            "2019-11-30,android,1613490,331628,iOS,626490,288464,mobileWeb,193197,111844,newReddit,300378,175446,oldReddit,830788,164052\n" +
            "2019-12-01,android,1075637,310187,iOS,868377,375826,mobileWeb,223399,122215,newReddit,356930,208573,oldReddit,983578,197101\n" +
            "2019-12-02,android,1211191,355036,iOS,1005068,423271,mobileWeb,308485,161385,newReddit,426082,235286,oldReddit,1044983,224812\n" +
            "2019-12-03,android,1142720,326486,iOS,1002917,408472,mobileWeb,333752,176264,newReddit,381209,202905,oldReddit,1071201,218746\n" +
            "2019-12-04,android,896853,292943,iOS,883463,372019,mobileWeb,309958,165411,newReddit,272320,153546,oldReddit,813187,176295\n" +
            "2019-12-05,android,859666,250634,iOS,776614,301808,mobileWeb,252932,136008,newReddit,203651,104984,oldReddit,698273,133476\n" +
            "2019-12-06,android,893927,268507,iOS,721442,301548,mobileWeb,272139,172320,newReddit,273291,148183,oldReddit,830540,163286\n" +
            "2019-12-07,android,720578,228043,iOS,610685,273632,mobileWeb,233233,145642,newReddit,246216,131454,oldReddit,809409,164890\n" +
            "2019-12-08,android,866966,257861,iOS,696012,295133,mobileWeb,146846,91303,newReddit,299146,153051,oldReddit,746445,165837\n" +
            "2019-12-09,android,917009,297440,iOS,771828,369154,mobileWeb,281645,176258,newReddit,321270,182655,oldReddit,979610,217932\n" +
            "2019-12-10,android,1017050,297403,iOS,786895,340634,mobileWeb,303616,191342,newReddit,308475,169901,oldReddit,936982,189128\n" +
            "2019-12-11,android,1155272,344532,iOS,961367,414086,mobileWeb,316443,180163,newReddit,291638,157320,oldReddit,992157,209716\n" +
            "2019-12-12,android,934881,277578,iOS,753657,330896,mobileWeb,229383,131696,newReddit,242391,127208,oldReddit,759403,147741\n" +
            "2019-12-13,android,1225972,353731,iOS,1149590,458661,mobileWeb,309976,172001,newReddit,414602,225001,oldReddit,1155450,217974\n" +
            "2019-12-14,android,1149410,395503,iOS,1261771,509686,mobileWeb,301117,182553,newReddit,650360,365394,oldReddit,1049098,248047\n" +
            "2019-12-15,android,1189013,361782,iOS,1222918,491474,mobileWeb,340257,178917,newReddit,377485,212397,oldReddit,1117135,222187\n" +
            "2019-12-16,android,883781,292929,iOS,843265,386380,mobileWeb,264919,153470,newReddit,284949,176978,oldReddit,1011618,220325\n" +
            "2019-12-17,android,850667,247563,iOS,767865,307741,mobileWeb,214536,118853,newReddit,279638,146726,oldReddit,959795,177118\n" +
            "2019-12-18,android,720454,218085,iOS,616098,273528,mobileWeb,201056,119318,newReddit,175020,92434,oldReddit,738077,144804\n" +
            "2019-12-19,android,764325,231608,iOS,748339,324697,mobileWeb,226231,127424,newReddit,211358,110537,oldReddit,747725,137999\n" +
            "2019-12-20,android,1009634,277224,iOS,985454,365798,mobileWeb,340559,172191,newReddit,380106,187060,oldReddit,1197665,207036\n" +
            "2019-12-21,android,848622,235523,iOS,757241,299549,mobileWeb,255190,135642,newReddit,327093,166043,oldReddit,1004334,174195\n" +
            "2019-12-22,android,711952,237852,iOS,688647,320108,mobileWeb,232315,136811,newReddit,394880,265357,oldReddit,861369,186888\n" +
            "2019-12-23,android,766997,249285,iOS,732930,334302,mobileWeb,201104,119804,newReddit,238816,136042,oldReddit,754392,146707\n" +
            "2019-12-24,android,895987,272203,iOS,859704,364293,mobileWeb,282609,161611,newReddit,334023,178003,oldReddit,938582,188509\n" +
            "2019-12-25,android,1205083,335858,iOS,1263216,468237,mobileWeb,325777,181759,newReddit,311810,165675,oldReddit,920115,183343\n" +
            "2019-12-26,android,951608,296377,iOS,983876,405359,mobileWeb,289110,169347,newReddit,262176,164183,oldReddit,807378,168252\n" +
            "2019-12-27,android,716841,205726,iOS,583224,243210,mobileWeb,152725,90524,newReddit,213456,112371,oldReddit,763489,135122\n" +
            "2019-12-28,android,885550,262365,iOS,757652,329568,mobileWeb,221004,131525,newReddit,275350,164440,oldReddit,936442,197569\n" +
            "2019-12-29,android,1136770,337558,iOS,1011291,421009,mobileWeb,226507,136628,newReddit,515574,302266,oldReddit,1037322,224113\n" +
            "2019-12-30,android,854847,242732,iOS,686744,314710,mobileWeb,238664,139864,newReddit,247561,151861,oldReddit,851689,192428\n" +
            "2019-12-31,android,1150444,324092,iOS,969914,438752,mobileWeb,313117,181763,newReddit,322088,190611,oldReddit,1092289,244912\n" +
            "2020-01-01,android,1193759,301888,iOS,1004094,396294,mobileWeb,271591,152289,newReddit,272765,144697,oldReddit,864199,171296\n" +
            "2020-01-02,android,962797,268282,iOS,828801,365575,mobileWeb,253350,148604,newReddit,224350,132178,oldReddit,797857,175173\n" +
            "2020-01-03,android,753472,223278,iOS,563915,282073,mobileWeb,188831,112560,newReddit,211066,126008,oldReddit,669198,147196\n" +
            "2020-01-04,android,1096164,309467,iOS,890928,393046,mobileWeb,266852,158225,newReddit,320596,187187,oldReddit,985259,212018\n" +
            "2020-01-05,android,979532,277708,iOS,847920,369393,mobileWeb,244069,146472,newReddit,291979,173726,oldReddit,918243,204639\n" +
            "2020-01-06,android,1138852,323401,iOS,985817,442360,mobileWeb,270442,160943,newReddit,322952,188132,oldReddit,894164,194601\n" +
            "2020-01-07,android,897041,260099,iOS,736483,346120,mobileWeb,235071,142057,newReddit,257214,158398,oldReddit,886109,194097\n" +
            "2020-01-08,android,1130614,307259,iOS,844338,371143,mobileWeb,246071,142415,newReddit,258091,143176,oldReddit,822883,170550\n" +
            "2020-01-09,android,1266037,345190,iOS,1219302,475284,mobileWeb,384964,199407,newReddit,297321,173010,oldReddit,890779,195166\n" +
            "2020-01-10,android,1195259,310991,iOS,985675,404357,mobileWeb,265551,148136,newReddit,336884,188324,oldReddit,975506,192578\n" +
            "2020-01-11,android,1238809,352852,iOS,1280193,509026,mobileWeb,308224,176322,newReddit,695061,415375,oldReddit,1052078,225951\n" +
            "2020-01-12,android,940563,264979,iOS,811657,355546,mobileWeb,239530,134925,newReddit,281969,165749,oldReddit,903507,191280\n" +
            "2020-01-13,android,730295,196759,iOS,526199,252986,mobileWeb,162475,104726,newReddit,195413,117025,oldReddit,661811,138799\n" +
            "2020-01-14,android,875835,225737,iOS,660286,298102,mobileWeb,194847,123422,newReddit,268803,157003,oldReddit,928663,182583\n" +
            "2020-01-15,android,858731,218702,iOS,613857,279428,mobileWeb,205438,128173,newReddit,183293,101012,oldReddit,783536,159166\n" +
            "2020-01-16,android,1120160,273314,iOS,988276,387495,mobileWeb,288832,158737,newReddit,240202,130491,oldReddit,989403,185670\n" +
            "2020-01-17,android,862312,226090,iOS,619707,290069,mobileWeb,193268,122686,newReddit,229165,142950,oldReddit,795943,164039\n" +
            "2020-01-18,android,1059309,271188,iOS,949155,377975,mobileWeb,219475,129146,newReddit,263442,151467,oldReddit,942120,192728\n" +
            "2020-01-19,android,880578,240355,iOS,730838,319622,mobileWeb,184750,114611,newReddit,279593,168069,oldReddit,760666,155327\n" +
            "2020-01-20,android,1048749,283306,iOS,828792,390098,mobileWeb,184459,115771,newReddit,398615,233145,oldReddit,907138,196448\n" +
            "2020-01-21,android,818019,202770,iOS,543987,241062,mobileWeb,168518,109986,newReddit,196908,109611,oldReddit,660134,123657\n" +
            "        ";
}

class PageViewAndUniquesDataObject {
    public final int pageViews;
    public final int uniques;

    public PageViewAndUniquesDataObject(int pageviews, int uniques) {
        this.pageViews = pageviews;
        this.uniques = uniques;
    }

    @Override
    public String toString() {
        return "BaseClasss{" +
                "pageViews=" + pageViews +
                ", uniques=" + uniques +
                '}';
    }
}
class DateEntry {
    PageViewAndUniquesDataObject android;
    PageViewAndUniquesDataObject ios;
    PageViewAndUniquesDataObject mobile_web;
    PageViewAndUniquesDataObject new_reddit;
    PageViewAndUniquesDataObject old_reddit;

    @Override
    public String toString() {
        return "DateEntrys{" +
                "android=" + android +
                ", ios=" + ios +
                ", mobile_web=" + mobile_web +
                ", new_reddit=" + new_reddit +
                ", old_reddit=" + old_reddit +
                '}';
    }


    static int getPageViewsLastSevenDays(Map<String, DateEntry> data) {
        Map<String, DateEntry> lastSevenDaysMap = new HashMap<>();
        LocalDate currentDate = LocalDate.now();
        String currentDateString = currentDate.toString();
        int pageViews = 0;
        int count = 0;
        for (Map.Entry<String, DateEntry> entry : data.entrySet()) {
            if (entry.getKey().equals(currentDateString) || (currentDate.isAfter(LocalDate.parse(entry.getKey())) && count < 7)) {
                lastSevenDaysMap.put(entry.getKey(), entry.getValue());
                count++;
            }
            if (count == 7) {
                break;
            }
        }

        for (Map.Entry<String, DateEntry> entry : lastSevenDaysMap.entrySet()) {
            pageViews += entry.getValue().android.pageViews;
            pageViews += entry.getValue().ios.pageViews;
            pageViews += entry.getValue().mobile_web.pageViews;
            pageViews += entry.getValue().new_reddit.pageViews;
            pageViews += entry.getValue().old_reddit.pageViews;
        }
        return pageViews;
    }
}