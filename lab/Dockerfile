FROM gradle:7.3.0-jdk17 as builder
WORKDIR /source
COPY --chown=gradle:gradle build.gradle ./
COPY --chown=gradle:gradle settings.gradle ./
COPY --chown=gradle:gradle ./gradle ./
COPY --chown=gradle:gradle ./src ./src/
RUN gradle --no-daemon --console=plain bootJar

FROM openjdk:17-alpine3.14
ENV APP_ROOT "/lab"
RUN addgroup --gid 1111 --system lab \
    && adduser -u 1111 --system --g lab lab \
    && mkdir --parents ${APP_ROOT} \
    && chown --recursive lab:lab ${APP_ROOT}
USER lab
WORKDIR ${APP_ROOT}
COPY --chown=lab:lab --from=builder /source/build/libs/lab.jar ./
EXPOSE 8080
ENTRYPOINT [ "java", "-server", "-Xmx2G", "-Xms2G", "-jar", "lab.jar" ]