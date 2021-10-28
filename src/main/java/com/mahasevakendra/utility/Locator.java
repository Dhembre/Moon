package com.mahasevakendra.utility;
import static com.mahasevakendra.utility.PropertiesFile.getObject;//it is use to import static membar of any class  
import org.bouncycastle.util.Properties;

public class Locator {
public static final String SIGNUP_FULLNAME=getObject("signup.fullname");//No need to write PropertiesFile
public static final String SIGNUP_COMPANYNAME=getObject("signup.companyname");
public static final String SIGNUP_EMAIL=getObject("signup.email");
public static final String SIGNUP_CONTACT=getObject("signup.contact");

public static final String SIGNUP_PASSWORD=getObject("signup.password");
public static final String SIGNUP_IAMNOTROBOT=getObject("signup.iamnotrobot");
public static final String SIGNUP_SIGNUPBTN=getObject("signup.signupbtn");
}
