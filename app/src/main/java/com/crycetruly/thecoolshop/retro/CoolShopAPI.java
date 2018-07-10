package com.crycetruly.thecoolshop.retro;

import com.crycetruly.thecoolshop.models.CheckUserResponse;
import com.crycetruly.thecoolshop.models.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Elia on 10/07/2018.
 */

public interface CoolShopAPI {

    @FormUrlEncoded

    @POST("checkuser.php")
    Call<CheckUserResponse> checkUserExists(@Field("phone") String phone);

    @POST("register.php")
    Call<User> registerUser(@Field("phone") String phone
    ,@Field("name") String name,
                            @Field("bd") String bd,
                            @Field("address") String address);



}
