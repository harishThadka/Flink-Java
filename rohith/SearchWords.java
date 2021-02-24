/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package myflink;

import java.util.Scanner;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;

public class SearchWords {

	public static void main(String[] args) throws Exception {

		
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		
		DataStream<String> text = env.socketTextStream("localhost", 9000, "\n");

		
            String [] names = {"Rohith", "Harish", "Vikas", "Puneeth", "Deekshith", "Sumanth"}; 
            for(int i=0;i<names.length;i++)
            {
                System.out.print(names[i]+", ");
            }

            String word="Vikas";
            boolean a=false;
            for(int i=0;i<names.length;i++)
            {
               if(word.equals(names[i])) 
               {
                   System.out.println("\nThe "+word+" is found at "+i+" location");
                   a=true;
               }
               
            }
            if(a!=true)
            {
                System.out.println("The "+word+" is not found");
            }
		
		text.print().setParallelism(1);

		env.execute("Socket Window WordCount");
	}
}
