## Hadoop 的安装与配置

### 安装环境

* 配置好网络的虚拟机（或云服务器），系统是CentOS 7

### 安装 openjdk

```bash
$ sudo yum -y install java-1.8.0-openjdk
```

### 配置环境变量

编辑 `/etc/profile` 文件，在其后面添加内容如下：

```bash
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.222.b10-0.el7_6.x86_64/jre
export CLASSPATH=${JAVA_HOME}/lib
export PATH=${JAVA_HOME}/bin:$PATH
```

输入source命令，让配置文件生效。

```bash
$ source /etc/profile
```

### 启动首个Hadoop

```bash
$ mkdir input
$ cp etc/hadoop/*.xml input
$ bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.0.jar grep input output 'dfs[a-z.]+'
$ cat output/*
```

