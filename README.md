# Kafka-test-project

## How Start the kafka and Zookeeper Service ?
- Download Kafka from [here](https://kafka.apache.org/downloads).
- Start the Zookeeper Service using this command - .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
- Start the Kafka Service using this command - .\bin\windows\kafka-server-start.bat .\config\server.properties

## Test the feature
-  Clone the repo and run the Spring Boot Application
- The default port might be 8080
- Hit this API to produce (send) message http://localhost:8080/rest/api/producerMsg?message="Hello World!"
- Kafka will produce the message to this topic (**kafka_test_Topic**) and consume the message and will display the message.