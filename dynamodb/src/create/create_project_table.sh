aws dynamodb --region ap-northeast-1 \
--endpoint-url http://localhost:8888 \
create-table --table-name project_db \
--attribute-definitions AttributeName=projectId,AttributeType=N \
--key-schema AttributeName=projectId,KeyType=HASH \
--billing-mode PAY_PER_REQUEST
