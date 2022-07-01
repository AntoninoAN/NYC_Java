package com.example.tetchinyc.model.state;

import com.example.tetchinyc.model.remote.NYCSchoolResponse;
import com.example.tetchinyc.model.state.UIState;

import java.util.List;

public class RESPONSESCHOOLLISt extends UIState {
    private List<NYCSchoolResponse> data;

    public List<NYCSchoolResponse> getData() {
        return data;
    }

    public void setData(List<NYCSchoolResponse> data) {
        this.data = data;
    }
}
