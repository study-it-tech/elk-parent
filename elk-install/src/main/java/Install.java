/**
 * Created by Janita on 2017-05-21 17:46
 */
public class Install {

    /**
     *  启动三个软件
     *
     *  docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e ES_JAVA_OPTS="-Xms512m -Xmx512m" hub.c.163.com/library/elasticsearch
     *
     *  docker run --name kibana -e ELASTICSEARCH_URL=http://120.77.253.88:9200 -p 5601:5601 -d hub.c.163.com/library/kibana
     *
     *  docker run  -d -v /zbmatsu/logstash:/config-dir -p 3456:3456 hub.c.163.com/library/logstash logstash -f /config-dir/logstash.conf
     *
     */


    /**
     *
     * docker ps -a
     *
     * 列出有docker容器中所有的程序
     *
     * docker stop + CONTAINER ID
     * 关闭某个程序
     *
     * docker start + CONTAINER ID
     * 打开某个程序
     *
     * docker images
     * 列出docker容器中所用的images
     *
     */
}