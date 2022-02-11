package com.example.redrock.AreaConverters;

import androidx.room.TypeConverter;

import com.example.redrock.bean.AccountInformationBean;
import com.example.redrock.bean.PlaylistSongsBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PlaylistSB4 {
    @TypeConverter
    public static PlaylistSongsBean.PlaylistDTO revert(String data){
        Gson gson=new Gson();
        try {
            return gson.fromJson(data,new TypeToken<PlaylistSongsBean.PlaylistDTO>(){}.getType());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static String converter(PlaylistSongsBean.PlaylistDTO data){

        return new Gson().toJson(data);
    }
}