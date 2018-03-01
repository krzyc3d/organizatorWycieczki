package KPprojects.OrganizerLot.w.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfiguration extends  WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication ( )
                .withUser ("user1").password ("1234").authorities ("user");
    }

     @Bean
     public PasswordEncoder userPasswordEncoder(){
        return new BCryptPasswordEncoder ();
    }


    @Override
    protected void  configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests ()
                .antMatchers ("/items").hasAnyAuthority ("user")
                .antMatchers ("/items/add").hasAnyAuthority ("user")
            .and ()
                .formLogin ()
                .loginProcessingUrl ("/login")
                .loginPage ("/loginPage")
                .defaultSuccessUrl ("/flights")
                .failureUrl ("/loginFailure")
                .usernameParameter ("username")
                .passwordParameter ("password")
            .and ()
                .logout ()
                .logoutUrl ("/logout")
                .logoutSuccessUrl ("/flights")
            .and ()
                .exceptionHandling ()
                .accessDeniedPage ("/accessDenied");
    }

    }
