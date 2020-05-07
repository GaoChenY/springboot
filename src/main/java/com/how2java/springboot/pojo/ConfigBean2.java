package com.how2java.springboot.pojo;

/**
 * @author gaocy6
 * @create 2020-04-30 14:55
 */
public class ConfigBean2 {
    private String configKey;
    private String configValue;
    private String description;

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
