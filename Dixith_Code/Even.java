/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.flink_java_demo;

/**
 *
 * @author S538365
 */
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;




public class Even {
    
    public void EvenNumber() throws Exception{
         // Create the execution environment.
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // Get the input data by connecting the socket. Here it is connected to the local port 9000. If the port 9000 has been already occupied, change to another port.
        DataStream<String> text = env.socketTextStream("localhost", 9000);
        // Taking the input data and checking its even or not,if even return number else its a fraud return 0.
        DataStream<Integer> parsed = text.map(new MapFunction<String, Integer>() {
                                        @Override
                                        public Integer map(String value) {
                                            int Evennumber= Integer.parseInt(value);
                                            if(Evennumber%2==0){
                                                return Evennumber;
                                            }
                                            else
                                                return 0;
                                        }
                                    });
       
        parsed.print().setParallelism(1);
        env.execute("Even");
    }
    
}

