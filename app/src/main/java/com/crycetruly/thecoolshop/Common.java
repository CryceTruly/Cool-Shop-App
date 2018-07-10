package com.crycetruly.thecoolshop;

import com.crycetruly.thecoolshop.retro.CoolShopAPI;
import com.crycetruly.thecoolshop.retro.RetrofitClient;

/**
 * Created by Elia on 10/07/2018.
 */

public class Common {
    public static final String baseUrl="http://www.10.0.2.2:4200/coolshop";

    public CoolShopAPI getClient(){
        return RetrofitClient.getRetrofit(baseUrl).create(CoolShopAPI.class);
    }
}
