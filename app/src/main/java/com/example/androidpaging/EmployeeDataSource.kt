package com.example.androidpaging

import androidx.paging.ItemKeyedDataSource
import com.example.androidpaging.retrofit.ApiInterface
import com.example.androidpaging.retrofit.RetroFitApiClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import android.provider.Contacts.Photos
import android.R.attr.data
import com.example.androidpaging.model.ModelEmployee
import io.reactivex.Single
import android.R.attr.data
import android.widget.Toast
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import okhttp3.ResponseBody


class EmployeeDataSource: ItemKeyedDataSource<Any, Any>() {
    override fun loadInitial(params: LoadInitialParams<Any>, callback: LoadInitialCallback<Any>) {
        val apiInterface : ApiInterface = RetroFitApiClient.instance
        val question = apiInterface.getQuestion();
        question.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :SingleObserver<List<ModelEmployee>> {

                override fun onSubscribe(d: Disposable) {

                }

                override fun onSuccess(responseBody: List<ModelEmployee>) {
                    callback.onResult(responseBody,0,10);
                }

                override fun onError(e: Throwable) {

                }
                
            })


    }

    override fun loadAfter(params: LoadParams<Any>, callback: LoadCallback<Any>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBefore(params: LoadParams<Any>, callback: LoadCallback<Any>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKey(item: Any): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}