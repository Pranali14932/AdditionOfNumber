pipeline {
    agent any
        environment{
            PATH="/usr/bin/mvn /usr/share/man/man1/mvn.1.gz:$PATH"
        }
    stages {
      
         stage('clonning from GIT') {
            steps{
                git branch: 'main', url: 'https://github.com/Pranali14932/AdditionOfNumber.git'
                 }
     
            }
             stage('Build Code') {
            steps{
                    sh "mvn clean install sonar:sonar"
                 }
     
            }
          
           stage ('Build') {
    	    steps {
    	        sh 'chmod +x gradlew'
	        	sh './gradlew clean build'
        	}
         }
	     stage ('Test') {
    	    steps {
	        	sh './gradlew test'
        	}
         }
        
            
        }
    }

