package com.example.test.service;

import com.example.test.bean.HotelBean;
import java.util.List;

public interface HotelService {
    List<HotelBean> get_hotel_list();
    void delete_hotel_record(int id);
    List<HotelBean> search_hotel_record(String type, String date);
    void add_hotel_record(String date, String name, String city, String district, String price, String type, String time, String comment);
    void modify_hotel_record(int id, String date, String name, String city, String district, String price, String type, String time, String comment);
}
