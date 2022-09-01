package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Glycan;
import com.example.demo.service.GlycanService;

import java.io.IOException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller // This means that this class is a Controller
public class GlycanController {

	@Autowired
	// This means to get the bean which is auto-generated by Spring
	// We will use an glycanService for each
	GlycanService glycanService;

	//	display list of glycans
	@GetMapping("/MySQLTableForGlycansAndCCS")
	// This means that this method will be executed when user sends GET Requests to "/"
	// In our case, "http://localhost:8080/"
	public String viewHomePage(Model model) {

		//	We can use this attribute "listEmployees" to perform server-side rendering of the HTML with using Thymeleaf.
		//	We set all glycans data to "listEmployees"
		model.addAttribute("listGlycans", glycanService.getAllGlycans());

		//		shows the index.html template:
		return "index";
	}

	//	showNewEmployeeForm
	@GetMapping("/showNewGlycanForm")
	// This means that this method will be executed when user sends GET Requests to "/showNewEmployeeForm"
	// In our case,  "http://localhost:8080/showNewEmployeeForm"
	public String showNewGlycanForm(Model model) {
		Glycan glycan = new Glycan();

		// We can use this attribute "glycan" to perform server-side rendering of the HTML with using Thymeleaf.
		model.addAttribute("glycan", glycan);

		//	shows the new_glycan.html template:
		return "new_glycan";
	}

	//	add an glycan - from codejava net tutorial start here for image upload.
        @PostMapping("/saveGlycan")
	// This means that this method will be executed when user sends POST Requests to "/saveEmployee"
	// In our case, "http://localhost:8080/saveEmployee"
	public String saveGlycan(@ModelAttribute("glycan") Glycan glycan,
            @RequestParam("image") MultipartFile multipartFile) throws IOException {
		//	@ModelAttribute  binds the object called "glycan" of request body from the POST request into the glycan parameter of the saveEmployee() method.
                
            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
            glycan.setGlycanPhoto(fileName);
          // need to user SavedUser? see https://www.codejava.net/frameworks/spring-boot/spring-boot-file-upload-tutorial
 
            String uploadDir = "/home/aryeh/db_images" + "/" + glycan.getId();
            //uploads to a directory with ID name inside my db_images folder.
            
            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
            glycanService.saveGlycan(glycan); 
           
		// after save the glycan data to database, redirect to "/"
		return "redirect:/MySQLTableForGlycansAndCCS";
	}
// return "redirect:/MySQLTableForGlycansAndCCS";
	//	show update form
	@GetMapping("/showGlycanFormForUpdate/{id}")
	// This means that this method will be executed when user sends GET Requests to "/showFormForUpdate/{glycan's id}"
	// In our case, "http://localhost:8080/showFormForUpdate/{glycan's id}"
	public String showGlycanUpdateForm(@PathVariable Long id, Model model) {
		// @PathVariable binds the {id} which the path of GET request contains into the id parameter of showUpdateForm() method.

		Glycan glycan = glycanService.getGlycanById(id);

		//	We can use this attribute "glycan" to perform server-side rendering of the HTML with using Thymeleaf.
		//	We set glycan data to "glycan"
		model.addAttribute("glycan", glycan);

		//	shows the update_glycan.html template:
		return "update_glycan";
	}

	//	delete the glycan by id
	@GetMapping("/delete/{id}")
	// This means that this method will be executed when user sends GET Requests to "/delete/{glycan's id}"
	//	In our case, "http://localhost:8080/delete/{glycan's id}"
	public String deleteGlycanById(@PathVariable Long id, Model model) {
		glycanService.deleteGlycanById(id);

	//	after delete the glycan data from database, redirect to "/"
		return "redirect:/MySQLTableForGlycansAndCCS";
	}
}
