# 🚀 Log File Analysis for Network Traffic Using Hadoop

This project is a scalable system designed to analyze server log files, detect unusual traffic patterns, and identify potential security threats. By leveraging **Hadoop's distributed computing power** and **Spark's real-time processing capabilities**, the system delivers actionable insights from large volumes of network data.

---

## 🌟 Key Features

- **Data Collection**: Collect server logs from simulated or public datasets like UNSW-NB15 or NASA Logs.
- **Preprocessing with Spark**: Clean and structure raw log data into a queryable format.
- **Anomaly Detection**: Use **Spark MLlib** or **MapReduce** to identify unusual patterns or suspicious activities.
- **Scalable Storage**: Store and retrieve massive datasets using **HDFS**.
- **SQL-like Querying**: Use **Apache Hive** for traffic insights and generating reports.
- **Real-Time Processing**: Analyze logs efficiently for near real-time results.

---

## 🏗️ Architecture Overview

1. **Input**: Raw log data from simulated sources (e.g., `input/sample_logs.txt`).
2. **Preprocessing**: Clean and transform logs using **Apache Spark** (e.g., filter invalid entries, normalize data).
3. **Anomaly Detection**: Identify unusual traffic using:
   - **MLlib** clustering algorithms (K-Means).
   - **MapReduce** for distributed pattern recognition.
4. **Output**:
   - **Processed Logs**: Stored in `output/processed_logs/` (HDFS or local storage).
   - **Anomaly Reports**: Generated in `output/anomaly_predictions/`.
   - **Traffic Statistics**: Hive query results in `output/traffic_statistics/`.

---

## ⚙️ Tools and Technologies

| **Tool**          | **Purpose**                                  |
|--------------------|----------------------------------------------|
| **HDFS**          | Distributed storage for log files.           |
| **Apache Spark**  | Real-time processing and machine learning.   |
| **Apache Hive**   | SQL-like querying and insights generation.   |
| **MapReduce**     | Distributed log processing and traffic stats.|
| **Datasets**      | UNSW-NB15, NASA Logs (or custom logs).       |

---

## 🛠️ Setup and Usage

### Prerequisites
1. **Hadoop** (v3.2 or above)
2. **Apache Spark** (v3.2 or above)
3. **Apache Hive**
4. **Java** (v8 or above)
5. **Scala** (for Spark programs)

### Steps to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/logfile-analysis-hadoop.git
   cd logfile-analysis-hadoop
