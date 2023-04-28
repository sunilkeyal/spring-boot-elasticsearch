# spring-boot-elasticsearch

A sample spring boot application using spring-data-elasticsearch

The tests expect elastic to be available. Elastic can be installed inside docker container as follows. 
Once elastic is started inside docker, gradle will be able to build and the test will be successful.

## Elastic Search in Docker using docker-compose.yml
docker-compose.yml file can be used to build and manage multiple services in Docker containers. It currently deploys elastic search and kibana

- https://docs.docker.com/compose/reference/overview/
- docker-compose up -d (-d for detached mode)
- docker-compose -f abc-compose.yml up -d (docker-compose.yml is default but another file can be used this way)
- docker-compose down (to stop and delete containers)
