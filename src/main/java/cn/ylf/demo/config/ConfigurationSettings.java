package cn.ylf.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author lifeng
 * @CreateTime 2017/9/4.
 */
@Component
@PropertySource("classpath:config/application.properties")
@ConfigurationProperties(prefix = "test")
public class ConfigurationSettings {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
