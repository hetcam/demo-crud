/**
 * 
 */
package com.crud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CrudController {
	
	
	@RequestMapping("/")
    public String index() {
        // Return the name of the HTML (file) view.
        return "index";
    }

}
