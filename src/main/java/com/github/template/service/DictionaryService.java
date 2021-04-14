package com.github.template.service;

import com.github.template.model.db.MaterialGroup;
import org.springframework.data.domain.Page;

public interface DictionaryService {

    Page<MaterialGroup> getAll();

}
