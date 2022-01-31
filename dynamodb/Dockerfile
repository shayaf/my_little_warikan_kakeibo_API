RUN yum install -y tar gzip \
  && curl -O https://s3-ap-northeast-1.amazonaws.com/dynamodb-local-tokyo/dynamodb_local_latest.tar.gz \
  && mkdir /dynamodb \
  && tar zxf dynamodb_local_latest.tar.gz -C /dynamodb \
  && mkdir /data

# このスクリプトが DynamoDB Local を起動して import-data.jar を実行します
RUN /dynamodb-local-init.sh

# ここまでがビルド用のイメージ (builder) で、ここからが配布用のイメージです
FROM amazon/dynamodb-local

# ビルド用のイメージから配布用のイメージにデータベースファイルをコピーしています
COPY --from=builder data/ /data/

USER root
RUN chown -R dynamodblocal /data/
USER dynamodblocal

EXPOSE 8000
ENTRYPOINT ["java"]
CMD ["-jar", "DynamoDBLocal.jar", "-sharedDb", "-dbPath", "/data"]
