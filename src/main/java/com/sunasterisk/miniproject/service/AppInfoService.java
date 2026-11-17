package com.sunasterisk.miniproject.service;

import com.sunasterisk.miniproject.config.AppInfoProperties;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class AppInfoService {

    private final AppInfoProperties appInfoProperties;

    public AppInfoService(AppInfoProperties appInfoProperties) {
        this.appInfoProperties = appInfoProperties;
    }

    public Map<String, String> getApplicationInfo() {
        return Map.of(
                "name", appInfoProperties.getName(),
                "version", appInfoProperties.getVersion(),
                "description", appInfoProperties.getDescription(),
                "status", "UP"
        );
    }
}
