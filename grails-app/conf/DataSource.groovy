dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "root"
	password = "root"
}
grails {
	mongo {
		host = "localhost"
		port = 27017
		databaseName = "test"
		
	}
}



// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost:3306/cmpe281"
			username = "root"
			password = "utsav"
        }
    }
    test {
        dataSource {
             dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/cmpe281"
			username = "root"
			password = "utsav"
			}
    }
    production {
        
		grails {
			mongo {
				
				host = 'oceanic.mongohq.com'
				port = 10027
				username = 'cmpe281'
				password = 'cmpe281'
				databaseName = 'o2rREG2Tjh5KQ0UybZjOg'
				
						}
		}
		
		        }
		
		
}



