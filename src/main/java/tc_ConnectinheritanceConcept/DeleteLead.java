package tc_ConnectinheritanceConcept;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;
//Sub Class
public class DeleteLead extends ProjectSpecificWrapper{

	//public static void main(String[] args) {
		//public static void main(String[] args) throws InterruptedException {

		@Test
		public void deleteLead() {
				
			//click Leads
			driver.findElementByLinkText("Leads").click();
			
			//click Find lead link
			driver.findElementByLinkText("Find Leads").click();
			
			//click on phone
			driver.findElementByXPath("//span[text()='Phone']").click();
			
			//click on email
			//driver.findElementByXPath("//span[text()='Email']").click();
			
			//enter phone number(areaCode)
			driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
			
			//enter phone number
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");		
		
		

	}

}
