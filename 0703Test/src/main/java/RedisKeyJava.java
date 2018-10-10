import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Created by wc.jia on 2018/8/2.
 */
public class RedisKeyJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");

        jedis.set("asd","123");
        jedis.set("wqe","456");

        // 获取数据并输出
        System.out.println(jedis.get("oker"));
    }
}