package com.github.template.controller;

import com.github.template.model.db.MaterialGroup;
import com.github.template.model.dto.MaterialGroupDto;
import com.github.template.service.MaterialService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/materials")
public class MaterialController {

    private final MaterialService materialService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<MaterialGroup>> getAllDictionaries(
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "50") Integer itemsPerPage
    )
    {
        return ResponseEntity.ok(materialService.getAll( page, itemsPerPage));
    }
    @PostMapping
    public ResponseEntity<MaterialGroupDto> createNewMaterial (@RequestBody MaterialGroupDto material){
        return ResponseEntity.ok(materialService.addNewMaterial( material ));
    }
   @PutMapping
   public ResponseEntity<MaterialGroupDto> updateMaterial (@RequestBody MaterialGroupDto material) {
        return ResponseEntity.ok(materialService.editMaterial( material ));
    }
//    @DeleteMapping
//   public ResponseEntity<MaterialGroup> deleteMaterial (@RequestBody MaterialGroupDto material){
//       return ResponseEntity.ok(materialService.delete());
//   }
}
