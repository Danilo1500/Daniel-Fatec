FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    chromium-browser \
    curl \
    git \
    git-lfs \
    maven \
    mysql-server \
    openjdk-21-jdk \
    unzip \    
    && rm -rf /var/lib/apt/lists/*

RUN echo "CREATE USER 'daniel'@'localhost' IDENTIFIED BY 'daniel123'; \
        GRANT ALL PRIVILEGES ON *.* TO 'daniel'@'localhost' WITH GRANT OPTION; \
        FLUSH PRIVILEGES;" > /tmp/script.sqlP

RUN service mysql start && \
    sleep 5 && \
    mysql -uroot < /tmp/script.sql && \
    service mysql stop

ENV FLUTTER_VERSION=3.35.0

RUN git clone https://github.com/flutter/flutter.git /opt/flutter \
    && cd /opt/flutter \
    && git checkout $FLUTTER_VERSION
    
ENV PATH="/opt/flutter/bin:/opt/flutter/bin/cache/dart-sdk/bin:${PATH}"

RUN flutter doctor

WORKDIR /workspaces/Daniel-Fatec

CMD [ "bash" ]
