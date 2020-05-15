package com.enRoute.enRoute.tools;

import com.enRoute.enRoute.model.Deliver;
import com.enRoute.enRoute.model.Destination;
import com.enRoute.enRoute.model.Menu;
import com.enRoute.enRoute.model.StoreHouse;

import com.enRoute.enRoute.repositories.*;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Bąk, Paweł Norwa
 * A basic database with built-in information that you can base on.
 * The whole is made in H2 based on SQL.
 *
 * @param storeHouse_id
 * @param city
 * @param name
 * @param deliver_id
 *
 * @param deliverRepository
 * @param destinationRepository
 * @param menuRepository
 * @param storeHouseRepository
 *
 * @param contextRefreshedEvent
 *
 * @param parcel
 * @param storeHouse
 * @param deliver
 * @param destination
 */


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

        storeHouseRepository.save(SH1);
        deliverRepository.save(DL1);
        destinationRepository.save(DS1);


        StoreHouse SH2 = new StoreHouse(2L,"Poznań","Morele");
        Deliver DL2 = new Deliver(2L, "Waiting");
        Destination DS2 = new Destination(2L, "Kielce", "Parcel locker");


        storeHouseRepository.save(SH2);
        deliverRepository.save(DL2);
        destinationRepository.save(DS2);


        StoreHouse SH3 = new StoreHouse(3L,"Kielce","Media Expert");
        Deliver DL3 = new Deliver(3L, "Poczta");
        Destination DS3 = new Destination(3L, "Poznań", "Parcel locker");


        storeHouseRepository.save(SH3);
        deliverRepository.save(DL3);
        destinationRepository.save(DS3);



        StoreHouse SH4 = new StoreHouse(4L,"Wrocław","X-com");
        Deliver DL4 = new Deliver(4L, "DPD");
        Destination DS4 = new Destination(4L, "Warszawa", "House");


        storeHouseRepository.save(SH4);
        deliverRepository.save(DL4);
        destinationRepository.save(DS4);


        StoreHouse SH5 = new StoreHouse(5L,"Wodzisław","Avans");
        Deliver DL5 = new Deliver(5L, "TNT");
        Destination DS5 = new Destination(5L, "Wodzisław", "Parcel locker");


        storeHouseRepository.save(SH5);
        deliverRepository.save(DL5);
        destinationRepository.save(DS5);



        StoreHouse SH6 = new StoreHouse(6L,"Olkusz","AGD RTV");
        Deliver DL6 = new Deliver(6L, "UPS");
        Destination DS6 = new Destination(6L, "Katowice", "House");


        storeHouseRepository.save(SH6);
        deliverRepository.save(DL6);
        destinationRepository.save(DS6);


        StoreHouse SH7 = new StoreHouse(7L,"Zakopane","Neonet");
        Deliver DL7 = new Deliver(7L, "InPost");
        Destination DS7 = new Destination(7L, "Łódz", "House");


        storeHouseRepository.save(SH7);
        deliverRepository.save(DL7);
        destinationRepository.save(DS7);


        StoreHouse SH8 = new StoreHouse(8L,"Rybnik","Komputornik");
        Deliver DL8 = new Deliver(8L, "DHL");
        Destination DS8 = new Destination(8L, "Gniezno", "Parcel locker");


        storeHouseRepository.save(SH8);
        deliverRepository.save(DL8);
        destinationRepository.save(DS8);


        StoreHouse SH9 = new StoreHouse(9L,"Kalisz","Mycenter");
        Deliver DL9 = new Deliver(9L, "FeedEx");
        Destination DS9 = new Destination(9L, "Mielno", "Parcel locker");


        storeHouseRepository.save(SH9);
        deliverRepository.save(DL9);
        destinationRepository.save(DS9);


        StoreHouse SH10 = new StoreHouse(10L,"Bydgoszcz","Sfera");
        Deliver DL10 = new Deliver(10L, "GLS");
        Destination DS10 = new Destination(10L, "Jastrzębie Zdrój", "House");


        storeHouseRepository.save(SH10);
        deliverRepository.save(DL10);
        destinationRepository.save(DS10);


        Menu ME1 = new Menu(1L,SH5,DL2,DS1);
        menuRepository.save(ME1);
        Menu ME2 = new Menu(2L,SH1,DL1,DS6);
        menuRepository.save(ME2);
        Menu ME3 = new Menu(3L,SH1,DL8,DS1);
        menuRepository.save(ME3);
        Menu ME4 = new Menu(4L,SH6,DL2,DS1);
        menuRepository.save(ME4);
        Menu ME5 = new Menu(5L,SH1,DL6,DS1);
        menuRepository.save(ME5);
        Menu ME6 = new Menu(6L,SH1,DL7,DS1);
        menuRepository.save(ME6);
        Menu ME7 = new Menu(7L,SH3,DL2,DS1);
        menuRepository.save(ME7);
        Menu ME8 = new Menu(8L,SH1,DL1,DS2);
        menuRepository.save(ME8);
        Menu ME9 = new Menu(9L,SH1,DL1,DS8);
        menuRepository.save(ME9);
        Menu ME10 = new Menu(10L,SH2,DL2,DS1);
        menuRepository.save(ME10);



    }
}