/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.domain.Glycan;
import com.example.demo.repository.GlycanRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aryeh
 */
@RestController
public class BulkLoadGlycanFragment {
@Autowired
GlycanRepository glycanRepository;

    @GetMapping("/saveAllGlycans")
    public ModelAndView insertGlycans(ModelMap model) {        
        Glycan c1 = new Glycan("3952", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c2 = new Glycan("4659", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c3 = new Glycan("5081", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c4 = new Glycan("5267", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c5 = new Glycan("5577", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c6 = new Glycan("5897", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c7 = new Glycan("1413", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c8 = new Glycan("1994", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c9 = new Glycan("635", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c10 = new Glycan("636", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c11 = new Glycan("fragment1", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c12 = new Glycan("fragment2", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c13 = new Glycan("1413fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c14 = new Glycan("1413fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c15 = new Glycan("11697fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c16 = new Glycan("11697fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c17 = new Glycan("13677fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c18 = new Glycan("13677fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c19 = new Glycan("13684fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c20 = new Glycan("13693fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c21 = new Glycan("13693fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c22 = new Glycan("27261fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c23 = new Glycan("27267fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c24 = new Glycan("27267fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c25 = new Glycan("27392fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c26 = new Glycan("27392fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c27 = new Glycan("27644fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c28 = new Glycan("27644fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c29 = new Glycan("27858fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c30 = new Glycan("27858fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c31 = new Glycan("27961fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c32 = new Glycan("27961fragmentB", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c33 = new Glycan("27961fragmentC", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c34 = new Glycan("27961fragmentD", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        Glycan c35 = new Glycan("27261-fragmentA", "242.3827", "100", "1462.544433908", "887.8569", "898.8521", "759");
        List<Glycan> glycans = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35);
        glycanRepository.saveAll(glycans);
        return new ModelAndView("redirect:/MySQLTableForGlycansAndCCS", model);
    }






}
 
