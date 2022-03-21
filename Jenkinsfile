//*********************************Gradle Build**************************//
// pipeline {
//     agent any
//         environment{
//             PATH="/usr/bin/mvn /usr/share/man/man1/mvn.1.gz:$PATH"
//         }
//     stages {
      
//           stage('clonning from GIT') {
//              steps{
//                  git branch: 'main', url: 'https://github.com/Pranali14932/AdditionOfNumber.git'
//                   }
     
//              }
//              stage('Build Code') {
//             steps{
//                     sh "mvn clean install sonar:sonar"
//                  }
     
//             }
          
//            stage ('Build') {
//     	    steps {
//     	        sh 'chmod +x gradlew'
// 	        	sh './gradlew clean build'
//         	}
//          }
// 	     stage ('Test') {
//     	    steps {
// 	        	sh './gradlew test'
//         	}
//          }
        
            
//         }
//     }





//*************************Docker Build *********************************//
pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'devopshint', url: 'https://github.com/Pranali14932/AdditionOfNumber']]])

                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                  sh 'docker build -t devopshint/my-app-1.0 .'
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                 withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u omjai1010 -p 0303@Chetan'
                 }  
                 sh 'docker push devopshint/my-app-1.0'
                }
            }
        }
    }
}
