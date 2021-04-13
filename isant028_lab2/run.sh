#!/usr/bin/env sh
mvn clean package

time cp AREAWATER.csv AREAWATER_COPY3.csv

hadoop jar target/isant028_lab2-1.0-SNAPSHOT.jar file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER.csv file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER_COPY.csv

hadoop jar target/isant028_lab2-1.0-SNAPSHOT.jar file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER.csv hdfs:///AREAWATER_COPY.csv

hadoop jar target/isant028_lab2-1.0-SNAPSHOT.jar hdfs:///AREAWATER_COPY.csv file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER2.csv

hadoop jar target/isant028_lab2-1.0-SNAPSHOT.jar hdfs:///AREAWATER_COPY.csv hdfs:///AREAWATER_COPY2.csv