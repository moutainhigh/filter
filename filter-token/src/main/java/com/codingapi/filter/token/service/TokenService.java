package com.codingapi.filter.token.service;

/**
 * create by lorne on 2017/12/28
 */
public interface TokenService {

    boolean putToken(String key, String value, int seconds);

    String getToken(String key);

}
