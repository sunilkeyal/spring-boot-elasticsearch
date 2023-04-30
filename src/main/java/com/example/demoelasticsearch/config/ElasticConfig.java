package com.example.demoelasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * When configuring Elasticsearch in our Java application, we need to define how we connect to the Elasticsearch instance.
 * For that, we use a RestHighLevelClient that is offered by the Elasticsearch dependency
 *
 */
@Configuration
public class ElasticConfig {

    @Value("${demo.elasticsearch.host}")
    private String host;

    @Value(("${demo.elasticsearch.port}"))
    private String port;

    @Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfiguration
                = ClientConfiguration.builder()
                .connectedTo(host + ":" + port)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }
}

