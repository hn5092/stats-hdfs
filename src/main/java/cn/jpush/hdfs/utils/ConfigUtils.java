package cn.jpush.hdfs.utils;

public class ConfigUtils {

    public interface HOSTNAME {
	final String IP = "10.211.55.11";// ubuntu server ip
    }

    public interface MEMORY {
	final int MAXSIZE = 4096;
    }

    public interface HDFS {
	String INPUT_PATH = "hdfs://10.211.55.12:9000/home/hdfs/ncdc/2011/999999-96404-2011.gz";
	String OUTPUT_PATH = "hdfs://10.211.55.12:9000/home/hdfs/output/ncdc/2011/%s";
	String WORDCOUNT_IN = "hdfs://10.211.55.12:9000/home/hdfs/test/%s";
	String WORDCOUNT_OUT = "hdfs://10.211.55.12:9000/home/hdfs/output/wordcount/%s";
    }

}
