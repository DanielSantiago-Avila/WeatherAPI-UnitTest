package com.api.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.api.weather.service.WeatherReportService;
import com.api.weather.data.WeatherReport;

@RestController
@RequestMapping("/v1/api")
public class WeatherReportController {

    private final WeatherReportService weatherReportService;

    public WeatherReportController(WeatherReportService weatherReportService) {
        this.weatherReportService = weatherReportService;
    }

    //Sample request: http://localhost:8080/v1/api/weather-report?latitude=37.8267&longitude=-122.4233

    @GetMapping("/weather-report")
    public WeatherReport getWeatherReport(@RequestParam double latitude, @RequestParam double longitude) {
        return weatherReportService.getWeatherReport(latitude, longitude);
    }

}
