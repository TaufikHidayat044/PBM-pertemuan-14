package id.taufikhidayat.myportofolio.retrofit

import id.taufikhidayat.myportofolio.MainModel
import retrofit2.http.GET

interface ApiEndpoint {

    //Untuk mengkoneksikan dengan API yang telah dibuat
    @GET("d60493a9-b805-441c-b69b-686e61e460f9")
    fun getData(): retrofit2.Call<MainModel>
}