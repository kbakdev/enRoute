package com.enRoute.enRoute.tools;

import com.enRoute.enRoute.model.Deliver;
import com.enRoute.enRoute.model.Destination;
import com.enRoute.enRoute.model.Menu;
import com.enRoute.enRoute.model.StoreHouse;

import com.enRoute.enRoute.repositories.*;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(DeliverRepository deliverRepository, DestinationRepository destinationRepository, MenuRepository menuRepository, StoreHouseRepository storeHouseRepository) {

        this.deliverRepository = deliverRepository;
        this.destinationRepository = destinationRepository;
        this.menuRepository = menuRepository;
        this.storeHouseRepository = storeHouseRepository;
    }

    private DeliverRepository deliverRepository;
    private DestinationRepository destinationRepository;
    private MenuRepository menuRepository;
    private StoreHouseRepository storeHouseRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        StoreHouse SH1 = new StoreHouse(1L,"Sent","Sent");
        Deliver DL1 = new Deliver(1L, "Sent");
        Destination DS1 = new Destination(1L, "Waiting", "Waiting");
        Menu ME1 = new Menu(1L, 1L, 1L, 1L);

        storeHouseRepository.save(SH1);
        deliverRepository.save(DL1);
        destinationRepository.save(DS1);
        menuRepository.save(ME1);

    }
}