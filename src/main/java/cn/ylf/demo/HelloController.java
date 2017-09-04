package cn.ylf.demo;

import cn.ylf.demo.config.ConfigurationSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Value("${test.author}")
    private String author;

    @Autowired
    private ConfigurationSettings configurationSettings;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! author:"+configurationSettings.getAuthor();
    }

}