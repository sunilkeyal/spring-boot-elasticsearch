# demo-elasticsearch

A sample spring boot application using spring-data-elasticsearch

## Docker Compose - Builds and deploys Docker Containers
docker-compose.yml file can be used to build and manage multiple services in Docker containers. It currently deploys mongodb

- https://docs.docker.com/compose/reference/overview/
- docker-compose up -d (-d for detached mode)
- docker-compose -f abc-compose.yml up -d (docker-compose.yml is default but another file can be used this way)
- docker-compose down (to stop and delete containers)