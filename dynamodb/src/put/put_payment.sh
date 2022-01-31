aws dynamodb put-item \
--table-name payment_db \
--item '{"paymentId":{"N":"1"},
         "paymentName":{"S":"chicken"},
         "category":{"S":"food"},
         "price":{"N":"1000"},
         "paidBy":{"S":"user1"},
         "date":{"S":"2022-01-31"},
         "projectId":{"N":"1"}}' \
--endpoint-url http://localhost:8888

aws dynamodb put-item \
--table-name payment_db \
--item '{"paymentId":{"N":"2"},
         "paymentName":{"S":"fish"},
         "category":{"S":"food"},
         "price":{"N":"1200"},
         "paidBy":{"S":"user1"},
         "date":{"S":"2022-01-31"},
         "projectId":{"N":"1"}}' \
--endpoint-url http://localhost:8888

