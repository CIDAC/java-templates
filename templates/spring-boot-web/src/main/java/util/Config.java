package ${pkg}.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import org.h2.server.web.WebServlet;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;

/**
 *
 * @author wallace
 */
@Configuration
public class Config implements WebMvcConfigurer {
  public static final String JENV = System.getProperty("jenv", "development");
  public static final boolean JENV_TEST = "test".equals(JENV); 
  public static final boolean JENV_DEVELOPMENT = "development".equals(JENV); 
  public static final boolean JENV_PRODUCTION = "production".equals(JENV);

  @Autowired
  @Qualifier("RequestLogger")
  private HandlerInterceptor requestLogger;
 
  @Override
  public void addInterceptors(final InterceptorRegistry registry) {
    registry.addInterceptor(this.requestLogger);
  }

  // @Bean
  // public ServletRegistrationBean h2servletRegistration() {
  //   if(JENV_TEST) {
  //     ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
  //     registrationBean.addUrlMappings("/console/*");
  //     return registrationBean;
  //   }
  //   return null;
  // }
}
