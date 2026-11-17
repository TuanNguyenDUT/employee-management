package com.sunasterisk.miniproject.controller;

import com.sunasterisk.miniproject.service.AppInfoService;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HomeRestController {

    private final AppInfoService appInfoService;

    public HomeRestController(AppInfoService appInfoService) {
        this.appInfoService = appInfoService;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(appInfoService.getApplicationInfo());
    }
}
