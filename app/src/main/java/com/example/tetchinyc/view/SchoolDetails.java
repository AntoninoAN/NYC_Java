package com.example.tetchinyc.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tetchinyc.R;
import com.example.tetchinyc.di.Injector;
import com.example.tetchinyc.model.remote.NYCSchoolSat;
import com.example.tetchinyc.model.state.ERROR;
import com.example.tetchinyc.model.state.RESPONSESAT;
import com.example.tetchinyc.model.state.RESPONSESCHOOLLISt;
import com.example.tetchinyc.model.state.UIState;
import com.example.tetchinyc.viewmodel.SchoolViewModel;
import com.example.tetchinyc.viewmodel.provider.SchoolViewModelProvider;

public class SchoolDetails extends Fragment {

   private static final String KEY_DBN = "KEY_DBN_SCHOOL_DETAILS";
   private SchoolViewModel viewModel;
   private TextView schoolSatDBN;
   private TextView schoolSatName;
   private TextView schoolSatTakers;
   private TextView schoolSatMath;
   private TextView schoolSatWriting;
   private TextView schoolSatReading;
   private SchoolViewModelProvider schoolViewModelProvider= Injector.getInstance().provideProvider();

   @Nullable
   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      super.onCreateView(inflater, container, savedInstanceState);
      View view = inflater.inflate(R.layout.school_details_fragment_layout, container, false);
      initViews(view);
      initObservables();

      if (getArguments().getString(KEY_DBN) != null)
         viewModel.getSatDetails(getArguments().getString(KEY_DBN));

      return view;
   }

   private void initObservables() {
      viewModel = new ViewModelProvider(this, schoolViewModelProvider).get(SchoolViewModel.class);
      viewModel.schoolState().observe(getViewLifecycleOwner(), this::updateUI);
   }

   private void updateUI(UIState uiState) {
      if (uiState instanceof RESPONSESAT)
         updateView(((RESPONSESAT) uiState).getData());
      else if (uiState instanceof ERROR)
         showError(((ERROR) uiState).getErrorMessage());
   }

   private void showError(String errorMessage) {

   }

   private void updateView(NYCSchoolSat data) {
      schoolSatDBN.setText(data.getDbn());
      schoolSatTakers.setText(data.getNum_of_sat_test_takers());
      schoolSatReading.setText(data.getSat_critical_reading_avg_score());
      schoolSatWriting.setText(data.getSat_writing_avg_score());
      schoolSatMath.setText(data.getSat_math_avg_score());
      schoolSatName.setText(data.getSchool_name());
   }

   private void initViews(View view) {
      schoolSatDBN = view.findViewById(R.id.school_details_dbn);
      schoolSatName = view.findViewById(R.id.school_details_name);
      schoolSatTakers = view.findViewById(R.id.school_details_sat_takers);
      schoolSatMath = view.findViewById(R.id.school_details_sat_math);
      schoolSatWriting = view.findViewById(R.id.school_details_sat_writing);
      schoolSatReading = view.findViewById(R.id.school_details_sat_reading);
   }

   public static Fragment getInstance(String dbn) {
      SchoolDetails fragment = new SchoolDetails();
      Bundle bundle = new Bundle();
      bundle.putString(KEY_DBN, dbn);
      fragment.setArguments(bundle);
      return fragment;
   }
}
