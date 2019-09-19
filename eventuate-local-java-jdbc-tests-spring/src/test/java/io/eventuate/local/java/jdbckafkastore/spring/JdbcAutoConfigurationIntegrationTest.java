package io.eventuate.local.java.jdbckafkastore.spring;

import io.eventuate.javaclient.tests.common.spring.AbstractSpringAccountIntegrationReactiveTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JdbcAutoConfigurationIntegrationTestConfiguration.class)
public class JdbcAutoConfigurationIntegrationTest extends AbstractSpringAccountIntegrationReactiveTest {


}
