package maven_ssm_t;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zsm.dao.UserDAO;
import com.zsm.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestInster {
	@Autowired
	private UserDAO userDao;
	 @Test
	public void insertUser()throws Exception{
	    Integer id = 1;
	    User user = userDao.selectByPrimaryKey(1);
		System.out.print(JSON.toJSONString(user));
	}
}
