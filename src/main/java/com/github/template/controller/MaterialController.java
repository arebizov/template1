package com.github.template.controller;

import com.github.template.model.db.MaterialGroup;
import com.github.template.service.MaterialService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/materials")
public class MaterialController {

    private final MaterialService dictionaryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<MaterialGroup>> getAllDictionaries(
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "50") Integer itemsPerPage
    )
    {
        return ResponseEntity.ok(dictionaryService.getAll( page, itemsPerPage));
    }
}
