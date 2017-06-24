package com.ol.helper;

import java.io.File;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.struts2.ServletActionContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ol.model.entity.ConfigData;
import com.ol.model.entity.Employee;
import com.ol.model.entity.LetterStatus;
import com.ol.model.entity.LoaLetter;

import com.ol.model.entity.WorkRole;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.ProjectSrv;
import com.ol.model.entity.ProjectInformation;
import com.opensymphony.xwork2.ActionContext;

public class Ulti {

	// nam
	public static boolean isInvalidStrVar(String val, int min, int max){
		boolean ret = true;
		if(val != null){
			val = val.trim();
			if(val.length() <= max || val.length() >= min) ret = false;
		}
		
		return ret;
	}
	
	// nam
	public static boolean isInvalidRights(int requiredLevel) {
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (session.isEmpty())
			return false;

		String curID = session.get("loggedEmpID").toString();

		EmployeeSrv srv = new EmployeeSrv();
		Employee emp = srv.getProfile(curID);
		int curType = emp.getIType();
		System.out.print("---Authen: " + curID + "," + curType);

		boolean ret = (curID.length() < 1) || (curType != requiredLevel);

		if (ret) {
			// clear session
			//session.clear();
		}
		return ret;
	}

	// nam
	public static Date convertToDate(String dDate, String sFormat) {
		Date ret = null;
		try {
			SimpleDateFormat format = new SimpleDateFormat(sFormat);

			java.util.Date tmp = format.parse(dDate);
			ret = new Date(tmp.getTime());
		} catch (Exception ex) {
			ret = null;
		}

		return ret;
	}

	// nam
	public static List<ProjectInformation> getProjectSelectList() {
		ProjectSrv srv = new ProjectSrv();
		return srv.getAllProjectInfomation();
	}

	// nam
	public static List<ProjectInformation> getMyProjectSelectList() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String curID = session.get("loggedEmpID").toString();
		
		ProjectSrv srv = new ProjectSrv();
		return srv.getAllMyProjectInfomation(curID);
	}

	/**
	 * Author: 			DMTuan
	 * Created date: 	05/13/2014
	 * Description: 	Parse XML
	 * Return     :     ConfigData
	 */
	public static ConfigData parseXML(){

		URL url = Thread.currentThread().getContextClassLoader().getResource("/Setting.xml");
		File fXmlFile = new File(url.getPath().replaceAll("%20", " "));
		ConfigData data = new ConfigData();
		HashMap<Integer, String> hashMapType = new HashMap<Integer, String>();
		HashMap<Integer, String> hashMapGroup = new HashMap<Integer, String>();
		try {


			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(fXmlFile);


			//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			Element element = doc.getDocumentElement();

			Element max_loa_day = (Element) element.getElementsByTagName("max_loa_day").item(0);

			data.setMax_loa_day(Integer.parseInt(max_loa_day.getTextContent()));

			//System.out.println(max_loa_day.getTextContent());

			NodeList nType = element.getElementsByTagName("type");

			//System.out.println(nType.getLength() + "-");

			NodeList nElements = nType.item(0).getChildNodes();

			for(int i=0; i < nElements.getLength() ; i++){

				if(nElements.item(i).getNodeType() == Node.ELEMENT_NODE) {

					Element elementary = (Element) nElements.item(i);

					hashMapType.put(Integer.parseInt(nElements.item(i).getTextContent()), elementary.getTagName());

					//System.out.println(elementary.getTagName()+" = "+ nElements.item(i).getTextContent());
				}
			}
			data.setType(hashMapType);

			NodeList nGroup = element.getElementsByTagName("group");

			//System.out.println(nType.getLength() + "-");

			NodeList nElementGroups = nGroup.item(0).getChildNodes();

			for(int i=0; i < nElementGroups.getLength() ; i++){

				if(nElementGroups.item(i).getNodeType() == Node.ELEMENT_NODE) {

					Element elementary = (Element) nElementGroups.item(i);

					hashMapGroup.put(Integer.parseInt(nElementGroups.item(i).getTextContent()), elementary.getTagName());

					//System.out.println(elementary.getTagName()+" = "+ nElementGroups.item(i).getTextContent());
				}
			}

			data.setGroup(hashMapGroup);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}

	/**
	 * 
	 * 
	 * 
	 * Author: Viem Created date: 05/13/2014 Description: Parse XML Return :
	 * ConfigData
	 */
	public static List<LetterStatus> GetLetterStatusByXML() {
		List<LetterStatus> LetterStatus = new ArrayList<LetterStatus>();
		try {

			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/Setting.xml");
			File fXmlFile = new File(url.getPath().replaceAll("%20", " "));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(fXmlFile);
			Element element = doc.getDocumentElement();
			NodeList nType = element.getElementsByTagName("Status");

			for (int temp = 0; temp < nType.getLength(); temp++) {

				Node nNode = nType.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					LetterStatus Status = new LetterStatus();
					Status.setIID(Integer.parseInt(eElement
							.getElementsByTagName("id").item(0)
							.getTextContent()));
					Status.setSStatus(eElement.getElementsByTagName("value")
							.item(0).getTextContent());
					LetterStatus.add(Status);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return LetterStatus;
	}

	public static List<WorkRole> GetWorkRoleByXML() {
		List<WorkRole> WorkRole = new ArrayList<WorkRole>();
		try {

			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/Setting.xml");
			File fXmlFile = new File(url.getPath().replaceAll("%20", " "));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(fXmlFile);
			Element element = doc.getDocumentElement();
			NodeList nType = element.getElementsByTagName("Role");

			for (int temp = 0; temp < nType.getLength(); temp++) {

				Node nNode = nType.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					WorkRole Role = new WorkRole();
					Role.setIID(Integer.parseInt(eElement
							.getElementsByTagName("id").item(0)
							.getTextContent()));
					Role.setSRoleTitle((eElement.getElementsByTagName("value")
							.item(0).getTextContent()));
					WorkRole.add(Role);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return WorkRole;
	}

	// toan
	public static List<LetterStatus> GetLetterActionByXML() {
		List<LetterStatus> LetterAction = new ArrayList<LetterStatus>();
		try {

			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/Setting.xml");
			File fXmlFile = new File(url.getPath().replaceAll("%20", " "));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(fXmlFile);
			Element element = doc.getDocumentElement();
			NodeList nType = element.getElementsByTagName("Action");

			for (int temp = 0; temp < nType.getLength(); temp++) {

				Node nNode = nType.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					LetterStatus Status = new LetterStatus();
					Status.setIID(Integer.parseInt(eElement
							.getElementsByTagName("id").item(0)
							.getTextContent()));
					Status.setSStatus(eElement.getElementsByTagName("value")
							.item(0).getTextContent());

					LetterAction.add(Status);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return LetterAction;
	}

	public static ConfigData getMailServerInformation() {
		URL url = Thread.currentThread().getContextClassLoader()
				.getResource("/Setting.xml");
		File fXmlFile = new File(url.getPath().replaceAll("%20", " "));

		ConfigData data = new ConfigData();

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(fXmlFile);

			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			Element element = doc.getDocumentElement();

			NodeList nType = element.getElementsByTagName("MailServer");

			System.out.println(nType.getLength() + "-");

			Node nNode = nType.item(0);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;
				data.setHost(eElement.getElementsByTagName("Host").item(0)
						.getTextContent());
				data.setPort(eElement.getElementsByTagName("Port").item(0)
						.getTextContent());
				data.setMailFrom(eElement.getElementsByTagName("MailFrom")
						.item(0).getTextContent());
				data.setPassWord(eElement.getElementsByTagName("PassWord")
						.item(0).getTextContent());
				// System.out.print("HOST" +
				// eElement.getElementsByTagName("Host").item(0).getTextContent());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}

	/**
	 * Author: DMTuan Created date: 05/13/2014 Description: Random Password
	 * Return : password
	 */
	public static String randomPassword() {

		final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		final int N = alphabet.length();

		Random r = new Random();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			builder.append(alphabet.charAt(r.nextInt(N)));
		}

		return builder.toString();
	}

	/**
	 * Author: DMTuan Created date: 05/13/2014 Description: Send HTML Email
	 * 
	 * @throws javax.mail.MessagingException
	 * 
	 */
	public static void sendHtmlEmail(String toAddress, String subject,
			String message) throws MessagingException,
			javax.mail.MessagingException {

		ConfigData data = Ulti.getMailServerInformation();

		String hostName = data.getHost();
		String port = data.getPort();
		final String mailFrom = data.getMailFrom();
		final String passWord = data.getPassWord();

		System.out.println("HOST " + data.getHost());
		System.out.println(data.getPort());
		System.out.println(data.getMailFrom());
		System.out.println(data.getPassWord());

		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", hostName);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// creates a new session with an authenticator
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailFrom, passWord);
			}
		};

		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };

		Session session = Session.getInstance(properties, auth);

		// creates a new e-mail message
		MimeMessage msg = new MimeMessage(session);

		// from email
		msg.setFrom(new InternetAddress(mailFrom));

		// to email
		msg.setRecipients(Message.RecipientType.TO, toAddresses);

		// subject of email
		msg.setSubject(subject, "UTF-8");

		// msg.setSentDate(new Date());

		// set plain text message
		msg.setContent(message, "text/html; charset=utf-8");

		// sends the e-mail
		Transport.send(msg);
	}

	/**
	 * Author: DMTuan Created date: 05/13/2014 Description: Create Email Message
	 * Return : Message
	 * 
	 */
	public static String createEmailMessage(String sID, String randomPwd) {

		StringBuilder message = new StringBuilder();
		message.append("<i>Email from Delivery Viet Nam Issue tracker system.</i><br/>");
		message.append("<i>Please do not reply to this address!!!</i><br/>");
		message.append("------------------------------------------------------<br/><br/>");
		message.append("<p>Your account information:</p><br/>");
		message.append("<ul><li>Login: ");
		message.append(sID + "</li><li>Password: ");
		message.append(randomPwd + "</li></ul><br/>");
		message.append("<p>Sign in: <a href='http://192.168.0.125/login'>http://192.168.0.125/login</a></p><br/>");
		message.append("<hr/><br/>");
		return message.toString();
	}

	// toan
	public static String createLoaNotificationMessage(LoaLetter loa) {

		StringBuilder message = new StringBuilder();
		message.append("<i>Email from Delivery Viet Nam Issue tracker system.</i><br/>");
		message.append("<i>Please do not reply to this address!!!</i><br/>");
		message.append("------------------------------------------------------<br/><br/>");
		message.append("<p>Yêu cầu duyệt đơn</p><br/>");
		message.append("<ul><li>Mã đơn: " + loa.getIID() + "</li><br/>");
		message.append("<li>Nhân viên: " + loa.getSEmpID() + "</li><br/>");
		message.append("</ul><br/>");
		message.append("<p>Duyệt: <a href='http://192.168.0.125/login?loaID="
				+ loa.getIID() + "'>Tới trang duyệt đơn</a></p><br/>");
		message.append("<hr/><br/>");
		return message.toString();
	}
}
