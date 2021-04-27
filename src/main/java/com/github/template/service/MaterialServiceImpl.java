package com.github.template.service;

import com.github.template.model.db.MaterialGroup;
import com.github.template.model.dto.MaterialGroupDto;
import com.github.template.repository.MaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository materialRepository;

    @Override
    public Page<MaterialGroup> getAll(Integer page, Integer itemsPerPage) {
        return materialRepository.findAll(PageRequest.of(page, itemsPerPage));

    }

    @Override
    public MaterialGroupDto addNewMaterial(MaterialGroupDto material) {
        MaterialGroup newMaterial = new MaterialGroup();
        newMaterial.setName( material.getName() );
        newMaterial.setGroup( material.getGroup() );
        newMaterial.setId( material.getId() );
        materialRepository.save(newMaterial);
        return material;

    }

    @Override
    public MaterialGroupDto editMaterial(MaterialGroupDto material) {
        MaterialGroup materialGroup= materialRepository.getOne( material.getId() );
        materialGroup.setGroup( material.getGroup() );
        materialGroup.setName( material.getName() );
        materialRepository.save(materialGroup);
        return material;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
