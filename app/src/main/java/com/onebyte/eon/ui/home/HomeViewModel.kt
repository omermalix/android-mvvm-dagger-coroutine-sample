package com.onebyte.eon.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.onebyte.eon.services.repositories.Repository
import com.onebyte.eon.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeViewModel @Inject constructor() : BaseViewModel() {

  @Inject
  lateinit var repository: Repository

  private val getListResponse: MutableLiveData<Any> = MutableLiveData()
  val isLoading = MutableLiveData<Boolean>()

  fun getListResponse(): LiveData<Any> = getListResponse

  fun getList() {
    isLoading.postValue(true)
    viewModelScope.launch(Dispatchers.IO) {

      runCatching {
        repository.getList()

      }.onSuccess {
        isLoading.postValue(false)

        withContext(Dispatchers.Main) {
          if (it.isSuccessful)
            getListResponse.postValue(it.body())
          else {
            getListResponse.postValue(it.errorBody()!!.string())
            Log.e("ERROR_IMAGE_UPLOAD", it.errorBody()!!.string())
          }
        }
      }.onFailure {
        isLoading.postValue(false)
        getListResponse.postValue(it.message)
        Log.e("ERROR_IMAGE_UPLOAD", it.message!!)

      }
    }
  }
}