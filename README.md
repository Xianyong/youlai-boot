<div align="center">

<p>
  <strong>一票就够，不用每天投 🙏 您的支持是我们持续更新的最大动力！</strong>
</p>

<p>
  <a href="https://gitee.com/activity/2025opensource?ident=I6VXEH" target="_blank">
    <strong>👉 点击徽章或这里投票 👈</strong>
  </a>
</p>

</div>

![](https://foruda.gitee.com/images/1708618984641188532/a7cca095_716974.png "rainbow.png")


<div align="center">
   <img alt="logo" width="100" height="100" src="https://foruda.gitee.com/images/1733417239320800627/3c5290fe_716974.png">
   <h2>youlai-boot</h2>
   <img alt="有来技术" src="https://img.shields.io/badge/Java -17-brightgreen.svg"/>
   <img alt="有来技术" src="https://img.shields.io/badge/SpringBoot-3.5.6-green.svg"/>
   <a href="https://gitcode.com/youlai/youlai-boot" target="_blank">
    <img alt="有来技术" src="https://gitcode.com/youlai/youlai-boot/star/badge.svg"/>
   </a>
   <a href="https://gitee.com/youlaiorg/youlai-boot" target="_blank">
     <img alt="有来技术" src="https://gitee.com/youlaiorg/youlai-boot/badge/star.svg"/>
   </a>     
   <a href="https://github.com/haoxianrui/youlai-boot" target="_blank">
     <img alt="有来技术" src="https://img.shields.io/github/stars/haoxianrui/youlai-boot.svg?style=social&label=Stars"/>
   </a>
   <br/>
   <img alt="有来技术" src="https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg"/>
   <a href="https://gitee.com/youlaiorg" target="_blank">
     <img alt="有来技术" src="https://img.shields.io/badge/Author-有来开源组织-orange.svg"/>
   </a>
</div>

![](https://raw.gitmirror.com/youlaitech/image/main/docs/rainbow.png)

<div align="center">
  <a target="_blank" href="https://vue.youlai.tech/">🖥️ 在线预览</a> |  <a target="_blank" href="https://youlai.blog.csdn.net/article/details/145178880">📑 阅读文档</a> |  <a target="_blank" href="https://www.youlai.tech/youlai-boot">🌐 官网</a>
</div>

## 📢 项目简介

基于 JDK 17、Spring Boot 3、Spring Security 6、JWT、Redis、Mybatis-Plus、Vue 3、Element-Plus 构建的前后端分离单体权限管理系统。 [Mybatis-Flex 版本](https://gitee.com/youlaiorg/youlai-boot-flex)

- **🚀 开发框架**: 使用 Spring Boot 3 和 Vue 3，以及 Element-Plus 等主流技术栈，实时更新。

- **🔐 安全认证**: 基于 Spring Security 6 原生架构，集成 JWT 令牌自动续期（无状态）和 Redis 会话多端互斥管理（实时强制离线）双重认证机制，构建企业级身份安全中枢。

- **🔑 权限管理**: 基于 RBAC 模型，实现细粒度的权限控制，涵盖接口方法和按钮级别。

- **🛠️ 功能模块**: 包括用户管理、角色管理、菜单管理、部门管理、字典管理等功能。

## 🌈 项目源码

| 项目类型       | Gitee             | Github                                   | GitCode                                 |
| --------------| -------------------------  |  ------------------------------- | ------------------------------------- |
| ✅ Java 后端  | [youlai-boot](https://gitee.com/youlaiorg/youlai-boot)       | [youlai-boot](https://github.com/haoxianrui/youlai-boot)    | [youlai-boot](https://gitcode.com/youlai/youlai-boot)        |
| vue3 前端     | [vue3-element-admin](https://gitee.com/youlaiorg/vue3-element-admin) | [vue3-element-admin](https://github.com/youlaitech/vue3-element-admin) | [vue3-element-admin](https://gitcode.com/youlai/vue3-element-admin) |
| uni-app 移动端 | [vue-uniapp-template](https://gitee.com/youlaiorg/vue-uniapp-template) | [vue-uniapp-template](https://github.com/youlaitech/vue-uniapp-template) | [vue-uniapp-template](https://gitcode.com/youlai/vue-uniapp-template) |



## 📚 项目文档

| 文档名称          | 访问地址                                                                                   |
|---------------|-------------------------------------------------------------------------------------------|
| 在线接口文档        | [https://www.apifox.cn/apidoc](https://www.apifox.cn/apidoc/shared-195e783f-4d85-4235-a038-eec696de4ea5) |
| 项目介绍与使用指南     | [https://www.youlai.tech/youlai-boot/](https://www.youlai.tech/youlai-boot/)              |
| 功能详解与操作手册     | [https://youlai.blog.csdn.net/article/details/145178880](https://youlai.blog.csdn.net/article/details/145178880) |
| 新手入门指南(项目0到1) | [https://youlai.blog.csdn.net/article/details/145177011](https://youlai.blog.csdn.net/article/details/145177011) |


## 📁 项目目录


<details>
<summary> 目录结构 </summary>

<br>

```
youlai-boot
├── docker                              # Docker 目录
│   ├── docker-compose.yml              # docker-compose 脚本
├── sql                                 # SQL脚本
│   ├── mysql                           # MySQL 脚本
├── src                                 # 源码目录
│   ├── auth                            # 认证模块（登录入口）
│   ├── common                          # 公共模块
│   │   ├── annotation                  # 注解定义
│   │   ├── base                        # 基础类
│   │   ├── constant                    # 常量
│   │   ├── enums                       # 枚举类型
│   │   ├── model                       # 数据模型
│   │   └── util                        # 工具类
│   ├── config                          # 自动装配配置
│   │   └── property                    # 配置属性目录
│   ├── core                            # 核心框架
│   │   ├── aspect                      # 切面(日志、防重提交)
│   │   ├── exception                   # 异常处理
│   │   ├── filter                      # 过滤器(请求日志、限流)
│   │   ├── validator                   # 验证器
│   │   └── web                         # Web响应封装(Result、PageResult等)
│   ├── platform                        # 平台服务（通用服务）
│   │   ├── codegen                     # 代码生成模块
│   │   ├── file                        # 文件服务
│   │   ├── mail                        # 邮件服务
│   │   ├── sms                         # 短信服务
│   │   └── websocket                   # WebSocket服务
│   ├── plugin                          # 插件扩展
│   │   ├── knife4j                     # Knife4j 扩展
│   │   └── mybatis                     # Mybatis 扩展
│   ├── security                        # 安全框架（Spring Security）
│   │   ├── exception                   # 安全异常
│   │   ├── filter                      # 安全过滤器
│   │   ├── handler                     # 安全处理器
│   │   ├── model                       # 安全模型
│   │   ├── provider                    # 认证提供者
│   │   ├── service                     # 安全服务
│   │   ├── token                       # Token管理
│   │   └── util                        # 安全工具类
│   ├── system                          # 系统模块
│   │   ├── controller                  # 控制层
│   │   ├── converter                   # MapStruct 转换器
│   │   ├── enums                       # 枚举
│   │   ├── handler                     # 处理器
│   │   ├── listener                    # 监听器
│   │   ├── mapper                      # 数据库访问层
│   │   ├── model                       # 模型层
│   │   │   ├── bo                      # 业务对象
│   │   │   ├── dto                     # 数据传输对象
│   │   │   ├── entity                  # 实体对象
│   │   │   ├── event                   # 事件对象
│   │   │   ├── form                    # 表单对象
│   │   │   ├── query                   # 查询参数对象
│   │   │   └── vo                      # 视图对象
│   │   └── service                     # 业务逻辑层
│   └── YouLaiBootApplication           # 启动类
└── end                             
```
</details>



## 🚀 项目启动

📚 完整流程参考: [项目启动](https://www.youlai.tech/youlai-boot/1.%E9%A1%B9%E7%9B%AE%E5%90%AF%E5%8A%A8/)

1. **克隆项目**

   ```bash
   git clone https://gitee.com/youlaiorg/youlai-boot.git
   ```

2. **数据库初始化**

   执行 [youlai_boot.sql](sql/mysql/youlai_boot.sql) 脚本完成数据库创建、表结构和基础数据的初始化。

3. **修改配置**

   默认连接`有来`线上 MySQL/Redis（仅读权限），本地开发时请修改 [application-dev.yml](src/main/resources/application-dev.yml) 中的 MySQL 和 Redis 连接信息。

4. **启动项目**

   执行 [YoulaiBootApplication.java](src/main/java/com/youlai/boot/YoulaiBootApplication.java) 的 main 方法完成后端项目启动；

   访问接口文档地址 [http://localhost:8989/doc.html](http://localhost:8989/doc.html) 验证项目启动是否成功。


## 🚀 项目部署

参考官方文档: [项目部署指南](https://www.youlai.tech/youlai-boot/5.%E9%A1%B9%E7%9B%AE%E9%83%A8%E7%BD%B2/)


## ✅ 项目统计

![](https://repobeats.axiom.co/api/embed/544c5c0b5b3611a6c4d5ef0faa243a9066b89659.svg "Repobeats analytics image")

Thanks to all the contributors!

[![](https://contrib.rocks/image?repo=haoxianrui/youlai-boot)](https://github.com/haoxianrui/youlai-boot/graphs/contributors)


## 💖 加交流群

① 关注「有来技术」公众号，点击菜单 **交流群** 获取加群二维码（此举防止广告进群，感谢理解和支持）。

② 直接添加微信 **`haoxianrui`** 备注「前端/后端/全栈」。

![有来技术公众号](https://foruda.gitee.com/images/1737108820762592766/3390ed0d_716974.png)  

## 如何调试代码

// 假设登录成功返回的JSON格式为：{"code": 200, "data": {"token": "xxx"}}
var code = ke.response.data.code;
if(code == "00000") { // 判断登录成功
// 从响应体中找到 token
var token = ke.response.data.data.accessToken;
// 设置为全局请求头，参数名根据你的项目要求可能是 "token" 或 "Authorization"
ke.global.setAllHeader("Authorization", "Bearer " + token);
// 如果需要，也可以同时设置为Query参数
// ke.global.setAllParameter("token", token);
}

## DB
USE youlai_boot;

CREATE TABLE `t_goods` (
`id` CHAR(36) NOT NULL COMMENT '商品ID' COLLATE 'utf8mb4_unicode_ci',
`category` VARCHAR(10) NOT NULL DEFAULT '' COMMENT '商品类别（家电、食品、日用）' COLLATE 'utf8mb4_unicode_ci',
`name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '名称' COLLATE 'utf8mb4_unicode_ci',
`made_address` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '产地' COLLATE 'utf8mb4_unicode_ci',
`price` FLOAT NOT NULL DEFAULT '0' COMMENT '单价',
PRIMARY KEY (`id`) USING BTREE
)
COMMENT='临时商品表'
COLLATE='utf8mb4_unicode_ci'
ENGINE=InnoDB
;


CREATE TABLE `t_user` (
`id` CHAR(36) NOT NULL DEFAULT (uuid()) COMMENT '用户ID' COLLATE 'utf8mb4_unicode_ci',
`username` VARCHAR(16) NOT NULL DEFAULT '' COMMENT '姓名' COLLATE 'utf8mb4_unicode_ci',
`password` VARCHAR(16) NOT NULL DEFAULT 'abc' COMMENT '密码' COLLATE 'utf8mb4_unicode_ci',
`birthday` DATETIME NOT NULL DEFAULT '1900-01-01 00:00:00' COMMENT '生日',
PRIMARY KEY (`id`) USING BTREE
)
COMMENT='临时用户表'
COLLATE='utf8mb4_unicode_ci'
ENGINE=InnoDB
;


CREATE TABLE `t_order` (
`id` CHAR(36) NOT NULL DEFAULT (uuid()) COMMENT '订单ID' COLLATE 'utf8mb4_unicode_ci',
`goods_id` CHAR(36) NOT NULL DEFAULT '' COMMENT '商品ID' COLLATE 'utf8mb4_unicode_ci',
`order_time` DATETIME NOT NULL DEFAULT (now()) COMMENT '订单日期时间',
`total` INT NOT NULL DEFAULT '0' COMMENT '数量',
`uid` VARCHAR(36) NOT NULL DEFAULT (uuid()) COMMENT 'UserID' COLLATE 'utf8mb4_unicode_ci',
PRIMARY KEY (`id`) USING BTREE,
INDEX `FK_uid` (`uid`) USING BTREE,
CONSTRAINT `FK_uid` FOREIGN KEY (`uid`) REFERENCES `t_user` (`id`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
COMMENT='临时订单表'
COLLATE='utf8mb4_unicode_ci'
ENGINE=InnoDB
;

## knife4j Reference
https://doc.xiaominfo.com/docs/quick-start