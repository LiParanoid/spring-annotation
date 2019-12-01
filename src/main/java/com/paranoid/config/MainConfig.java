package com.paranoid.config;

/**
 * @author Paranoid
 * @create 2019-12-01 0:27
 */

        import com.paranoid.bean.Person;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.FilterType;
        import org.springframework.stereotype.Controller;

        import java.lang.reflect.Type;

/**
 * 配置类就相当于我们以前的配置文件
 */
//@Configuration 这个注解就告诉Spring这是一个配置类
@Configuration
@ComponentScan(value = "com.paranoid" ,useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class MainConfig {
    /**
     * 接下来进行bean的注册，我们可以写一个方法
     * 将这个方法加上@Bean注解，表示为spring注册一个bean 和配置文件中bean标签作用一致
     * 类型为返回值类型，id为方法名（也可通过 @Bean(value="personXXX") 指定id）
     * @return
     */
    @Bean("person01")
    public Person person(){
        return new Person("xiaoming",19);
    }
}
