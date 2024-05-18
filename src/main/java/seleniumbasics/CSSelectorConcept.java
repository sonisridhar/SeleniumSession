package seleniumbasics;

public class CSSelectorConcept {

	public static void main(String[] args) {
		
		// input#input-email
		// input.form-control
		//input.form-control#input-email
		// input[type='text'][name='search']
		//input[placeholder*='Address']-----contains
		//input[placeholder$='Address']-----ends with
		//input[placeholder^='E-mail']------starts with
		
		//text in css----not avl
		
		//parent to child----------------------------------------------------------->>>>>>>>>>
		
		
		//form#hs-login > div-----direct child (add >)
		//form#hs-login  div------direct+indirect child (add space)
		//select#Form_getForm_Country > option
		
		
		//child to parent -----------------------------------not available
		
		//following-sibling------add +------------------------------------------------->>>>>>>>
		
		//label[for*='email']+input[placeholder*='Mail']----immediate following-sibling
		//option[value='Andorra']~option------------------------all the following sibling
		
		//+ gives single following sibling but ~ gives all the following sibling
		
		
		
		
		
		
		
		
		
		
	}

}
