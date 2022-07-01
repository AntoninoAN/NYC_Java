package com.example.tetchinyc.model;

import com.example.tetchinyc.model.state.UIState;

import io.reactivex.rxjava3.core.Single;

public interface Repository {
    Single<UIState> getSchoolList();
    Single<UIState> getSchoolDetails(String dbn);
}
