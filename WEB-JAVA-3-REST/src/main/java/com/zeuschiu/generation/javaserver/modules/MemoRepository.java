package com.zeuschiu.generation.javaserver.modules;

import org.springframework.data.repository.CrudRepository;

public interface MemoRepository extends CrudRepository<Memo, Long> {
}
