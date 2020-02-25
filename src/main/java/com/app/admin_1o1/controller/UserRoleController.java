package com.app.admin_1o1.controller;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.RoleModel;
import com.app.admin_1o1.repo.Role;
import com.app.admin_1o1.repo.RoleRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/role")
@Api(value = "1o1_admin", description = "CRUD operations on role")
@CrossOrigin
public class UserRoleController {

	private JavaMailSender javaMailSender;

	private final RoleRepository roleRepository;
	private final Role role;

	public UserRoleController(RoleRepository roleRepository, Role role,JavaMailSender javaMailSender) {
		this.roleRepository = roleRepository;
		this.role = role;
		this.javaMailSender = javaMailSender;
	}

	// Save role
	@RequestMapping(value = "", method = RequestMethod.POST)
	public RoleModel addRole(@RequestBody RoleModel roleModel) {
		return roleRepository.save(roleModel);
	}

	// Get roles
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<RoleModel> getRoles() {
		return roleRepository.findAll();
	}

	// Get role
	@RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
	public RoleModel getRoles(@PathVariable String roleId) {
		return role.getRole(roleId);
	}

	// Send mail
	@RequestMapping(value = "/mail", method = RequestMethod.POST)
	public void sendMail(@RequestBody String mailId) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mailId);
		//String url = "http://localhost:4200/#/register";
		String url = "https://1o1fitness.com/Admin1o1/#/register";
		String html = "Hi, An invitation received from 1o1_application plase click on following link.."+url;
		msg.setSubject("Invitation from 1o1");
		msg.setText(html);
		msg.setSentDate(new Date());
		javaMailSender.send(msg);
	}
}
