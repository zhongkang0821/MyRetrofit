package c.myretrofit;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RequestServes {
    @POST("mobileLogin/submit.html")
    Call<String> getString(@Query("loginname") String loginname,
                           @Query("nloginpwd") String nloginpwd);

}
