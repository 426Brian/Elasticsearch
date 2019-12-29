package com.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot 默认两种技术和ES 交互
 * 1. Jest (默认不生效)
 * 2. SpringData ElasticSearch
 *      1) Client 节点信息 clusterNodes; clusterName
 *      2) ElasticsearchTemplate 操作 es
 *      3) 编写ElasticsearchRepository 子接口操作 es
 *
 */
@SpringBootApplication
public class ElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class, args);
    }

}
