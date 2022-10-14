package com.chuan.redis.jedis.purejava;

import redis.clients.jedis.Jedis;

/**
 * @author xucy-e
 */
public class JedisDemo {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 6379;
        Jedis jedis = new Jedis(host, port);
        String pingResp = jedis.ping();
        System.out.println(pingResp);
    }
}
