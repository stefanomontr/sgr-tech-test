FROM mysql:9 AS builder

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=SGR_DATABASE
# The test MySql DB is run on the same container, i.e. localhost
ENV SGR_MYSQL_DB_HOST=localhost
ARG SQL_SERVER_STARTUP_SCRIPT=start-test-sql-server.bash

# manual openjdk17 installation copying from official image
ARG OPENJDK_17_HOME=/usr/java/openjdk-17
COPY --from=openjdk:17 $OPENJDK_17_HOME $OPENJDK_17_HOME
ENV JAVA_HOME=$OPENJDK_17_HOME
ENV PATH=$OPENJDK_17_HOME/bin:$PATH

# Copy backend app to be built
WORKDIR /backend-app
COPY . .
COPY .mvn/ .mvn/

# Start SQL server and run full build with SpringBoot tests
COPY $SQL_SERVER_STARTUP_SCRIPT .
RUN chmod 777 $SQL_SERVER_STARTUP_SCRIPT
RUN ./$SQL_SERVER_STARTUP_SCRIPT && ./mvnw clean install

FROM openjdk:17-alpine AS final

WORKDIR /backend-app
COPY --from=builder /backend-app/impl/target/sgr-backend-impl-*.war .

EXPOSE 8080

CMD java -jar sgr-backend-impl-*.war