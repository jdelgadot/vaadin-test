package uoc.jdelgadot.jpa_example;

import javax.inject.Inject;

import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

import uoc.jdelgadot.jpa_example.backend.CredentialsService;

@SuppressWarnings("serial")
public class LoginForm extends FormLayout {

	@Inject CredentialsService service;
	private TextField user = new TextField();
	private PasswordField pass = new PasswordField();
	private Button button = new Button("Login");
	private Label label = new Label();
	
	public LoginForm() {
		user.setPlaceholder("user");
		pass.setPlaceholder("password");
		
		
		button.addClickListener(e -> {
			if( service.isValid(user.getValue())) {
				label.setValue("Login confirm!");
			}else {
				label.setValue("Usuario o contraseña no válidos");
			}
				
		});
		
		addComponents(user, pass, button, label);
		
		
	}
	
	
	
	
}
