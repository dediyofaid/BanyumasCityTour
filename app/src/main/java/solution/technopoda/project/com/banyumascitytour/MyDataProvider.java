package solution.technopoda.project.com.banyumascitytour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Dedi Yofaid on 11/05/2015.
 */
public class MyDataProvider {
    public static HashMap<String, List<String>> getDataHashMap() {
        HashMap<String, List<String>> pendidikanHashMap = new HashMap<String, List<String>>();

        List<String> perguruantinggiList = new ArrayList<String>();
        List<String> smaList = new ArrayList<String>();
        List<String> smpList = new ArrayList<String>();







        for (int i = 0; i < MyDataArrays.perguruantinggiArray.length; i++) {
            perguruantinggiList.add(MyDataArrays.perguruantinggiArray[i]);
        }

        for (int i = 0; i < MyDataArrays.smaArray.length; i++) {
            smaList.add(MyDataArrays.smaArray[i]);
        }

        for (int i = 0; i < MyDataArrays.smpArray.length; i++) {
            smpList.add(MyDataArrays.smpArray[i]);
        }



        pendidikanHashMap.put("Perguruan Tinggi", perguruantinggiList);
        pendidikanHashMap.put("SMA/SMK/MAN", smaList);
        pendidikanHashMap.put("SMP/MTS", smpList);
        return pendidikanHashMap;
        //--------------------------------------------------------------------------


    }
    public static HashMap<String, List<String>> kesehatanDataHashMap() {
        HashMap<String, List<String>> kesehatanHashMap = new HashMap<String, List<String>>();
        List<String> banyumasList = new ArrayList<String>();
        List<String> margonoList = new ArrayList<String>();
        List<String> hidayahList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.banyumasArray.length; i++) {
            banyumasList.add(MyDataArrays.banyumasArray[i]);
        }

        for (int i = 0; i < MyDataArrays.margonoArray.length; i++) {
            margonoList.add(MyDataArrays.margonoArray[i]);
        }

        for (int i = 0; i < MyDataArrays.hidayahArray.length; i++) {
            hidayahList.add(MyDataArrays.hidayahArray[i]);
        }

        kesehatanHashMap.put("RSUD Banyumas", banyumasList);
        kesehatanHashMap.put("RSUD Margono Soekarjo", margonoList);
        kesehatanHashMap.put("RSUD Hidayah", hidayahList);
        return kesehatanHashMap;
    }
}
