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
        List<String> sdList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.perguruantinggiArray.length; i++) {
            perguruantinggiList.add(MyDataArrays.perguruantinggiArray[i]);
        }

        for (int i = 0; i < MyDataArrays.smaArray.length; i++) {
            smaList.add(MyDataArrays.smaArray[i]);
        }

        for (int i = 0; i < MyDataArrays.smpArray.length; i++) {
            smpList.add(MyDataArrays.smpArray[i]);
        }

        for (int i = 0; i < MyDataArrays.sdArray.length; i++){
            sdList.add(MyDataArrays.sdArray[i]);
        }



        pendidikanHashMap.put("Perguruan Tinggi", perguruantinggiList);
        pendidikanHashMap.put("SMA/SMK/MAN", smaList);
        pendidikanHashMap.put("SMP/MTS", smpList);
        pendidikanHashMap.put("SD/MI/SLB", sdList);
        return pendidikanHashMap;
        //--------------------------------------------------------------------------


    }
    public static HashMap<String, List<String>> kesehatanDataHashMap() {
        HashMap<String, List<String>> kesehatanHashMap = new HashMap<String, List<String>>();
        List<String> rsPemerintahList = new ArrayList<String>();
        List<String> rsSwastaList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.rsPemerintahArray.length; i++) {
            rsPemerintahList.add(MyDataArrays.rsPemerintahArray[i]);
        }

        for (int i = 0; i < MyDataArrays.rsSwastaArray.length; i++) {
            rsSwastaList.add(MyDataArrays.rsSwastaArray[i]);
        }

        kesehatanHashMap.put("Rumah Sakit Pemerintah", rsPemerintahList);
        kesehatanHashMap.put("Rumah Sakit Swasta", rsSwastaList);
        return kesehatanHashMap;
    }


    public static HashMap<String, List<String>> hotelDataHashMap() {
        HashMap<String, List<String>> hotelHashMap = new HashMap<String, List<String>>();
        List<String> berbintangList = new ArrayList<String>();
        List<String> melatiList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.berbintangArray.length; i++) {
            berbintangList.add(MyDataArrays.berbintangArray[i]);
        }

        for (int i = 0; i < MyDataArrays.melatiArray.length; i++) {
            melatiList.add(MyDataArrays.melatiArray[i]);
        }



        hotelHashMap.put("Hotel Berbintang", berbintangList);
        hotelHashMap.put("Hotel Melati", melatiList);
        return hotelHashMap;
    }


    public static HashMap<String, List<String>> wisataDataHashMap() {
        HashMap<String, List<String>> wisataHashMap = new HashMap<String, List<String>>();
        List<String> tamanRekreasiList = new ArrayList<String>();
        List<String> wisataAlamList = new ArrayList<String>();
        List<String> wisataReligiList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.tamanRekreasiArray.length; i++) {
            tamanRekreasiList.add(MyDataArrays.tamanRekreasiArray[i]);
        }

        for (int i = 0; i < MyDataArrays.wisataAlamArray.length; i++) {
            wisataAlamList.add(MyDataArrays.wisataAlamArray[i]);
        }

        for (int i = 0; i < MyDataArrays.wisataReligiArray.length; i++) {
            wisataReligiList.add(MyDataArrays.wisataReligiArray[i]);
        }

        wisataHashMap.put("Taman Rekreasi", tamanRekreasiList);
        wisataHashMap.put("Wisata Alam", wisataAlamList);
        wisataHashMap.put("Wisata Religi", wisataReligiList);
        return wisataHashMap;
    }

    public static HashMap<String, List<String>> kulinerDataHashMap() {
        HashMap<String, List<String>> kulinerHashMap = new HashMap<String, List<String>>();
        List<String> kulinerList = new ArrayList<String>();

        for (int i = 0; i < MyDataArrays.kulinerArray.length; i++) {
            kulinerList.add(MyDataArrays.kulinerArray[i]);
        }



        kulinerHashMap.put("Wisata Kuliner", kulinerList);
        return kulinerHashMap;
    }

    public static HashMap<String, List<String>> perjalananDataHashMap() {
        HashMap<String, List<String>> perjalananHashMap = new HashMap<String, List<String>>();
        List<String> biroList = new ArrayList<String>();


        for (int i = 0; i < MyDataArrays.biroArray.length; i++) {
            biroList.add(MyDataArrays.biroArray[i]);
        }


        perjalananHashMap.put("Biro Perjalanan", biroList);
        return perjalananHashMap;
    }


}
