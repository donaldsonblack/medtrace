package dev.donaldsonblack.medtrace.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.donaldsonblack.medtrace.backend.model.ChecklistTemplate;
import dev.donaldsonblack.medtrace.backend.service.ChecklistTemplateService;

@RestController
@RequestMapping("/api/checklist-templates")
public class ChecklistTemplateController {
    @Autowired
    private ChecklistTemplateService checklistTemplateService;

    @GetMapping("/all")
    public List<ChecklistTemplate> getAllRecords() {
        return checklistTemplateService.getAllRecords();
    }
}