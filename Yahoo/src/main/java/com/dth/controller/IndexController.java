/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dth.controller;

import javax.persistence.Query;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dinht
 */
@Controller
public class IndexController {

    @Autowired
    private LocalSessionFactoryBean factory;

    @RequestMapping("/")
    @Transactional
    public String index(Model model) {
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User ");
        model.addAttribute("USER", q.getFirstResult());
        return "index";
    }
}
