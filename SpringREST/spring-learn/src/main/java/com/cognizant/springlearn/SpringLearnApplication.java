package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	@SuppressWarnings("resource")
	public static void displayDate() throws ParseException
	{
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date=format.parse("31/12/2018");
		String strdate="31/12/2018";
		LOGGER.debug(strdate);
		LOGGER.info("END");

	}
	public static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);

		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
	}

}
