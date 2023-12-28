FROM openjdk
LABEL authors="saisunil akula"
COPY  "/jar/cloudlearn.jar"  "/cloudlearn.jar"
ENTRYPOINT ["java", "-jar","/cloudlearn.jar"]