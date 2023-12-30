FROM openjdk
LABEL authors="saisunil akula"
EXPOSE 4444
COPY  "target/cloudlearn.jar"  "/cloudlearn.jar"
ENTRYPOINT ["java", "-jar","/cloudlearn.jar"]
