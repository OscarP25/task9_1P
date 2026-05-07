package sit333.task9_1P;

public class ViewTaskService {
	
	//Output number of tasks depending on the grade
    public static String viewTasks(String studentId, String unitCode, String targetGrade) {
    	if (studentId == null || !studentId.matches("s\\d{9}")) {
            return "Invalid student ID";
        }
    	
    	if (unitCode == null || 
    		    !("SIT333".equals(unitCode) || "SIT324".equals(unitCode) || 
    		      "SIT327".equals(unitCode) || "SIT374".equals(unitCode))) {
    		    return "Invalid unit code";
    	}
    	
        if ("P".equals(targetGrade)) {
            return generateTaskList(6);
        }

        if ("C".equals(targetGrade)) {
            return generateTaskList(8);
        }

        if ("D".equals(targetGrade)) {
            return generateTaskList(10);
        }

        if ("HD".equals(targetGrade)) {
            return generateTaskList(12);
        }

        return "Invalid target grade";
    }

    //Generate list of tasks for assertion, looping till fulfillment of quantity matching grade
    private static String generateTaskList(int numberOfTasks) {
        String result = "";

        for (int i = 1; i <= numberOfTasks; i++) {
            result += "Task-" + i;

            if (i < numberOfTasks) {
                result += ", ";
            }
        }

        return result;
    }
}