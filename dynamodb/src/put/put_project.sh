aws dynamodb put-item \
--table-name project_db \
--item '{"projectId":{"N":"1"},
         "projectName":{"S":"first_project"},
         "groupId":{"N":"1"}}' \
--endpoint-url http://localhost:8888
