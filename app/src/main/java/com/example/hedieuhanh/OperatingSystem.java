package com.example.hedieuhanh;

public class OperatingSystem {
    private String name;
    private String version;
    private String developer;
    private String language;

    public OperatingSystem(String name, String version, String developer, String language) {
        this.name = name;
        this.version = version;
        this.developer = developer;
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
