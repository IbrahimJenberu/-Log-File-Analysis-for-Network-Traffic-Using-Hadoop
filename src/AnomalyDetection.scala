import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object AnomalyDetection {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Anomaly Detection").getOrCreate()

    // Load processed logs
    val logs = spark.read.parquet("hdfs://path_to_output/processed_logs")

    // Convert logs to feature vectors (e.g., for KMeans clustering)
    val assembler = new VectorAssembler()
      .setInputCols(Array("ip_address", "http_method", "response_code"))
      .setOutputCol("features")
    val featureData = assembler.transform(logs)

    // Apply KMeans to detect anomalies (outliers in clustering)
    val kmeans = new KMeans().setK(2).setSeed(1)
    val model = kmeans.fit(featureData)
    val predictions = model.transform(featureData)

    // Save anomaly results (outliers or clusters)
    predictions.write.mode("overwrite").parquet("hdfs://path_to_output/anomaly_predictions")
    spark.stop()
  }
}
