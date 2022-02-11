package com.example.redrock.AreaConverters;

import androidx.room.TypeConverter;

import com.example.redrock.bean.AccountInformationBean;
import com.example.redrock.bean.PlaylistSongsBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class PlaylistSB5 {
    @TypeConverter
    public static List<PlaylistSongsBean.PrivilegesDTO> revert(String data){
        Gson gson=new Gson();
        try {
            return gson.fromJson(data,new TypeToken<List<PlaylistSongsBean.PrivilegesDTO>>(){}.getType());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static String converter(List<PlaylistSongsBean.PrivilegesDTO> data){

        return new Gson().toJson(data);
    }
}