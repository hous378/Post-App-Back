package tn.biat.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.biat.domain.Post;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PostRestController {

	private static Map<Integer, Post> data;

	static { // on peut enlever static : curly brackets
		data = new HashMap<>();
		data.put(111, new Post(111, "Title 111", "Body 111"));
		data.put(222, new Post(222, "Title 222", "Body 222"));
		data.put(333, new Post(333, "Title 333", "Body 333"));
	}
	 
//	 public PostRestController() {
//		 data = new HashMap<>();
//			data.put(111, new Post(111, "Title 111", "Body 111"));
//			data.put(222, new Post(222, "Title 222", "Body 222"));
//			data.put(333, new Post(333, "Title 333", "Body 333"));
//	 }
	 
	
	@GetMapping(path="/api/posts")
	public List<Post> findall() {
		return new ArrayList<Post>(data.values());
	}

}
