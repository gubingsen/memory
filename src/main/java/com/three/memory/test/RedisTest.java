package com.three.memory.test;

import com.three.memory.redis.JedisUtil;

public class RedisTest {
    public static void main(String[] args) {
        JedisUtil jedisUtil = new JedisUtil("192.168.253.130",6379, "123");
        jedisUtil.addHash("token", "1", "a");
        String s = jedisUtil.getHash("token", "1");
        System.out.println(s);
    }
}
