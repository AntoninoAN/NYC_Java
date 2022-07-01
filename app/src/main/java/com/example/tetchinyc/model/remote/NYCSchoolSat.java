package com.example.tetchinyc.model.remote;

import androidx.annotation.NonNull;

import java.util.Objects;

public class NYCSchoolSat {
   private String dbn;
   private String school_name;
   private String num_of_sat_test_takers;
   private String sat_critical_reading_avg_score;
   private String sat_math_avg_score;
   private String sat_writing_avg_score;

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public String getNum_of_sat_test_takers() {
        return num_of_sat_test_takers;
    }

    public void setNum_of_sat_test_takers(String num_of_sat_test_takers) {
        this.num_of_sat_test_takers = num_of_sat_test_takers;
    }

    public String getSat_critical_reading_avg_score() {
        return sat_critical_reading_avg_score;
    }

    public void setSat_critical_reading_avg_score(String sat_critical_reading_avg_score) {
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
    }

    public String getSat_math_avg_score() {
        return sat_math_avg_score;
    }

    public void setSat_math_avg_score(String sat_math_avg_score) {
        this.sat_math_avg_score = sat_math_avg_score;
    }

    public String getSat_writing_avg_score() {
        return sat_writing_avg_score;
    }

    public void setSat_writing_avg_score(String sat_writing_avg_score) {
        this.sat_writing_avg_score = sat_writing_avg_score;
    }

    @Override
    public String toString() {
        return "NYCSchoolSat{" +
                "dbn='" + dbn + '\'' +
                ", school_name='" + school_name + '\'' +
                ", num_of_sat_test_takers='" + num_of_sat_test_takers + '\'' +
                ", sat_critical_reading_avg_score='" + sat_critical_reading_avg_score + '\'' +
                ", sat_math_avg_score='" + sat_math_avg_score + '\'' +
                ", sat_writing_avg_score='" + sat_writing_avg_score + '\'' +
                '}';
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NYCSchoolSat)) return false;
        NYCSchoolSat that = (NYCSchoolSat) o;
        return Objects.equals(getDbn(), that.getDbn()) && Objects.equals(getSchool_name(), that.getSchool_name()) && Objects.equals(getNum_of_sat_test_takers(), that.getNum_of_sat_test_takers()) && Objects.equals(getSat_critical_reading_avg_score(), that.getSat_critical_reading_avg_score()) && Objects.equals(getSat_math_avg_score(), that.getSat_math_avg_score()) && Objects.equals(getSat_writing_avg_score(), that.getSat_writing_avg_score());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDbn(), getSchool_name(), getNum_of_sat_test_takers(), getSat_critical_reading_avg_score(), getSat_math_avg_score(), getSat_writing_avg_score());
    }
}
