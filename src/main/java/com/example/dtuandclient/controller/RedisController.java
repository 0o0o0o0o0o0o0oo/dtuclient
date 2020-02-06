package com.example.dtuandclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@RestController
@RequestMapping("/redis")
//@Api(tags = "redis 测试API")
public class RedisController {

    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    JedisPool jedisConfig;
    @GetMapping("set/{key}/{value}")
//    @ApiOperation(value="设置缓存")
    public String set(@PathVariable("key")String key, @PathVariable("value") String value) {
       Jedis jedis = new Jedis();
       jedis.expire(key,20);
        //注意这里的 key不能为null spring 内部有检验
//        redisTemplate.opsForValue().set(key, value);
        return key + "," + value;
    }

    @GetMapping("get/{key}")
//    @ApiOperation(value="根据key获取缓存")
    public String get(@PathVariable("key") String key) {
//        jedisConfig.getResource.expire(key,20);
        jedisConfig.getResource().expire(key,20);
        return "key=" + key + ",value=" + jedisConfig.getResource().get(key);
    }
}