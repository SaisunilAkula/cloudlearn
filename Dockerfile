FROM openjdk
LABEL authors="saisunil akula"
EXPOSE 4444
COPY  "jar/cloudlearn.jar"  "/cloudlearn.jar"
ENTRYPOINT ["java", "-jar","/cloudlearn.jar"]
