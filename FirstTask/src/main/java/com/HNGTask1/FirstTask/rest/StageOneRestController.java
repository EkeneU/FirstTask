package com.HNGTask1.FirstTask.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stageone")
public class StageOneRestController {

    StageOneObject stageOneObject = new StageOneObject();

    @GetMapping("/slack_name/track")
    public StageOneObject getSlack_name() {
        return new StageOneObject("ekene uzodinma", "backend",
                "https://github.com/EkeneU/FirstTask/blob/master/FirstTask/src/main/java/com/HNGTask1/FirstTask/FirstTaskApplication.java",
                "https://github.com/EkeneU/FirstTask", "200",
                stageOneObject.getCurrent_day(), stageOneObject.getUtc_time());
    }
}
