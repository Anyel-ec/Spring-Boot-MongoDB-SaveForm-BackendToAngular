package top.anyel.saveform.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoDbUri;

    public String getMongoDbUri() {
        return mongoDbUri;
    }

    public void setMongoDbUri(String mongoDbUri) {
        this.mongoDbUri = mongoDbUri;
    }
}
