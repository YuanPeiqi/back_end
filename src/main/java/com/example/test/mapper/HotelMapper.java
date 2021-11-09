package com.example.test.mapper;

import com.example.test.bean.HotelBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelMapper {
    List<HotelBean> get_hotel_list();
    void delete_hotel_record(int id);
    void add_hotel_record(String date, String name, String city, String district, String price, String type, String time, String comment);
    void modify_hotel_record(int id, String date, String name, String city, String district, String price, String type, String time, String comment);
    List<HotelBean> search_hotel_record(String type, String date);
}
