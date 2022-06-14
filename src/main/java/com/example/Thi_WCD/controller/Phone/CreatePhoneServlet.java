package com.example.Thi_WCD.controller.Phone;

import com.example.Thi_WCD.entity.Phone;
import com.example.Thi_WCD.model.MySqlPhoneModel;
import com.example.Thi_WCD.model.PhoneModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatePhoneServlet extends HttpServlet {
    private PhoneModel phoneModel;

    @Override
    public void init() throws ServletException {
        phoneModel = new MySqlPhoneModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addphone.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String name = req.getParameter("name");
        Phone phone = new Phone(name);
            req.setAttribute("name", name);
            req.getRequestDispatcher("/create.jsp").forward(req, resp);
        }
    }
