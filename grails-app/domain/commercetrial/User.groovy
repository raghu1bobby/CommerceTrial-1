package commercetrial

class User implements Serializable{

	String username
	String password
	String email
	String confirm_password
	static transients =  ['confirm_password']
	
    static constraints = {
		username nullable:false, blank:false, size:6..15, unique:true;
		email email:true;
		password nullable:false, blank: false, size:6..15, validator:{password, obj->
			def confirm = obj.confirm_password
			if(password != confirm )
			return 'commercetrial.User.passwordDoNotMatch'
			}
		
	}
		
		
	}
		

	 
	

