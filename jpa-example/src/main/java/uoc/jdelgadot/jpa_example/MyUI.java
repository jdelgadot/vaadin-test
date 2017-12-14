package uoc.jdelgadot.jpa_example;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

import uoc.jdelgadot.jpa_example.backend.CredentialsService;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SuppressWarnings("serial")
@Theme("mytheme")
@CDIUI("")
public class MyUI extends UI {

	@Inject CredentialsService service;
	@Inject LoginForm form;
	
	
	
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        
 
        setContent(form);
    }
    
    
    @PostConstruct
    void init() {
    		service.loadDemoData();
    }
	
   
}
