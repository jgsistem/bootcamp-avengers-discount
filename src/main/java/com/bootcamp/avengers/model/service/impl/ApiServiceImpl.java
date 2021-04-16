package com.bootcamp.avengers.model.service.impl;

import com.bootcamp.avengers.model.entity.Discount;
import com.bootcamp.avengers.model.repository.DiscountRepository;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements IApiService {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public Observable<List<Discount>> getAllDiscounts() {
        return Observable.fromArray(discountRepository.findAll());
    }

    @Override
    public Completable saveDiscount(Discount discount) {
        return Completable.create(subscriber -> {
            discountRepository.save(discount);
            subscriber.onComplete();
        });
    }
}
