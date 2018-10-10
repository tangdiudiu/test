/**
 * Created by wc.jia on 2018/8/2.
 */


import org.junit.Before;
import org.junit.Test;
import org.redisson.Config;
import org.redisson.Redisson;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;


public class RedisTest {
    private Jedis jedis;

    @Autowired
    private RedisJava redisJava;

    public static void main(String[] args) {

    }

    /**
     * 连接redis服务
     */
    @Test
    public void connectionRedis() {
        //连接本地的Redis服务
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //如果有密码，则需要下面权限认证
        jedis.auth("redis");
        System.out.println("连接成功！");

        //查看服务是否运行
        System.out.println("服务正在运行：" + jedis.ping());
    }

//    @Before
//    public void getJedis() {
//        jedis = RedisUtils.getJedis();
//    }

    /**
     * 测试Redis存储String
     */
    @Test
    public void testString() {

        jedis.set("name", "爱华");

        System.out.println(jedis.get("name"));

        jedis.append("name", "，嘉豪");

        System.out.print(jedis.get("name"));
        //存储多个键值
        jedis.mset("name", "爱华", "age", "20");

        jedis.incr("age");

        System.out.println(jedis.get("name") + "," + jedis.get("age"));

        jedis.del("name", "age");

        System.out.println(jedis.get("name") + "," + jedis.get("age"));
    }

    /**
     * 测试redis存储List
     */
    @Test
    public void testList() {
        jedis.del("lists");
        //在头部添加
        jedis.lpush("lists", "o1", "o2");
        //第一个是key，第二个参数是起始位置，第三个是结束位置,-1表示全部输出
        System.out.println(jedis.lrange("lists", 0, -1));

        jedis.del("lists");
        //在尾部后添加
        jedis.rpush("lists", "o1", "o2");
        System.out.println(jedis.lrange("lists", 0, -1));
    }

    /**
     * 测试Redis存储Set
     */
    @Test
    public void testSet_() {

        jedis.sadd("users", "爱华");
        jedis.sadd("users", "嘉豪");
        //全部输出set集合中的元素
        System.out.println(jedis.smembers("users"));
        //判断是否是set集合中的元素
        System.out.println(jedis.sismember("users", "嘉豪"));
        //获取set集合中元素的总数目
        System.out.println(jedis.scard("users"));
        //随机获取set集合中的元素
        System.out.println(jedis.srandmember("users"));

        jedis.del("users");
    }

    /**
     * 测试Redis存储Map（Hash）
     */
    @Test
    public void testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "嘉豪");
        map.put("name2", "爱华");
        jedis.hmset("person", map);
        Iterator<String> iterator = jedis.hkeys("person").iterator();
        while (iterator.hasNext()) {
            System.out.println(jedis.hmget("person", iterator.next()));
//            Config config = new Config();
//            config.setConnectionPoolSize(10);
//            config.addAddress("127.0.0.1:6379");
//
//            System.out.println("reids连接成功...");
//            Redisson redisson = Redisson.create(config);
            Redisson redisson = redisJava.getRedisson();
            System.out.println(redisson);
             map = redisson.getMap("FirstMap");
            ConcurrentMap resultMap = redisson.getMap("FirstMap");
            System.out.println(resultMap.size());
            //jedis.del("person");
        }
    }


    /**
     * 测试List排序
     */
    @Test
    public void testListSort() {

        this.jedis.del("array");
        this.jedis.rpush("array", "88");
        this.jedis.rpush("array", "56");
        this.jedis.rpush("array", "1");
        this.jedis.rpush("array", "2");
        System.out.println(this.jedis.lrange("array", 0, -1));
        this.jedis.sort("array");
        System.out.println(this.jedis.lrange("array", 0, -1));

        this.jedis.del("array");

    }

}