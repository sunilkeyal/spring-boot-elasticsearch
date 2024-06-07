package com.example.demoelasticsearch.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;


/**
 * When configuring Elasticsearch in our Java application, we need to define how we connect to the Elasticsearch instance.
 *
 */
@Configuration
public class ElasticConfig extends ElasticsearchConfiguration {

    @Value("${demo.elasticsearch.host}")
    private String host;

    @Value(("${demo.elasticsearch.port}"))
    private String port;

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo(host + ":" + port)
                .build();
    }
}

