import com.lagou.RunShardingJdbcExampleApplication;
import com.lagou.entity.Order;
import com.lagou.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunShardingJdbcExampleApplication.class)
public class ShardingDatabaseTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testAdd(){

        for (int i = 1; i < 20; i++) {
            int compId = (int) (Math.random() * 100);
            Order order = new Order();
            order.setId(i);
            order.setUserId(compId);
            order.setCompanyId(compId);
            order.setCreateTime(LocalDateTime.now());
            order.setDel(false);
            order.setPositionId(29);
            order.setPublishUserId(839);
            order.setResumeType(9);
            order.setStatus("XYT");
            order.setUpdateTime(LocalDateTime.now());
            orderRepository.save(order);
        }
    }

    @Test
    public void testRead(){
        List<Order> all = orderRepository.findAll();
        all.forEach(System.out::println);

        List<Order> all2 = orderRepository.findAll();
        all2.forEach(System.out::println);

    }
}
