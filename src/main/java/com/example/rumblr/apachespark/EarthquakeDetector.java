package com.example.rumblr.apachespark;



import org.apache.spark.*;
import org.apache.spark.api.java.function.*;
import org.apache.spark.streaming.*;
import org.apache.spark.streaming.api.java.*;
import scala.Tuple2;


public class EarthquakeDetector {


    SparkConf conf = new SparkConf().setMaster("local[2]").setAppName("NetworkWordCount");
    JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(1));

    JavaReceiverInputDStream<String> lines = jssc.socketTextStream("localhost", 9999);

}
