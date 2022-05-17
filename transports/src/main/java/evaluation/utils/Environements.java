package evaluation.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Environements {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.url}")
    private String username;
    @Value("${spring.datasource.url}")
    private String password;
    @Value("${spring.datasource.url}")
    private String baseUrl;
    @Value("${base-url}")
    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
