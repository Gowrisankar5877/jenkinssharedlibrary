def call(){
 stage('Checkout'){
	checkout scm
 }
 stage('Unit Tests'){
 echo 'Running Unit tests'
 sh './gradlew test'
 }
}
