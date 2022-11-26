#!/usr/bin/env bash

echo ""
echo "test /"
curl -X GET http://localhost:8084/
echo ""
echo "test /hello"
curl -X GET http://localhost:8084/hello
echo ""
echo "test /hello/world"
curl -X GET http://localhost:8084/hello/world

