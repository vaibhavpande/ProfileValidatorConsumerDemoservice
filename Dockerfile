#FROM usaze-nonprod.dtr.demo.com/9498-testsp-platform/gssp-pinpoint-base:1
FROM dtr.demo.com/9498-testsp-platform/testsp-base-image:1.0.1.45

ARG commit=local
ARG branch=local
ARG buildName=local
ARG buildNumber=local
ARG jarname=demo-ar-mis-profile-service-0.1.0

LABEL ci.git.commit.id=${commit}
LABEL ci.git.branch=${branch}
LABEL ci.build.name=${buildName}
LABEL ci.build.number=${buildNumber}

WORKDIR "/"
VOLUME /tmp
EXPOSE 8080
ADD build/libs/${jarname}.jar app.jar
ADD build/${jarname}-src.tgz /gssp
RUN sh -c 'touch /app.jar'

#ENTRYPOINT exec java $JAVA_OPTS -javaagent:/agent/pinpoint-bootstrap-1.6.2.jar -Dpinpoint.agentId=$AGENT_ID -Dpinpoint.applicationName=$AGENT_NAME -Djava.security.egd=file:/dev/./urandom -Ddeploy.path=/gssp -jar /app.jar
