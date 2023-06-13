FROM gradle:jdk8 

# add user
ENV USER=theo
RUN useradd ${USER}
RUN mkdir /home/${USER}

# set dir
ENV DIR=/home/${USER}/study-gradle
#ENV PORT=4200

WORKDIR ${DIR}

ADD . .

RUN chown -R ${USER}:${USER} /home/${USER}

#EXPOSE ${PORT}
