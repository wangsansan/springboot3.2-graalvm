### 项目介绍
本项目是一个利用graalvm编译运行Springboot3.2的项目；
顺便测试了Java21的虚拟线程功能
### 运行步骤
1. 需要在系统里配置GRAALVM_HOME，本示例使用的是21-graal(通过sdkman下载的)
2. 本地打包成可运行文件，使用命令
   ```mvn native:compile -Pnative```