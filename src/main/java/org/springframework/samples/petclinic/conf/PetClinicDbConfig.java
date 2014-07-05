package org.springframework.samples.petclinic.conf;

import javax.persistence.spi.PersistenceProvider;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


public class PetClinicDbConfig {

	public void test() {
		AbstractJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		vendor.setDatabase(Database.POSTGRESQL);
	}
}
