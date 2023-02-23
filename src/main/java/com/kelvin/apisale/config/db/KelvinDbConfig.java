package com.kelvin.apisale.config.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource({ "classpath:application.properties" })
@EnableJpaRepositories(basePackages = "com.kelvin.apisale.irepository.kelvindb", entityManagerFactoryRef = "kelvindbEntityManager", transactionManagerRef = "kelvindbTransactionManager")
public class KelvinDbConfig {
	@Autowired
	private Environment env;

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.kelvin.datasource")
	public DataSource kelvindbDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean
	public LocalContainerEntityManagerFactoryBean kelvindbEntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(kelvindbDataSource());
		em.setPackagesToScan(new String[] { "com.kelvin.apisale.model.kelvindb" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalJpaProperties());

		return em;
	}

	Properties additionalJpaProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", env.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
		properties.setProperty("hibernate.dialect", env.getRequiredProperty("spring.jpa.hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", env.getRequiredProperty("spring.jpa.show-sql"));
		return properties;
	}

	@Primary
	@Bean
	public PlatformTransactionManager kelvindbTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(kelvindbEntityManager().getObject());
		return transactionManager;
	}
}
