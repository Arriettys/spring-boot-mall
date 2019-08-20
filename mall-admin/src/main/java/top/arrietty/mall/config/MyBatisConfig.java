package top.arrietty.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"top.arrietty.mall.mapper","top.arrietty.mall.dao"})
public class MyBatisConfig
{
	
}
