package br.com.curso.jsf.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("meuValidador")
public class MeuValidador implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println("MEU VALIDADOR VALIDANDO: " + value);
		throw new ValidatorException(new FacesMessage("Falha no Validador."));
		
	}
	

}
