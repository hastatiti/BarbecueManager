package com.security;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/email")
@SessionAttributes("barbecue")
public class EmailController {
	 @Autowired
	    private JavaMailSender mailSender;
	
	 //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	 @RequestMapping("/emailForm")
		public String emailForm(@ModelAttribute Email email ) {
			System.out.println("Email form displayed");
			return "emailForm";	} 
	
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	 @RequestMapping("/sendEmail")
		public String sendEmail(@ModelAttribute Email email,HttpServletRequest request,SessionStatus status,Model model,Barbecue barbecue) throws MessagingException {
			System.out.println("Sending email");
			 	String recipientAddress = request.getParameter("recipient");
			 	String[] recipients = recipientAddress.split(",");
		        String subject = request.getParameter("subject");
		        String message = request.getParameter("message");
		        model.addAttribute("barbecue", barbecue);
		        String add = message.concat(barbecue.toString());

		        for (String to : recipients) {
		        //mimeMessage
		        MimeMessage myMessage = mailSender.createMimeMessage();
		        myMessage.setRecipients(Message.RecipientType.TO,  InternetAddress.parse(to));
		        
		        MimeMessageHelper helper = new MimeMessageHelper(myMessage, true);
		        helper.setTo(to);
		        helper.setSubject(subject);
		        helper.setText(add);
		        mailSender.send(myMessage);
		     
		        status.setComplete();
		        
		        }
			return "emailForm";	} 
}
