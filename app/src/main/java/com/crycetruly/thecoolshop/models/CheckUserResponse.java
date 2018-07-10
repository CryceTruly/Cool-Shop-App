package com.crycetruly.thecoolshop.models;

/**
 * Created by Elia on 10/07/2018.
 */

public class CheckUserResponse {
    public boolean exists;
    public String err_msg;

    public CheckUserResponse() {
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
