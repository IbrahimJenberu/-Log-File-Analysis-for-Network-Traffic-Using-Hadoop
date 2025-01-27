package com.example.hadoop;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class LogfileMapper extends Mapper<Object, Text, Text, IntWritable> {
    private final static IntWritable one = new IntWritable(1);
    private Text ipAddress = new Text();

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        // Assuming log format: IP_ADDRESS - - [date] "request" status_code size
        String[] parts = value.toString().split(" ");
        if (parts.length > 0) {
            ipAddress.set(parts[0]);  // Extract IP address
            context.write(ipAddress, one);  // Output: IP address and count of 1
        }
    }
}
