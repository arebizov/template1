package com.github.template.service;

import com.github.template.model.db.MaterialGroup;
import com.github.template.model.dto.MaterialGroupDto;
import org.springframework.data.domain.Page;

public interface MaterialService {

    Page<MaterialGroup> getAll(Integer page, Integer itemsPerPage);
    MaterialGroupDto addNewMaterial(MaterialGroupDto material);
    MaterialGroupDto editMaterial(MaterialGroupDto material);
    int delete(Long id);

}
