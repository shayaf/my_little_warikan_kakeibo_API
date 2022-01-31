aws dynamodb --region ap-northeast-1 \
--endpoint-url http://localhost:8888 \
create-table --table-name payment_db \
--attribute-definitions AttributeName=paymentId,AttributeType=N \
--key-schema AttributeName=paymentId,KeyType=HASH \
--billing-mode PAY_PER_REQUEST
