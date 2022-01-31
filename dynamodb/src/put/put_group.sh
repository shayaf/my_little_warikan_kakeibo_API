#aws dynamodb put-item \
#--table-name group_db \
#--item '{"groupId":{"N":"1"},
#         "groupName":{"S":"first_project"},
#         "participants":{"N":"1"}}' \
#--endpoint-url http://localhost:8888