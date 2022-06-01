package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class FluxAndMonoGeneratorService {

    public Flux<String> namesFlux(){

        List<String> list = new ArrayList<>();
        list.add("alex");
        list.add("ben");
        list.add("chloe");

        return Flux.fromIterable(list);
    }

    public static void main(String[] args){

        FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

        fluxAndMonoGeneratorService.namesFlux()
                .subscribe(name -> System.out.println(name));



    }
}
