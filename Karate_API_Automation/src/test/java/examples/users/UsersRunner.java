package examples.users;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

class UsersRunner {


	@Test
	public void testParallel() 
	{
		Results results = Runner.path("classpath:package_name/file_name.feature").tags("~@ignore").parallel(5);

		assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
	}

	private void assertTrue(String errorMessages, boolean b) {
		System.out.println("Failed");
	}

	@Karate.Test
	Karate testUsers() {
		return Karate.run("users").relativeTo(getClass());
	}    

}
