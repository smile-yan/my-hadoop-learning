## Spark 的使用（一）

### 下载与解压

如果是使用云服务的话，推荐直接输入以下命令下载（下载到本地再上传太慢了）。

```bash
wget http://mirrors.tuna.tsinghua.edu.cn/apache/spark/spark-2.4.4/spark-2.4.4-bin-hadoop2.7.tgz
tar xf spark-2.4.4-bin-hadoop2.7.tgz
```

### 运行首个项目（使用Idea)

- [下载项目]( https://github.com/smile-yan/spark-simple-demos )
- 导入项目到 Idea
- 打包并上传 (`mvn package`)
- 运行 (`bin/spark-submit demo.jar`)

具体过程[参考]( https://github.com/smile-yan/spark-simple-demos/blob/master/README.md )

 