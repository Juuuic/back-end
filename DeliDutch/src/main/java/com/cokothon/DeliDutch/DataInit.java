package com.cokothon.DeliDutch;

import com.cokothon.DeliDutch.entity.Food;
import com.cokothon.DeliDutch.entity.Restaurant;
import com.cokothon.DeliDutch.service.FoodService;
import com.cokothon.DeliDutch.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final FoodService foodService;
    private final RestaurantService restaurantService;

    @PostConstruct
    public void init() {

        Restaurant kyochon = restaurantService.save(Restaurant.builder()
                .category("치킨")
                .build());

        Food ch1 = foodService.save(Food.builder().name("허니콤보").price(17000).restaurant(kyochon).build());
        Food ch2 = foodService.save(Food.builder().name("레드콤보").price(16000).restaurant(kyochon).build());
        Food ch3 = foodService.save(Food.builder().name("오리지널콤보").price(15000).restaurant(kyochon).build());


    }
}