import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object LogfilePreprocessing {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Logfile Preprocessing").getOrCreate()
    val logData = spark.read.text("hdfs://path_to_logs/network_logs.txt")

    // Example: Split log into fields (assuming space-separated fields in log)
    val processedLogs = logData
      .select(split(col("value"), " ").alias("fields"))
      .select(
        col("fields").getItem(0).alias("ip_address"),
        col("fields").getItem(3).alias("timestamp"),
        col("fields").getItem(5).alias("http_method"),
        col("fields").getItem(6).alias("url"),
        col("fields").getItem(8).alias("response_code")
      )

    processedLogs.createOrReplaceTempView("logs")

    // Save clean data to Hive table or HDFS
    processedLogs.write.mode("overwrite").parquet("hdfs://path_to_output/processed_logs")
    spark.stop()
  }
}
