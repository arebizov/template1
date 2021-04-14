package com.github.template.repository;

import com.github.template.model.db.MaterialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends JpaRepository<MaterialGroup, Long> {

}
