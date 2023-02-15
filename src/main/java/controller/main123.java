package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
import dto.Patient;
@WebServlet("/abc")
public class main123 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String	s1=req.getParameter("patientid");
	String	s2=req.getParameter("patientname");
	String	s3=req.getParameter("patientph");
	String	s4=req.getParameter("bloodgroup");
 
	
	Patient patient=new Patient();
	
	patient.setPatientid(s1);
	patient.setPatientname(s2);
	patient.setPatientph(s3);
	patient.setBloodgroup(s4);
	
	
	
	Patientdao patientdao=new Patientdao();
	patientdao.insert(patient);
	}
	

}
