aws dynamodb --region ap-northeast-1 \
--endpoint-url http://localhost:8888 \
create-table --table-name group_db \
--attribute-definitions AttributeName=groupId,AttributeType=N \
--key-schema AttributeName=groupId,KeyType=HASH \
--billing-mode PAY_PER_REQUEST
