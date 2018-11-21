package com.andlp.smallgame.bean;

/**
 * 717219917@qq.com   2018/11/22-1:47 AM
 */

public class Bean_KV {

    private String msg;
    private Result result;
    private String retCode;
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
    public String getRetCode() {
        return retCode;
    }



    public class Result {

        private String k;
        private long updateTime;
        private String v;
        public void setK(String k) {
            this.k = k;
        }
        public String getK() {
            return k;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
        public long getUpdateTime() {
            return updateTime;
        }

        public void setV(String v) {
            this.v = v;
        }
        public String getV() {
            return v;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}