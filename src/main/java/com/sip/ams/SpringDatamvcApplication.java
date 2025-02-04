/*package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.controllers.ArticleController;

import java.io.File;
@SpringBootApplication
public class AmsDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsDataApplication.class, args);
	}

}*/
package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.controllers.ArticleController;

import java.io.File;
@SpringBootApplication
public class SpringDatamvcApplication {

	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(SpringDatamvcApplication.class, args);
	}

}

