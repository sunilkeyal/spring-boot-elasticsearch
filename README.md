# spring-boot-elasticsearch

A sample spring boot application using spring-data-elasticsearch

The tests expect elastic to be available. Elastic can be installed inside docker container as follows. 
Once elastic is started inside docker, gradle will be able to build and the test will be successful.

## Install elastic search in docker using docker-compose.yml

- https://docs.docker.com/compose/reference/overview/
- docker-compose up -d (-d for detached mode)
- docker-compose -f abc-compose.yml up -d (docker-compose.yml is default but another file can be used this way)
- docker-compose down (to stop and delete containers)


# Grafana
- source elasticsearch : http://elasticsearch:9200