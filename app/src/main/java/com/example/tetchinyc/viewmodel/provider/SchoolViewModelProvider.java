package com.example.tetchinyc.viewmodel.provider;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.tetchinyc.model.Repository;
import com.example.tetchinyc.viewmodel.SchoolViewModel;

public class SchoolViewModelProvider implements ViewModelProvider.Factory {

   private Repository repository;

   public SchoolViewModelProvider(Repository repository){
      this.repository = repository;
   }

   @NonNull
   @Override
   public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
      return (T) new SchoolViewModel(repository);
   }
}
