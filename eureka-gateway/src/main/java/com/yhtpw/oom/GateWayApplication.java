package com.yhtpw.oom;
import com.yhtpw.oom.zuulfilter.Filter;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class GateWayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(GateWayApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

	@Bean
	public Filter getFilter() {
		return new Filter();
	}

}
