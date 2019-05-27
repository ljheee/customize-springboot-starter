
#### 自定义Spring boot starter



- greet-spring-boot-starter
实现 ConfigurationProperties，属性定制化。

- log-spring-boot-starter
方法加注解，拦截器打印执行时间。


<br>
##### Q&A
自己实现的自定义Spring boot starter，打包编译时(mvn clean package install)出现：
```
Execution default of goal org.springframework.boot:spring-boot-maven-plugin:2.0.6.RELEASE:repackage failed: Unable to find main class -> [Help 1]
```
百试不解，最终发现自己引入了spring-boot-maven-plugin：
```
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
去除即可。