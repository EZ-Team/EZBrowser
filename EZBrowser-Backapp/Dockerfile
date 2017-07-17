FROM openjdk
COPY ./build/libs/EZBrowser-Backapp-0.0.1-SNAPSHOT.jar /home/EZBrowser-Backapp-0.0.1-SNAPSHOT.jar
COPY ./start.sh /home
CMD ["chmod", "+x", "/home/start.sh"]
ENTRYPOINT /home/start.sh
EXPOSE 8080

