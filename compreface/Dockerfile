FROM exadel/compreface:1.0.0
ENV PGDATA=/data/database
RUN apt-get update && apt-get install jq -y
RUN rm /etc/postgresql/13/main/postgresql.conf
COPY postgresql.conf /etc/postgresql/13/main/postgresql.conf
COPY run.sh /
CMD ["/run.sh"]
