package com.example.tetchinyc.model.state;

import com.example.tetchinyc.model.remote.NYCSchoolSat;

import java.util.List;

public class RESPONSESAT extends UIState {
   private NYCSchoolSat data;

   public NYCSchoolSat getData() {
      return data;
   }

   public void setData(NYCSchoolSat data) {
      this.data = data;
   }
}
