package com.kaizen.starter.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kaizen.starter.network.DataState
import com.kaizen.starter.network.model.DummyResponse
import com.kaizen.starter.prefsstore.PrefsStore
import com.kaizen.starter.repository.user.MainRepository
import com.kaizen.starter.repository.user.MainRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val prefsStore: PrefsStore,
    private val mainRepo: MainRepository
) : ViewModel() {


    val dummyLiveData: MutableLiveData<DataState<DummyResponse>> = MutableLiveData()

    fun retrieveUserData() {
        viewModelScope.launch {
            mainRepo.signInUser("email", "pass")
                .onStart { emit(DataState.Loading) }
                .collect()
        }
    }

}