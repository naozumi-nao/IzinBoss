package com.example.myfinalproject_capstone.datastore

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val pref: SettingPreferences) : ViewModel() {
    fun getID(): LiveData<String> {
        return pref.getID().asLiveData()
    }

    fun getCompanyID(): LiveData<String> {
        return pref.getCompanyID().asLiveData()
    }

    fun saveUserSetting(id: String, email: String, password: String, codeCompany: String, position: String) {
        viewModelScope.launch {
            pref.saveUserSetting(id, email, password, codeCompany, position)
        }
    }
}