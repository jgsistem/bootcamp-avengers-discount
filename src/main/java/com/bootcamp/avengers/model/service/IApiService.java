package com.bootcamp.avengers.model.service;

import com.bootcamp.avengers.model.entity.Discount;
import io.reactivex.Completable;
import io.reactivex.Observable;

import java.util.List;

public interface IApiService {

    Observable<List<Discount>> getAllDiscounts();

    Completable saveDiscount(Discount discount);
}
