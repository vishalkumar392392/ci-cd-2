FROM openjdk:17
ADD jarstaging/com/deveops/deveops-2/2.1.2/deveops-2-2.1.2.jar devops2.jar 
ENTRYPOINT [ "java", "-jar", "devops2.jar" ]