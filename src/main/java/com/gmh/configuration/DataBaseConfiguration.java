package com.gmh.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by gmh on 2017/6/7 0007.
 */

@Configuration
@EnableTransactionManagement
public class DataBaseConfiguration implements EnvironmentAware {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment env) {
        this.propertyResolver = new RelaxedPropertyResolver(env, "druid.");
    }

    @Bean(destroyMethod = "close", initMethod = "init")
    public DataSource writeDataSource() {
        //trace < debug < info < warn < error
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("logback级别info 低于info不显示");
        logger.warn("Warn");
        logger.error("Error");

        logger.info("注入druid！！！");
        DruidDataSource datasource = new DruidDataSource();
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));
        datasource.setInitialSize(Integer.valueOf(propertyResolver.getProperty("initialSize")));
        datasource.setMinIdle(Integer.valueOf(propertyResolver.getProperty("minIdle")));
        datasource.setMaxWait(Long.valueOf(propertyResolver.getProperty("maxWait")));
        datasource.setMaxActive(Integer.valueOf(propertyResolver.getProperty("maxActive")));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(propertyResolver.getProperty("minEvictableIdleTimeMillis")));
        datasource.setTimeBetweenEvictionRunsMillis(Long.valueOf(propertyResolver.getProperty("timeBetweenEvictionRunsMillis")));
        return datasource;
    }
}
