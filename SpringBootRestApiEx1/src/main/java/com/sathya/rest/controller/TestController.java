package com.sathya.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@GetMapping("/test")
	public String wish()
	{
		return "Hiii!!";
	}
	
	@GetMapping("/wish/{name}")
	public String greet(@PathVariable String name)
	{
		return "Good Morning "+name;
	}
	
	@GetMapping("/info")
	public String info(@RequestParam String name)
	{
		return name+" is good";
	}
	
	List<Book> books=List.of(new Book(1001,"Java","James Gosling",600),
			new Book(1002,"Spring","Rod Johnson",578));
	
	@GetMapping("/getbook")
	public Book getbook()
	{
		return new Book(101,"Java","James",490);
	}
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return books;
	}
	
	@GetMapping("/book/{isbn}")
	public Book getBook(@PathVariable int isbn)
	{
		Book book=books.stream()
				.filter(b->b.getIsbn()==isbn)
				.findFirst()
				.get();
		return book;
	}

}
