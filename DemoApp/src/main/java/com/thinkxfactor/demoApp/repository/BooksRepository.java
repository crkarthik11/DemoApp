package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.Book;
import com.thinkxfactor.demoApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book,Long> {
}


