FROM amazoncorretto:11
COPY /out/artifacts/maven_demo_jar/maven-demo.jar maven-demo.jar
ENTRYPOINT ["java", "-jar", "maven-demo.jar"]