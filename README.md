# Bigdata-Flink-Java
## Team Members
<table>
  <tr>
    <td align="center"><a href="https://github.com/harishThadka"><img src="https://avatars.githubusercontent.com/u/60013824?s=400&u=4519aa7212ab3cef634b23bec1c89f1b76c261ed&v=4" width="100px;" alt=""/><br /><sub><b>Harish Thadka</b></sub></a><br /><a href="https://github.com/harishThadka" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Vikas2004"><img src="https://avatars.githubusercontent.com/u/60014528?s=400&u=1d1b38ceb231dedb3dc4d9de6d41bd1603eb9590&v=4" width="100px;" alt=""/><br /><sub><b>Vikas Baswapuram</b></sub></a><br /><a href="https://github.com/Vikas2004" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/rohith0696"><img src="https://avatars.githubusercontent.com/u/60017598?s=400&u=95bb28cbe0422b53dcc3edfdb593b6e1b463fd06&v=4" width="100px;" alt=""/><br /><sub><b>Rohith Chittimalla</b></sub></a><br /><a href="https://github.com/rohith0696" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Dixith1196"><img src="https://avatars.githubusercontent.com/u/60023341?s=400&u=fb45357be42f7f2b97401c4e7f6e607b781c8f8b&v=4" width="100px;" alt=""/><br /><sub><b>Deekshith Maram</b></sub></a><br /><a href="https://github.com/Dixith1196" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/sumanthreddy1233"><img src="https://avatars.githubusercontent.com/u/60023332?s=400&u=276e2972686007fe8fb19592ff5c17b1187120cd&v=4" width="100px;" alt=""/><br /><sub><b>Sumanth Reddy Naidu</b></sub></a><br /><a href="https://github.com/sumanthreddy1233" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Puneeth159"><img src="https://avatars.githubusercontent.com/u/60018781?s=400&u=eead3b33a4143e52a8c4b931359c2c69d0138fa5&v=4" width="100px;" alt=""/><br /><sub><b>Puneeth Annam</b></sub></a><br /><a href="https://github.com/Puneeth159" title="Code">💻</a></td>
    </tr>
`   </table>

## What is Apache Flink?🤔
### Introduction:
- Apache Flink is an open-source, unified stream-processing and batch-processing framework developed by the Apache Software Foundation
- The core of Apache Flink is a distributed streaming data-flow engine written in Java, Scala and python
- Flink provides a high-throughput, low-latency streaming engine
- Flink offers substantially higher processing speeds to spark and hadoop.

### Flink Architecture
![](flink_arch.jpg)
### Prerequisites
- [Apache Flink](https://www.apache.org/dyn/closer.lua/flink/flink-1.12.1/flink-1.12.1-bin-scala_2.11.tgz)
- [Java 8](https://www.java.com/en/download/) or later versions
- [IntelliJ IDE](https://www.jetbrains.com/idea/download/#section=windows) or [Eclipse IDE](https://www.eclipse.org/ide/)
- [NetCat](https://nmap.org/download.html)
### Features of Apache Flink
- It has a streaming processor, which can run both batch and stream programs.
- APIs available in Java, Scala and Python.
- Can easily integrate with Apache Hadoop, Apache MapReduce, Apache Spark, HBase and other big data tools.
- Provides Graph Processing, Machine Learning, Complex Event Processing libraries.
### More about Apache flink
- https://en.wikipedia.org/wiki/Apache_Flink
- https://docs.cloudera.com/csa/1.2.0/flink-overview/topics/csa-flink-overview.html
- https://blogs.oracle.com/javamagazine/streaming-analytics-with-java-and-apache-flink
- https://www.tutorialspoint.com/apache_flink/apache_flink_quick_guide.htm
## What is Java?🤔
### Introduction:
- Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.
- Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture
-Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. 
- According to Oracle, 3 billion devices run on Java
### More about Apache Flink with Java:
- https://ci.apache.org/projects/flink/flink-docs-release-1.2/quickstart/java_api_quickstart.html
- https://www.baeldung.com/apache-flink
### Team members demonstration Topics:

- Vikas Baswarpuram: WordCount Apache Flink Application
- Harish Thaka: Finding Prime numbers on Apache Flink
- Rohith Chittimala: Apache Flink Application on palindrome
- Deekshith Maram:
- Sumanth reddy naidu:
- Puneeth Annam: Sorting list on Apache Flink
## Vikas Baswapuram:
### Demonstration Topic : Introduction to Flink and Getting started with Java and demonstrating the WordCount:

### Introduction to Flink:

-  Apache Flink can be [downloaded](https://www.apache.org/dyn/closer.lua/flink/flink-1.12.1/flink-1.12.1-bin-scala_2.11.tgz) here.

- You will have to download the suggested mirror site for the download. Image is provided below for the reference.

![](Apache_download.PNG)

- After the file is downloaded untar the file. This can be done using either ```powershell``` or extracting the files using ```7-zip```.

- The command for powershell is as follows: ```tar -xvf <filename.tgz>```.

- My powershell command would be ```tar -xvf flink-1.12.1-bin-scala_2.11.tgz```.

- If you are using the 7-zip then here is the reference image to extract the file to the location.(Preferably C drive).
![](7-zip_extract.PNG)

- Set up system variable ```FLINK_HOME``` and configure it to the ```C:\flink-1.11.2``` folder location and configure the path accordingly.


### Using Flink on Maven:

- To demonstrate the maven project I am using the ```eclipse IDE```.

- Steps to start the maven project. ``` Open eclipse IDE -> File -> New -> Other -> Maven -> Maven Project```.

- After using the above steps click on next and you will get a new window where you have to select the ```Group Id```, ```Artifact Id```, ```Version```. Please select them as shown in the below image. This can be done just by typing in the Filter field.
![](Maven_startup.PNG)

-  Then you will be directed to another window which looks like the image below. You can choose the Package name of your choice. Also make sure to check if the other fields are correct.
![](Project_Package_Name.PNG)

- Once the project is created go to the target folder of the maven project check the pom.xml file where you ca find the details as shown below.
![](pom_XML.PNG)

- Check the dependencies under the tag dependencies where all the flink dependencies are auto generated with the mave project. Here is an image of the dependencies of my project.
![](dependencies.PNG)

```Powershell
If you try to add a new class it might show you some error stating "This is not a java source folder". 
To overcome this issue right click on the project and select Properties, click on the Project Facets and then click on "Convert to faceted form" and then select java, Apply and close you will now be able to add a new java class file.
```
- The above step is to be followed if there is an error else ignore.

- Then run the project selecting the maven test option to build the maven dependencies.

- Start coding and write the apis in the java file to do the desired operation.

### Resources:
- https://mycupoftea00.medium.com/how-to-run-apache-flink-locally-b20735523ee1
- https://ci.apache.org/projects/flink/flink-docs-release-1.2/quickstart/setup_quickstart.html
- https://www.toolsqa.com/java/maven/create-new-maven-project-eclipse/

## Harish Thadka:
### Demonstration Topic : Finding Prime numbers on Apache Flink with java

## Rohith Chittimala: 
### Demonstration Topic : Apache Flink Application on palindrome


## Deekshith Maram:
### Demonstration Topic : 

## Sumanth Reddy:
### Demonstration Topic : 

## Puneeth Annam:
### Demonstration Topic : Sorting list on Apache Flink