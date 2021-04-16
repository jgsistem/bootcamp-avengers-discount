package com.bootcamp.avengers.controllers;

import com.bootcamp.avengers.model.entity.Discount;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discount/v1")
public class ApiController {
    @Autowired
    private IApiService apiService;

    @GetMapping("/")
    public String index() {
        return "bootcamp-avengers-discount api rest";
    }

    @GetMapping("/all")
    public Observable<List<Discount>> getAllDiscounts() {
        return apiService.getAllDiscounts()
                .subscribeOn(Schedulers.io());
    }

    @PostMapping("/save")
    public Completable saveDiscount(@RequestBody Discount discount) {
        return apiService.saveDiscount(discount)
                .subscribeOn(Schedulers.io());
    }
}