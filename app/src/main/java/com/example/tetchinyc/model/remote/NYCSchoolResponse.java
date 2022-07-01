package com.example.tetchinyc.model.remote;

public class NYCSchoolResponse {
   private String dbn;
   private String school_name;

   public void setDbn(String dbn) {
      this.dbn = dbn;
   }

   public void setSchool_name(String school_name) {
      this.school_name = school_name;
   }

   public String getDbn() {
      return dbn;
   }

   public String getSchool_name() {
      return school_name;
   }
}
