package com.gmh.connect;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by gmh on 2017/6/7 0007.
 */
public class RedisTest {

    @Test
    public void demo1() {
        Jedis jedis = new Jedis("120.77.182.208", 6379);
        jedis.auth("bb123456");

        jedis.set("name", "aa");
        String value = jedis.get("name");
        System.out.println(value);
        jedis.close();
    }

}
