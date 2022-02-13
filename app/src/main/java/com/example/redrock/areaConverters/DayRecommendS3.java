package com.example.redrock.areaConverters;

import androidx.room.TypeConverter;

import com.example.redrock.bean.DayRecommendSongsBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class DayRecommendS3 {
    @TypeConverter
    public static List<DayRecommendSongsBean.DataDTO.RecommendReasonsDTO> revert(String data) {

        Gson gson=new Gson();
        try {
            return gson.fromJson(data,new TypeToken<List<DayRecommendSongsBean.DataDTO.RecommendReasonsDTO>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static String converter(List<DayRecommendSongsBean.DataDTO.RecommendReasonsDTO> data) {

        return new Gson().toJson(data);
    }
}
