<div align="center">
  <img src="Assets/Hadoop_Logo.png" width="200" title="hover text">
  <h1 align="center"> Hadoop Analysis </h1>
</div>

**Group 4 SBD-02**
+ Farras Rafi Permana - 2106700990
+ Zaki Ananda - 2106705474
+ Andikha Wisanggeni - 2106731503
+ M Fathan Muhandis - 2106731623

## What is Hadoop?
Hadoop adalah sebuah kerangka kerja (framework) open-source yang digunakan untuk pemrosesan dan penyimpanan data dalam skala besar secara terdistribusi. Hadoop dirancang untuk mengatasi tantangan dalam mengelola dan menganalisis data yang sangat besar (big data) yang tidak dapat ditangani dengan menggunakan sistem tradisional. Framework Hadoop hadir dan memungkinkan pengolahan data lebih banyak, menyimpan data heterogen dan mempercepat proses pengolahannya.

Dengan menggunakan Hadoop, perusahaan dan organisasi dapat memanfaatkan potensi data besar yang mereka miliki untuk mengambil wawasan bisnis yang berharga, melakukan analisis data yang kompleks, dan mengatasi tantangan pemrosesan data dalam skala besar. Hadoop juga memiliki ekosistem yang luas dengan berbagai komponen tambahan, seperti Apache Hive, Apache Pig, Apache HBase, Apache Spark, dan lainnya, yang memperluas kemampuan dan fungsionalitas Hadoop.

## How does Hadoop work?
Dalam Hadoop, terdapat empat modul utama yakni HDFS, YARN, MapReduce, dan Hadoop Common, berikut penjelasannya:

#### `Hadoop Distributed File System (HDFS)`

Merupakan sistem yang terdistribusi dan beroperasi di hardware standar maupun low-end.

#### `Yet Another Resource Negotiator (YARN)`

Merupakan sistem yang mengatur dan memonitor cluster node dan resource usage.

#### `MapReduce`

Merupakan framework yang membantu program untuk melakukan komputasi data secara paralel

#### `Hadoop Common`

Merupakan penyedia library Java yang dapat digunakan oleh semua modul

## Tools in Hadoop

Berikut beberapa tools yang terdapat pada hadoop, yaitu:

### 1. `Spark`

Spark merupakan processing system yang terdistribusi dan bersifat open source, dimana tools ini digunakan untuk melakukan batch processing, streaming analytics, machine learning, graph database, dan ad hoc query.

### 2. `Presto`

Seperti halnya Spark, Presto juga salah satu software yang bersifat open source. Presto sendiri merupakan SQL query engine terdistribusi yang digunakan untuk analisis data ad hoc low-latency.  Dengan Presto inilah, kita dapat memproses data dari sumber yang berbeda-beda, termasuk HDFS dan Amazon S3.

### 3. `Hive`

Hive digunakan untuk MapReduce dengan interface SQL, sehingga tool ini cocok untuk analisis data dalam jumlah yang besar.

### 4. `HBase`

HBase adalah database yang digunakan Amazon S3 dan HDFS. Tool ini dibuat untuk memproses tabel dengan baris dalam jumlah yang sangat banyak.


## Hadoop Advantages

Berikut beberapa kelebihan dari hadoop, yaitu:

### 1. `Fleksibel`

Data bisa disimpan dalam format apapun, baik secara structured maupun unstructured. Hal ini memungkinkan pengguna mengakses data dari sumber manapun dengan tipe apapun.

### 2. `Upgrade kapasitas`

Hadoop merupakan teknologi yang memberikan solusi pada sistem tradisional. Sistem tradisional memiliki data storage yang terbatas, sementara Hadoop bisa ditingkatkan kapasitasnya, sebab framework ini bekerja secara terdistribusi.

### 3. `Ketahanan tinggi`

HDFS merupakan bagian dari ekosistem Hadoop, yang dikenal memiliki ketahanan tinggi dan meminimalkan risiko kegagalan baik software maupun hardware. Meskipun satu node rusak atau mengalami masalah, HDFS bisa menyediakan backup data untuk melanjutkan proses.


## Getting Started

To get started with Hadoop, these are the prerequisites that must be installed:

1. Java 8 (Recommended) / Java 11
   + https://www.oracle.com/id/java/technologies/javase/javase8-archive-downloads.html
3. Hadoop (Kali ini memakai versi 3.2.2)
   + https://archive.apache.org/dist/hadoop/common/
5. Additional Binaries (Sesuaikan versi Hadoop, versi yang dipakai kali ini adalah 3.2.2)
   + https://github.com/styxnanda/winutils

### Details are in the presentation file in the repository Above.

  
