/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.perpustakaan.service;

import com.polstat.perpustakaan.dto.BookDto;
import java.util.List;

/**
 *
 * @author seizr
 */
public interface BookService {

    public void createBook(BookDto bookDto);

    public List<BookDto> getBooks();
    
    public List<BookDto> search(String book);
}
