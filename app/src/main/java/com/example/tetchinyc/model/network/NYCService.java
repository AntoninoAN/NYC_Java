package com.example.tetchinyc.model.network;

import com.example.tetchinyc.model.network.utils.CONSTANTS;
import com.example.tetchinyc.model.remote.NYCSchoolResponse;
import com.example.tetchinyc.model.remote.NYCSchoolSat;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface NYCService {
    @GET(CONSTANTS.ENDPOINT_SCHOOL)
    Single<List<NYCSchoolResponse>> getSchoolList();

    @GET(CONSTANTS.ENDPOINT_SAT)
    Single<List<NYCSchoolSat>> getSatList();
}
