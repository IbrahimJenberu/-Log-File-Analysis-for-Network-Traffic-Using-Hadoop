# Log File Analysis for Network Traffic Using Hadoop

This project aims to analyze server log files to detect unusual traffic patterns or potential security threats using **Hadoop**'s distributed computing capabilities. By processing large volumes of log data, the system identifies network anomalies or malicious activities.

## Tools & Technologies:
- **HDFS**: Scalable storage of log files.
- **Apache Spark**: Fast data processing and machine learning (MLlib for anomaly detection).
- **Apache Hive**: SQL-like queries for log analysis.
- **Apache MapReduce**: For processing and analyzing large datasets.

## Workflow:
1. **Data Collection**: Log data from datasets like UNSW-NB15 or NASA logs.
2. **Preprocessing**: Use Apache Spark for cleaning and formatting logs.
3. **Anomaly Detection**: Spark MLlib or MapReduce to detect unusual traffic patterns.
4. **Output**: Generate reports or traffic statistics on anomalies.

## Setup & Running:
1. **Preprocessing**: Run the Spark preprocessing job.
2. **Anomaly Detection**: Run the Spark MLlib anomaly detection.
3. **MapReduce**: Run the Hadoop MapReduce job for traffic analysis.
4. **Hive**: Query processed data in Hive.

## Output:
The output includes anomaly reports and traffic statistics for detected unusual behavior or security threats.

## Requirements:
- Apache Hadoop
- Apache Spark
- Apache Hive
- Scala
- Java
