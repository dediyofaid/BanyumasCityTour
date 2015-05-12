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


    public static HashMap<String, List<String>> hotelDataHashMap() {
        HashMap<String, List<String>> hotelHashMap = new HashMap<String, List<String>>();
        List<String> atriumresorthotelList = new ArrayList<String>();
        List<String> greenvalleyList = new ArrayList<String>();
        List<String> astonList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.atriumArray.length; i++) {
            atriumresorthotelList.add(MyDataArrays.atriumArray[i]);
        }

        for (int i = 0; i < MyDataArrays.greenvalleyArray.length; i++) {
            greenvalleyList.add(MyDataArrays.greenvalleyArray[i]);
        }

        for (int i = 0; i < MyDataArrays.astonArray.length; i++) {
            astonList.add(MyDataArrays.astonArray[i]);
        }

        hotelHashMap.put("Atrium Resort Hotel", atriumresorthotelList);
        hotelHashMap.put("Green Valley Hotel", greenvalleyList);
        hotelHashMap.put("Aston Imperium", astonList);
        return hotelHashMap;
    }


    public static HashMap<String, List<String>> wisataDataHashMap() {
        HashMap<String, List<String>> wisataHashMap = new HashMap<String, List<String>>();
        List<String> wisataAlamList = new ArrayList<String>();
        List<String> wisataReligiList = new ArrayList<String>();
        List<String> wisataSejarahList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.wisataAlamArray.length; i++) {
            wisataAlamList.add(MyDataArrays.wisataAlamArray[i]);
        }

        for (int i = 0; i < MyDataArrays.wisataReligiArray.length; i++) {
            wisataReligiList.add(MyDataArrays.wisataReligiArray[i]);
        }

        for (int i = 0; i < MyDataArrays.wisataSejarahArray.length; i++) {
            wisataSejarahList.add(MyDataArrays.wisataSejarahArray[i]);
        }

        wisataHashMap.put("Wisata Alam", wisataAlamList);
        wisataHashMap.put("Wisata Religi", wisataReligiList);
        wisataHashMap.put("Wisata Sejarah", wisataSejarahList);
        return wisataHashMap;
    }

    public static HashMap<String, List<String>> kulinerDataHashMap() {
        HashMap<String, List<String>> kulinerHashMap = new HashMap<String, List<String>>();
        List<String> buntosList = new ArrayList<String>();
        List<String> gethukList = new ArrayList<String>();
        List<String> paparonList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.buntosArray.length; i++) {
            buntosList.add(MyDataArrays.buntosArray[i]);
        }

        for (int i = 0; i < MyDataArrays.gethukArray.length; i++) {
            gethukList.add(MyDataArrays.gethukArray[i]);
        }

        for (int i = 0; i < MyDataArrays.paparonArray.length; i++) {
            paparonList.add(MyDataArrays.paparonArray[i]);
        }

        kulinerHashMap.put("Bunto's Chicken & Rita Bakery", buntosList);
        kulinerHashMap.put("Gethuk Goreng H. Tohirin Sokaraja", gethukList);
        kulinerHashMap.put("Paparon's Pizza Purwokerto", paparonList);
        return kulinerHashMap;
    }

    public static HashMap<String, List<String>> perjalananDataHashMap() {
        HashMap<String, List<String>> perjalananHashMap = new HashMap<String, List<String>>();
        List<String> amanatList = new ArrayList<String>();
        List<String> arjunaList = new ArrayList<String>();
        List<String> mitraList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.amanatArray.length; i++) {
            amanatList.add(MyDataArrays.amanatArray[i]);
        }

        for (int i = 0; i < MyDataArrays.arjunaArray.length; i++) {
            arjunaList.add(MyDataArrays.arjunaArray[i]);
        }

        for (int i = 0; i < MyDataArrays.mitraArray.length; i++) {
            mitraList.add(MyDataArrays.mitraArray[i]);
        }

        perjalananHashMap.put("Amanat Tour", amanatList);
        perjalananHashMap.put("Arjuna Tour and Travel", arjunaList);
        perjalananHashMap.put("CV Mitra Internusapada Tour & Travel", mitraList);
        return perjalananHashMap;
    }


}
