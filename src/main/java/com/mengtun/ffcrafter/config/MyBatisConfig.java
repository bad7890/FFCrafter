package com.mengtun.ffcrafter.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
public class MyBatisConfig {

  @Autowired
  private HikariDataSource dataSource;

  @Bean
  public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
    SqlSessionFactoryBean session = new SqlSessionFactoryBean();
    session.setDataSource(dataSource);

    // session configuration
    org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
    // allow auto camel mapping
    config.setMapUnderscoreToCamelCase(true);
    config.setUseGeneratedKeys(true);

    session.setConfiguration(config);

    // xml location configuration
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    session.setMapperLocations(resolver.getResources("classpath*:mapper/**/*.xml"));

    // get and return
    return session.getObject();
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new DataSourceTransactionManager(dataSource);
  }

}
