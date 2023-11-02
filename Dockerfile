FROM ubuntu:latest
LABEL authors="bmouc"


ENTRYPOINT ["top", "-b"]