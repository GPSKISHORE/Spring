package com.tcs.swag;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Controller
//@EnableSwagger2
public class SwaggerDoc {

//	@Bean
//	public Docket getDoc() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.tcs.control")).paths(PathSelectors.regex("/Shiva.*"))
//				.build().useDefaultResponseMessages(true).apiInfo(getApis());
//	}
//
//	public ApiInfo getApis() {
//		Contact ct = new Contact("Kishore", "https://Kishore.com", "Kishore@gmail.com");
//		return new ApiInfo("First Swagger API", "Kishore First Swagger", "1.0", "kishore.com", ct, "Life Time",
//				"No Irl", Collections.emptyList());
//	}

	@Bean
	public OpenAPI cutapi() {
		return new OpenAPI().info(new Info().title("Kishore API").version("1.0")
				.contact(new Contact().name("Kishore").email("fndjk@gmail.com").url("fnsj.com")).description("fnjkdsh"));
	}
}
