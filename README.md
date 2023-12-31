﻿## hub-facecomparison

### What
This API compares two images and returns the highest face similarity threshold.

## Stack
-> Java17 + Spring Boot 3.x<br />
-> AWS Lambda + API Gateway<br />
-> AWS Rekognition<br />
-> Serverless framework<br />

## To run locally
First, you need to have Java 17 and Maven installed on your computer. After that, run the following commands in the terminal:
1. mvn install
2. java -Dserver.port=8080 -cp target/my-app-with-tomcat.jar com.br.hub.facecomparison.config.SpringApp
3. Access in your browser: http://localhost:8080/index.html

## To deploy (aws provider)
1. Install [serverless framework](https://www.serverless.com/)
2. run this command: serverless deploy

## Test without clone :)
Just access: [https://chrisbonilha.github.io/hub-facecomparison-api](https://chrisbonilha.github.io/hub-facecomparison-api)
