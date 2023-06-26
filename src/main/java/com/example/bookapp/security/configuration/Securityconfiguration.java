//apackage com.example.bookapp.security.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//public class Securityconfiguration {
//
//	@Bean
//	public SecurityFilterChain securitychain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
//				;
//	    http.httpBasic();
//	    http.csrf().disable();
//	    return http.build();
//		
//		
//	}
//	//@Bean
////	public UserDetailsService userDetailsServices () {
////		var user = User.withUsername("user").password("{noop}password").roles("USER").build();
////		var admin = User.withUsername("admin").password("{noop}admin").roles("admin").build();
////		return new InMemoryUserDetailsManager(user,admin);
//	//	return new UserInfoUserDetailsService();
//		
////	}
//	 @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        return new BCryptPasswordEncoder();
//	    }
//
//}
