package com.example.test.controller;


import com.example.test.bean.HotelBean;
import com.example.test.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HotelListController {
    @Autowired
    HotelService hotelService;

    @GetMapping("/get_hotel_list")
    public List<HotelBean> get_hotel_list(){
        return hotelService.get_hotel_list();
    }

    @GetMapping("/delete_hotel")
    public void delete_hotel_record(@RequestParam(value="id") int id){
        hotelService.delete_hotel_record(id);
    }

    @GetMapping("/search_hotel")
    public List<HotelBean> search_hotel_record(@RequestParam(value="type") String type,
                                    @RequestParam(value="date") String date){
        return hotelService.search_hotel_record(type,date);
    }

    @GetMapping("/add_hotel")
    public void add_hotel_record(@RequestParam(value="date") String date,
                                 @RequestParam(value="name") String name,
                                 @RequestParam(value="city") String city,
                                 @RequestParam(value="district") String district,
                                 @RequestParam(value="price") String price,
                                 @RequestParam(value="type") String type,
                                 @RequestParam(value="time") String time,
                                 @RequestParam(value="comment", required = false, defaultValue = "") String comment){
        hotelService.add_hotel_record(date, name, city, district, price, type, time, comment);
    }

    @GetMapping("/modify_hotel")
    public void modify_hotel_record(@RequestParam(value="date") String date,
                                    @RequestParam(value="id") int id,
                                    @RequestParam(value="name") String name,
                                    @RequestParam(value="city") String city,
                                    @RequestParam(value="district") String district,
                                    @RequestParam(value="price") String price,
                                    @RequestParam(value="type") String type,
                                    @RequestParam(value="time") String time,
                                    @RequestParam(value="comment", required = false, defaultValue = "") String comment){
        hotelService.modify_hotel_record(id, date, name, city, district, price, type, time, comment);
    }
}
