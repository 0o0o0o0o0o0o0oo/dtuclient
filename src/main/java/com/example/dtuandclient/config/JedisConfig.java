package com.example.dtuandclient.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig extends CachingConfigurerSupport {
    Logger logger = LoggerFactory.getLogger(RedisCacheConfiguration.class);

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.password}")
    private String password;

    @Bean
    public JedisPool redisPoolFactory() {
        logger.info("JedisPool注入成功！！");
        logger.info("redis地址：" + host + ":" + port);
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);

        return jedisPool;
    }
//    private Logger logger = LoggerFactory.getLogger(JedisConfig.class);
//
//    /**
//     * SpringSession  需要注意的就是redis需要2.8以上版本，然后开启事件通知，在redis配置文件里面加上
//     * notify-keyspace-events Ex
//     * Keyspace notifications功能默认是关闭的（默认地，Keyspace 时间通知功能是禁用的，因为它或多或少会使用一些CPU的资源）。
//     * 或是使用如下命令：
//     * redis-cli config set notify-keyspace-events Egx
//     * 如果你的Redis不是你自己维护的，比如你是使用阿里云的Redis数据库，你不能够更改它的配置，那么可以使用如下方法：在applicationContext.xml中配置
//     * <util:constant static-field="org.springframework.session.data.redis.config.ConfigureRedisAction.NO_OP"/>
//     *
//     * @return
//     */
//    @Bean
//    public JedisPool redisPoolFactory(@Value("${spring.redis.host}") String host,
//                                      @Value("${spring.redis.port}") int port,
//                                      @Value("${spring.redis.timeout}") int timeout,
//                                      @Value("${spring.redis.pool.max-active}") int maxActive,
//                                      @Value("${spring.redis.pool.max-idle}") int maxIdle,
//                                      @Value("${spring.redis.pool.min-idle}") int minIdle,
//                                      @Value("${spring.redis.pool.max-wait}") long maxWaitMillis) {
//        System.out.println("-----------------d-----host-----------" + host);
//        System.out.println("-----------------d------port----------" + port);
//        System.out.println("-----------------d-------timeout---------" + timeout);
//        System.out.println("-----------------d------maxActive----------" + maxActive);
//        System.out.println("-----------------d------maxIdle----------" + maxIdle);
//        System.out.println("-----------------d-------minIdle---------" + minIdle);
//        System.out.println("-----------------d-------maxWaitMillis---------" + maxWaitMillis);
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
//        jedisPoolConfig.setMaxTotal(maxActive);
//        jedisPoolConfig.setMinIdle(minIdle);
//        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, null);
//        logger.info("JedisPool注入成功！");
//        logger.info("redis地址：" + host + ":" + port);
//        return jedisPool;
//    }

}
