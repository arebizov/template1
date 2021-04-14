package com.github.template.service;

import com.github.template.model.db.MaterialGroup;
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
}
