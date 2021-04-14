package com.github.template.service;

import com.github.template.model.db.MaterialGroup;
import com.github.template.repository.DictionaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DictionaryServiceImpl implements DictionaryService {

    private final DictionaryRepository dictionaryRepository;

    @Override
    public Page<MaterialGroup> getAll() {
        return dictionaryRepository.findAll(PageRequest.of(0,5));

    }
}
