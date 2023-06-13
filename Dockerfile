FROM gradle:jdk8 

ENV DIR=/study-gradle
#ENV PORT=4200

WORKDIR ${DIR}

ADD . .

#EXPOSE ${PORT}