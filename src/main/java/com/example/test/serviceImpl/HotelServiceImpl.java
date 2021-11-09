package com.example.test.serviceImpl;

import com.example.test.bean.HotelBean;
import com.example.test.mapper.HotelMapper;
import com.example.test.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<HotelBean> get_hotel_list() {
        return hotelMapper.get_hotel_list();
    }

    @Override
    public List<HotelBean> search_hotel_record(String type, String date) {
        return hotelMapper.search_hotel_record(type,date);
    }

    @Override
    public void delete_hotel_record(int id) {
        hotelMapper.delete_hotel_record(id);
    }
    @Override
    public void add_hotel_record(String date, String name, String city, String district, String price, String type, String time, String comment) {
        hotelMapper.add_hotel_record(date, name, city, district, price, type, time, comment);
    }

    @Override
    public void modify_hotel_record(int id, String date, String name, String city, String district, String price, String type, String time, String comment) {
        hotelMapper.modify_hotel_record(id, date, name, city, district, price, type, time, comment);
    }
}
