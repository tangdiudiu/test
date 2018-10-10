import org.junit.Test;
import redis.clients.jedis.Jedis;


import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.redisson.Config;
import org.redisson.Redisson;
import redis.clients.util.RedisOutputStream;

/**
 * Created by wc.jia on 2018/8/2.
 */
public class RedisJava {
    private static Redisson redisson;
    public static void main(String[] args) {
//        Config config = new Config();
//        config.setConnectionPoolSize(10);
//        config.addAddress("127.0.0.1:6379");
//        redisson = Redisson.create(config);
//        System.out.println("reids连接成功...");



//        // 2.测试concurrentMap,put方法的时候就会同步到redis中
//        ConcurrentMap<String, Object> map = redisson.getMap("FirstMap");
//        map.put("gpl", "男");
//        map.put("cyl", "女");
//
//        ConcurrentMap resultMap = redisson.getMap("FirstMap");
//        System.out.println("resultMap==" + resultMap.keySet());
//
//        // 2.测试Set集合
//        Set mySet = redisson.getSet("MySet");
//        mySet.add("gpl");
//        mySet.add("cyl");
//
//        Set resultSet = redisson.getSet("MySet");
//        System.out.println("resultSet===" + resultSet.size());
//
//        //3.测试Queue队列
//        Queue myQueue = redisson.getQueue("FirstQueue");
//        myQueue.add("gpl");
//        myQueue.add("cyl");
//        myQueue.peek();
//        myQueue.poll();
//        Queue resultQueue=redisson.getQueue("FirstQueue");
//        System.out.println("resultQueue==="+resultQueue);

        // 关闭连接
       // redisson.shutdown();

    }
   public  Redisson getRedisson(){
       Config config = new Config();
       config.setConnectionPoolSize(10);
       config.addAddress("127.0.0.1:6379");

       System.out.println("reids连接成功...");
//       System.out.println(Redisson.create(config));
       Redisson redisson = Redisson.create(config);
       System.out.println(redisson);
       return redisson;
    }
}