
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TestSanta {
    public static void main(String[] args) {
        int counter = 0;
        String[] dates = new String[erpData.length];
        for (int i = 0; i < erpData.length; i++) {
            if (/*erpData[i][2].equals("0") && */Integer.parseInt(erpData[i][1].substring(0, 4)) < 2020) {
                dates[counter++] = erpData[i][1];
            }
        }
        Arrays.sort(dates , 0 , counter);
        for (int i = 0; i < counter; i++) {
            System.out.println(dates[i]);
        }
    }

    static String[][] erpData = {
            {"16", "2018-12-17", "1", "0"},
            {"2", "2019-01-02", "1", "4"},
            {"26", "2020-11-26", "0", "7"},
            {"5", "2015-02-12", "0", "4"},
            {"16", "2016-07-28", "0", "1"},
            {"5", "2019-05-19", "0", "0"},
            {"22", "2019-09-07", "0", "0"},
            {"9", "2016-04-30", "1", "6"},
            {"17", "2020-10-26", "1", "8"},
            {"21", "2019-03-27", "1", "10"},
            {"10", "2017-02-07", "0", "3"},
            {"18", "2017-07-12", "0", "2"},
            {"9", "2017-10-08", "1", "4"},
            {"22", "2017-05-16", "0", "3"},
            {"15", "2019-07-04", "1", "0"},
            {"22", "2016-03-02", "1", "2"},
            {"26", "2017-06-14", "1", "2"},
            {"16", "2020-03-25", "0", "8"},
            {"4", "2017-09-27", "0", "4"},
            {"7", "2020-11-29", "1", "3"},
            {"14", "2019-07-08", "0", "6"},
            {"7", "2020-11-02", "1", "2"},
            {"14", "2015-12-23", "0", "2"},
            {"20", "2017-06-12", "0", "6"},
            {"18", "2018-04-09", "1", "0"},
            {"13", "2015-01-30", "1", "0"},
            {"14", "2018-09-18", "1", "4"},
            {"25", "2015-11-30", "1", "8"},
            {"14", "2017-04-06", "0", "4"},
            {"1", "2020-05-03", "1", "2"},
            {"21", "2016-08-01", "1", "2"},
            {"9", "2018-02-10", "0", "5"},
            {"24", "2019-07-06", "0", "6"},
            {"22", "2018-03-12", "1", "3"},
            {"21", "2018-07-27", "0", "8"},
            {"8", "2016-05-13", "1", "10"},
            {"12", "2017-02-24", "0", "1"},
            {"21", "2020-04-19", "0", "5"},
            {"6", "2015-10-10", "0", "1"},
            {"12", "2019-04-10", "1", "9"},
            {"4", "2018-07-26", "0", "3"},
            {"6", "2020-07-07", "1", "1"},
            {"14", "2015-02-10", "1", "4"},
            {"1", "2015-10-22", "0", "2"},
            {"19", "2016-10-05", "0", "6"},
            {"8", "2018-09-22", "0", "5"},
            {"11", "2018-07-27", "0", "6"},
            {"13", "2016-10-25", "0", "4"},
            {"20", "2020-03-04", "1", "0"},
            {"21", "2017-10-12", "0", "1"},
            {"22", "2020-02-03", "0", "3"},
            {"3", "2020-03-11", "1", "6"},
            {"17", "2019-11-27", "0", "2"},
            {"2", "2020-07-27", "0", "8"},
            {"13", "2015-08-02", "1", "7"},
            {"19", "2017-05-25", "1", "5"},
            {"7", "2017-11-16", "1", "7"},
            {"8", "2020-01-26", "1", "10"},
            {"4", "2015-02-24", "0", "6"},
            {"11", "2015-10-26", "0", "4"},
            {"1", "2016-04-11", "0", "6"},
            {"10", "2020-05-27", "1", "4"},
            {"7", "2017-04-28", "1", "9"},
            {"12", "2018-11-03", "0", "9"},
            {"24", "2017-02-13", "1", "10"},
            {"8", "2019-07-18", "1", "0"},
            {"16", "2016-02-11", "1", "6"},
            {"20", "2019-01-14", "1", "1"},
            {"1", "2017-01-01", "0", "4"},
            {"10", "2017-07-25", "1", "8"},
            {"4", "2019-02-29", "1", "1"},
            {"16", "2020-02-28", "0", "6"},
            {"22", "2015-04-06", "0", "3"},
            {"8", "2015-05-21", "0", "5"},
            {"10", "2020-08-07", "1", "1"},
            {"7", "2020-02-07", "1", "1"},
            {"2", "2019-11-07", "1", "5"},
            {"10", "2020-01-25", "0", "3"},
            {"6", "2018-05-28", "1", "9"},
            {"21", "2016-10-02", "0", "3"},
            {"19", "2015-05-28", "1", "3"},
            {"2", "2018-12-11", "1", "9"},
            {"8", "2019-06-29", "1", "4"},
            {"10", "2018-12-04", "0", "10"},
            {"20", "2019-10-05", "0", "2"},
            {"2", "2015-09-01", "0", "9"},
            {"11", "2020-11-23", "1", "1"},
            {"15", "2019-09-19", "0", "2"},
            {"15", "2016-06-25", "1", "10"},
            {"18", "2017-01-26", "0", "7"},
            {"4", "2015-01-03", "1", "10"},
            {"22", "2020-03-16", "1", "1"},
            {"6", "2015-05-26", "1", "6"},
            {"23", "2018-08-08", "1", "2"},
            {"17", "2015-01-19", "1", "9"},
            {"21", "2017-05-12", "1", "6"},
            {"23", "2020-02-11", "0", "7"},
            {"8", "2020-03-03", "0", "5"},
            {"8", "2020-03-23", "1", "10"},
            {"19", "2016-07-10", "1", "2"},
            {"6", "2019-09-25", "1", "7"},
            {"22", "2020-01-29", "1", "10"},
            {"7", "2018-08-27", "1", "8"},
            {"22", "2017-12-05", "1", "6"},
            {"18", "2015-09-20", "1", "10"},
            {"3", "2018-07-16", "0", "2"},
            {"10", "2017-08-02", "0", "0"},
            {"2", "2018-10-12", "0", "4"},
            {"8", "2020-11-11", "1", "3"},
            {"26", "2018-12-30", "0", "4"},
            {"16", "2015-06-26", "1", "3"},
            {"26", "2017-02-06", "0", "3"},
            {"10", "2019-10-03", "1", "5"},
            {"17", "2018-09-16", "1", "10"},
            {"5", "2015-04-29", "1", "8"},
            {"19", "2020-02-29", "0", "9"},
            {"24", "2020-10-25", "0", "7"},
            {"11", "2015-02-09", "0", "3"},
            {"10", "2017-08-11", "0", "8"},
            {"17", "2020-10-25", "1", "1"},
            {"26", "2018-01-06", "0", "2"},
            {"1", "2017-05-15", "0", "6"},
            {"12", "2015-10-19", "0", "8"},
            {"13", "2015-12-19", "0", "3"},
            {"25", "2019-10-25", "1", "9"},
            {"17", "2015-03-26", "1", "10"},
            {"15", "2017-12-05", "0", "3"},
            {"4", "2017-09-25", "0", "1"},
            {"19", "2017-09-21", "1", "4"},
            {"15", "2020-06-28", "1", "4"},
            {"6", "2016-05-15", "0", "5"},
            {"16", "2016-06-27", "1", "3"},
            {"9", "2017-01-20", "0", "3"},
            {"15", "2015-10-14", "0", "1"},
            {"18", "2016-08-06", "1", "2"},
            {"2", "2017-12-07", "0", "5"},
            {"16", "2020-11-14", "1", "0"},
            {"10", "2020-03-24", "1", "8"},
            {"2", "2017-03-16", "0", "10"},
            {"7", "2016-04-27", "1", "2"},
            {"21", "2020-08-12", "0", "4"},
            {"20", "2019-05-02", "0", "5"},
            {"7", "2015-12-09", "0", "3"},
            {"15", "2020-04-02", "0", "3"},
            {"15", "2017-08-09", "0", "0"},
            {"18", "2016-02-09", "0", "1"},
            {"3", "2018-08-08", "1", "7"},
            {"9", "2017-06-09", "1", "8"},
            {"21", "2015-06-05", "0", "0"},
            {"21", "2020-03-12", "1", "2"},
            {"1", "2016-03-03", "0", "2"},
            {"13", "2016-08-18", "0", "5"},
            {"18", "2015-01-28", "1", "1"},
            {"5", "2019-03-01", "1", "5"},
            {"24", "2019-06-23", "1", "4"},
            {"22", "2020-11-27", "1", "7"},
            {"24", "2017-11-09", "0", "9"},
            {"16", "2017-04-22", "1", "7"},
            {"13", "2020-02-03", "0", "4"},
            {"9", "2016-05-25", "0", "1"},
            {"9", "2015-01-08", "1", "0"},
            {"13", "2018-12-18", "0", "9"},
            {"22", "2017-02-22", "1", "9"},
            {"4", "2018-06-04", "1", "6"},
            {"10", "2020-01-10", "0", "5"},
            {"20", "2015-02-01", "0", "4"},
            {"3", "2019-02-16", "0", "9"},
            {"20", "2017-04-23", "1", "9"},
            {"14", "2015-12-11", "1", "2"},
            {"2", "2018-03-18", "0", "7"},
            {"19", "2016-03-26", "1", "5"},
            {"4", "2016-08-08", "0", "0"},
            {"18", "2019-09-01", "0", "7"},
            {"26", "2016-10-14", "1", "0"},
            {"5", "2015-09-18", "0", "9"},
            {"15", "2020-03-19", "1", "2"},
            {"16", "2015-05-14", "0", "3"},
            {"5", "2020-01-20", "1", "4"},
            {"24", "2017-10-09", "1", "7"},
            {"12", "2018-06-19", "1", "6"},
            {"21", "2020-05-14", "0", "7"},
            {"17", "2018-03-30", "1", "1"},
            {"4", "2016-08-13", "1", "2"},
            {"16", "2020-04-28", "1", "4"},
            {"10", "2016-01-12", "0", "10"},
            {"1", "2017-12-28", "1", "8"},
            {"15", "2018-03-27", "1", "5"},
            {"19", "2020-11-11", "1", "5"},
            {"6", "2020-03-02", "1", "0"},
            {"15", "2019-05-07", "0", "5"},
            {"6", "2019-09-30", "0", "10"},
            {"22", "2017-03-15", "0", "7"},
            {"8", "2016-09-06", "1", "3"},
            {"9", "2019-09-11", "1", "7"},
            {"20", "2020-02-26", "0", "4"},
            {"13", "2020-07-06", "0", "9"},
            {"9", "2015-08-30", "1", "8"},
            {"11", "2016-09-29", "1", "8"},
            {"23", "2020-06-07", "0", "10"},
            {"13", "2015-10-06", "1", "7"},
            {"13", "2016-06-19", "0", "5"},
            {"17", "2015-06-07", "1", "3"},
            {"25", "2015-06-10", "1", "5"},
            {"23", "2019-04-19", "0", "8"},
            {"7", "2017-02-29", "0", "10"},
            {"3", "2019-02-25", "1", "4"},
            {"15", "2016-07-24", "0", "1"},
            {"8", "2020-04-16", "1", "5"},
            {"19", "2016-11-10", "1", "1"},
            {"7", "2015-08-29", "1", "4"},
            {"7", "2017-06-08", "1", "7"},
            {"24", "2015-04-03", "0", "2"},
            {"20", "2019-09-01", "1", "6"},
            {"5", "2015-02-02", "0", "4"},
            {"25", "2016-11-30", "1", "1"},
            {"22", "2019-08-24", "1", "8"},
            {"10", "2020-12-05", "0", "2"},
            {"25", "2018-05-21", "0", "3"},
            {"2", "2019-11-01", "1", "2"},
            {"2", "2016-11-16", "1", "5"},
            {"25", "2016-01-24", "0", "3"},
            {"19", "2020-12-08", "1", "6"},
            {"8", "2019-07-18", "1", "5"},
            {"22", "2016-02-12", "1", "7"},
            {"7", "2019-08-08", "1", "2"},
            {"18", "2020-05-18", "0", "1"},
            {"19", "2019-11-01", "0", "7"},
            {"15", "2015-05-02", "1", "10"},
            {"6", "2019-09-10", "1", "5"},
            {"10", "2018-12-05", "0", "8"},
            {"21", "2019-08-14", "1", "4"},
            {"19", "2016-01-06", "1", "6"},
            {"19", "2019-08-29", "1", "3"},
            {"7", "2020-04-18", "1", "0"},
            {"24", "2015-11-19", "1", "2"},
            {"4", "2019-09-07", "0", "5"},
            {"26", "2015-07-16", "1", "2"},
            {"12", "2015-10-05", "0", "6"},
            {"7", "2019-12-27", "1", "9"},
            {"26", "2018-09-11", "0", "6"},
            {"26", "2017-05-17", "1", "2"},
            {"23", "2020-02-26", "0", "3"},
            {"2", "2017-04-20", "0", "6"},
            {"3", "2019-10-10", "1", "0"},
            {"3", "2018-06-24", "0", "1"},
            {"21", "2016-03-01", "1", "5"},
            {"23", "2017-09-09", "1", "2"},
            {"12", "2017-02-01", "1", "5"},
            {"18", "2019-08-20", "0", "1"},
            {"19", "2015-12-10", "0", "9"},
            {"24", "2018-09-16", "0", "4"},
    };

}