package sit333.task9_1P;

import org.junit.Assert;
import org.junit.Test;

public class ViewTaskTest {

	
	@Test
	public void testInvalidStudentIdFormat() {
	    String result = ViewTaskService.viewTasks("224526134", "SIT333", "P");

	    Assert.assertEquals("Invalid student ID", result);
	}

	@Test
	public void testInvalidStudentIdTooShort() {
	    String result = ViewTaskService.viewTasks("s22452613", "SIT333", "P");

	    Assert.assertEquals("Invalid student ID", result);
	}

	@Test
	public void testEmptyStudentId() {
	    String result = ViewTaskService.viewTasks("", "SIT333", "P");

	    Assert.assertEquals("Invalid student ID", result);
	}

	@Test
	public void testNullStudentId() {
	    String result = ViewTaskService.viewTasks(null, "SIT333", "P");

	    Assert.assertEquals("Invalid student ID", result);
	}
	
	@Test
	public void testInvalidUnitCodeFormat() {
	    String result = ViewTaskService.viewTasks("s224526134", "333", "P");

	    Assert.assertEquals("Invalid unit code", result);
	}
	
	@Test
	public void testInvalidUnitCode() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT321", "P");

	    Assert.assertEquals("Invalid unit code", result);
	}
	
	@Test
	public void testEmptyUnitCode() {
	    String result = ViewTaskService.viewTasks("s224526134", "", "P");

	    Assert.assertEquals("Invalid unit code", result);
	}
	
	@Test
	public void testNullUnitCode() {
	    String result = ViewTaskService.viewTasks("s224526134", null, "P");

	    Assert.assertEquals("Invalid unit code", result);
	}
	@Test
	public void testInvalidTargetGradeFormat() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT333", "Pass");

	    Assert.assertEquals("Invalid target grade", result);
	}
	
	@Test
	public void testInvalidTargetGradeCase() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT333", "p");

	    Assert.assertEquals("Invalid target grade", result);
	}

	@Test
	public void testInvalidTargetGrade() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT333", "A");

	    Assert.assertEquals("Invalid target grade", result);
	}

	@Test
	public void testEmptyTargetGrade() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT333", "");

	    Assert.assertEquals("Invalid target grade", result);
	}

	@Test
	public void testNullTargetGrade() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT333", null);

	    Assert.assertEquals("Invalid target grade", result);
	}
	
	@Test
	public void testValidPassUnitSIT324() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT324", "P");

	    Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6", result);
	}

	@Test
	public void testValidPassUnitSIT327() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT327", "P");

	    Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6", result);
	}

	@Test
	public void testValidPassUnitSIT374() {
	    String result = ViewTaskService.viewTasks("s224526134", "SIT374", "P");

	    Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6", result);
	}
	
    @Test
    public void testValidPassUnitSIT333() {
        String result = ViewTaskService.viewTasks("s224526134", "SIT333", "P");

        Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, ", result);
    }
    
    @Test
    public void testValidCreditUnitSIT333() {
        String result = ViewTaskService.viewTasks("s224526134", "SIT333", "C");

        Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6, Task-7, Task-8", result);
    }

    @Test
    public void testValidDistinctionUnitSIT333() {
        String result = ViewTaskService.viewTasks("s224526134", "SIT333", "D");

        Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6, Task-7, Task-8, Task-9, Task-10", result);
    }

    @Test
    public void testValidHighDistinctionUnitSIT333() {
        String result = ViewTaskService.viewTasks("s224526134", "SIT333", "HD");

        Assert.assertEquals("Task-1, Task-2, Task-3, Task-4, Task-5, Task-6, Task-7, Task-8, Task-9, Task-10, Task-11, Task-12", result);
    }
}