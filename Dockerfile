#   from jenkins/jenkins:lts
#     USER root
#     RUN apt-get update -qq \
#         && apt-get install -qqy apt-transport-https ca-certificates curl gnupg2 software-properties-common
#     RUN curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add -
#     RUN add-apt-repository \
#        "deb [arch=amd64] https://download.docker.com/linux/debian \
#        $(lsb_release -cs) \
#        stable"
#     RUN apt-get update  -qq \
#         && apt-get install docker-ce=17.12.1~ce-0~debian -y
#     RUN usermod -aG docker jenkins


# FROM openjdk
# COPY target/*.jar /
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","/my-app-1.0-SNAPSHOT.jar"]

FROM openjdk
COPY target/ACRDemo-example-1.0-SNAPSHOT.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]
