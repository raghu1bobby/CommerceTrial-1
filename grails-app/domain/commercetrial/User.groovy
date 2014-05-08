package commercetrial

class User {
	static mapWith="mongo"
	
	String username
	String password
	String confirm_password
	String email
	String mobile
	Integer counter
//	static hasMany = [address:Address]
	//static embedded = ['address']
	static transients = ['confirm_password']
	static constraints = {
		username nullable:false, blank:false, size:5..15, unique:true;
		email email:true;
		mobile nullable:true
		counter nullable:true
		password nullable:false, blank: false, size:5..15, validator:{password, obj->
			def confirm = obj.confirm_password
			if(password != confirm)
			return 'commercetrial.User.passwordDoNotMatch'
			}
	}
		
	

}
