package com.example.config;

import com.example.config.util.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:custom.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties("custom")
public class YmlConfig {

    private String name;

    private List<Source> sources = new ArrayList<>();

    private List<Route> routes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "YmlConfig{" +
                "name='" + name + '\'' +
                ", sources=" + sources +
                ", routes=" + routes +
                '}';
    }

    public static class Source {

        private String sourceId;
        private String username;
        private String password;
        private String host;
        private Integer port;
        private String virtualHost;

        public String getSourceId() {
            return sourceId;
        }

        public void setSourceId(String sourceId) {
            this.sourceId = sourceId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getVirtualHost() {
            return virtualHost;
        }

        public void setVirtualHost(String virtualHost) {
            this.virtualHost = virtualHost;
        }

        @Override
        public String toString() {
            return "Source{" +
                    "sourceId='" + sourceId + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", host='" + host + '\'' +
                    ", port=" + port +
                    ", virtualHost='" + virtualHost + '\'' +
                    '}';
        }
    }

    public static class Route {

        private String type;
        private String origin;
        private List<String> destination;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public List<String> getDestination() {
            return destination;
        }

        public void setDestination(List<String> destination) {
            this.destination = destination;
        }

        @Override
        public String toString() {
            return "Route{" +
                    "type='" + type + '\'' +
                    ", origin='" + origin + '\'' +
                    ", destination=" + destination +
                    '}';
        }
    }
}
