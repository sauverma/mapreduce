package mrjob;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxReducer extends Reducer <Text, Text, Text, Text>{
	
	@Override
	public void reduce (Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		String merged = "";
		
		for (Text value : values) {
			merged += value.toString();
		}
		
		System.out.println("REDUCER: " + key + " : " + merged);
		
		context.write(key, new Text(merged));
	}
}
