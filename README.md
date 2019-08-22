## 项目介绍

电商后台管理系统，基于SpringBoot+MyBatis+dubbo实现，其功能包括商品管理、订单管理、会员管理、促销管理、运营管理、内容管理、统计报表、财务管理、权限管理、设置等模块。

## 组织结构

```
mall
├── mall-common -- 工具类及通用代码
├── mall-mbg -- MyBatisGenerator生成的数据库操作代码
├── mall-admin -- 后台商城管理系统接口
├── mall-search -- 基于Elasticsearch的商品搜索系统
├── mall-portal -- 前台商城系统接口
└── mall-demo -- 框架搭建时的测试代码
```

## 技术栈

|         技术         |      说明      |                      官网                      |
| :------------------: | :------------: | :--------------------------------------------: |
|     Spring Boot      |  容器+MVC框架  |     https://spring.io/projects/spring-boot     |
|   Spring Security    | 认证和授权框架 |   https://spring.io/projects/spring-security   |
|       MyBatis        |    ORM框架     | http://www.mybatis.org/mybatis-3/zh/index.html |
|   MyBatisGenerator   | 数据层代码生成 |  http://www.mybatis.org/generator/index.html   |
|      PageHelper      |  文档生产工具  |   https://github.com/swagger-api/swagger-ui    |
| Hibernator-Validator |    验证框架    |        http://hibernate.org/validator/         |
|    Elasticsearch     |    搜索引擎    |    https://github.com/elastic/elasticsearch    |
|       RabbitMq       |    消息队列    |           https://www.rabbitmq.com/            |
|        Redis         |   分布式缓存   |               https://redis.io/                |
|       MongoDb        |  NoSql数据库   |            https://www.mongodb.com/            |
|        Druid         |  数据库连接池  |        https://github.com/alibaba/druid        |
|         OSS          |    对象存储    | https://github.com/aliyun/aliyun-oss-java-sdk  |

### 架构图

![](https://s2.ax1x.com/2019/08/22/m0g4kq.png)

### 数据库

#### 数据库表前缀说明

+ cms_*：内容管理模块相关表
+ oms_*：订单管理模块相关表
+ pms_*：商品模块相关表
+ sms_*：营销模块相关表
+ ums_*：会员模块相关表

#### 数据库表概览

![](https://s2.ax1x.com/2019/08/22/m0RXJx.png)



