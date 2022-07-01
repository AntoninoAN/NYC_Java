package com.example.tetchinyc.di;

import com.example.tetchinyc.model.Repository;
import com.example.tetchinyc.model.RepositoryImpl;
import com.example.tetchinyc.model.network.Network;
import com.example.tetchinyc.viewmodel.provider.SchoolViewModelProvider;

public class Injector {
    private static final Injector ourInstance = new Injector();

    public static Injector getInstance() {
        return ourInstance;
    }

    private Injector() {
    }

    public SchoolViewModelProvider provideProvider(){
        return new SchoolViewModelProvider(provideRepository());
    }

    private Repository provideRepository(){
        return new RepositoryImpl(Network.getInstance());
    }
}
