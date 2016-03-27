package mrjob;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MaxMapper extends Mapper<Text, Text, Text, Text> {
	
	@Override
	public void map (Text key, Text value, Context context) throws IOException, InterruptedException {
		System.out.println("MAPPER: " + key + " : " + value);
		context.write(key, value);
	}
}
