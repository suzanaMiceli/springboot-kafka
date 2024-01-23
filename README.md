# Messaging Spring Boot using Kafka

System to introduce the messaging concept presented in this video using Spring Boot and Kafka.
## Technologies
- Spring Boot
- Spring MVC
- Spring for Kafka
- Kafka
- Docker Compose

## How to Run

### Run Kafka with Docker Compose:

```bash
$ docker-compose up
```

- Add the hostname "kafka" to the /etc/hosts file.
- Clone the git repository.
- Build the project:

```bash
$ ./mvnw clean package
```
- Run the application.
- Send a hello:

```bash
$ http :8080/kafka/hello/suzana

HTTP/1.1 200
Connection: keep-alive
Content-Length: 2
Content-Type: text/plain;charset=UTF-8
Date: Wed, 05 Jul 2023 16:21:05 GMT
Keep-Alive: timeout=60

OK
```
- View the received message in the log:
Consumer Message: Hello, Suzana!
