package edu.ucr.cs.cs167.isant028;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        if (args.length != 2){
            System.out.println("Invalid number of Arguments. Must input 2");
            System.exit(0);
        }

        Path input = new Path(args[0]);
        Path output = new Path(args[1]);
        FileSystem inputFile = input.getFileSystem(new Configuration());
        FileSystem outputFile = output.getFileSystem(new Configuration());
        if (!inputFile.isFile(input)) {
            System.out.println("Cannot find input file");
            System.exit(0);
        }
        if (outputFile.exists(output)) {
            System.out.println("Output file already exists.");
            System.exit(0);
        }

        long startTime = System.nanoTime();

        FSDataInputStream inStream = inputFile.open(input);
        FSDataOutputStream outStream = outputFile.create(output);

        byte[] buffer = new byte[4096];
        int count;
        double time;
        long tot = 0;

        while((count = inStream.read(buffer))>0){
            outStream.write(buffer, 0, count);
            tot += count;
        }
        inStream.close();
        outStream.close();

        time = ((double)System.nanoTime()-startTime)/1000000000;


        System.out.println("Copied " + tot + " bytes from " + args[0] + " to " + args[1] + " in " + time + " seconds");
    }

}
