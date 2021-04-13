# Lab 2

## Student information
* Full name: Isabella Santiago
* E-mail: isant028@ucr.edu 
* UCR NetID: isant028
* Student ID: 862220109

## Answers

* (Q1) Verify the file size and record the running time. 
  
      Copied 2271210910 bytes from AREAWATER.csv to output.csv in 6.924137789 seconds
  
* (Q2) Record the running time of the copy command.

      cp AREAWATER.csv copy.csv  0.01s user 1.56s system 45% cpu 3.432 total

* (Q3) How do the two numbers compare? (The running times of copying the file through your program and the operating system.)

      When we copied the files using the program, it took longer than using the operating system. 
      However, they both copied the file fairly quick. 

* (Q4)  Does the program run after you change the default file system to HDFS? What is the error message, if any, that you get?
  
      The program runs, but there is an error in which the program is unable to find the input file we want to copy. 

* (Q5)  Use your program to test the following cases and record the running time for each case.

  Copy a file from local file system to HDFS

      Copied 2271210910 bytes from file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER.csv to hdfs:///AREAWATER_COPY.csv in 8.660612694 seconds
        

  Copy a file from HDFS to local file system.

    Copied 2271210910 bytes from hdfs:///AREAWATER_COPY.csv to file:////Users/isabellasantiago/workspace/isant028_lab2/AREAWATER2.csv in 7.026186919 seconds

  Copy a file from HDFS to HDFS.

    Copied 2271210910 bytes from hdfs:///AREAWATER_COPY.csv to hdfs:///AREAWATER_COPY2.csv in 8.994675536 seconds


Copying | local to local | local to local (system command) | local to HDFS | HDFS to local | HDFS to HDFS| 
--- | --- | --- | --- |--- |--- 
Seconds | 6.924137789 | 3.432 | 8.660612694 | 7.026186919 | 8.994675536 |
