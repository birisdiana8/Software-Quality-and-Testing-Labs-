package ro.ase.acs.example1;

//DRY - don't repeat yourself
//KISS - keep it simple and stupid
//YAGNI - you aren't gonna need it

public class EmployeeStudent {
	int salaryPerHour;
	//int salary;
	int hours;

	public void reportHours(int addHours) {
		hours+=addHours;
		//salary=salaryPerHour*hours;
		//we don't store variables that are calculated
		//for a variable name we need to have nouns, not verbs
		//for function names we need to start with a verb
		
	}
	
//	public int findMinInsideUnsortedArray(int [] v) throws Exception {
//		if(v==null || v.length==0 ) {
//			throw new Exception("Vector is null");
//		}
//		
//		int min=v[0];
////		for(int i=1;i<v.length-1;i=i+2) {
////			if(min>v[i]) {
////				min=v[i];
////			}
////		}
////		for(int i=2;i<v.length;i=i+2) {
////			if(min>v[i]) {
////				min=v[i];
////			}
////			
////		}
//		for (int i = 0; i < v.length; i++) {
//			if (min > v[i]) {
//				min = v[i];
//			}
//		}
//				
//		return min;
//	}
	
	public void addHours(int addedHours) {
		hours += addedHours;
		//salary = salaryPerHour * hours;
		//we don't store variables that are calculated
		//for a variable name we need to have nouns, not verbs
		//for function names we need to start with a verb
	}
	
	public int getFullSalary() {
		return hours * salaryPerHour;
	}
	
	public String getExam(int examNumber) throws Exception {
		
		String[] exams = {
				ConstantVariable.EXAM_OOP, 
				ConstantVariable.EXAM_JAVA, 
				ConstantVariable.EXAM_DS, 
				ConstantVariable.EXAM_CS, 
				ConstantVariable.EXAM_STAT
		};
		
		if (examNumber < exams.length && examNumber > 0) {
			return exams[examNumber - 1];
		}else {
			throw new Exception("exam must be in range 1 to 5");
		}
		
		//it is better to use a data structure instead of if or switch
		
//	    switch (numberExam) {
//	        case 1:
//	            return ConstantVariable.EXAM_OOP;
//	        case 2:
//	            return ConstantVariable.EXAM_JAVA;
//	        case 3:
//	            return ConstantVariable.EXAM_DS;
//	        case 4:
//	            return ConstantVariable.EXAM_CS;
//	        case 5:
//	            return ConstantVariable.EXAM_STAT;
//	        
//	        default:
//	            throw new Exception("exam must be in range 1 to 5");
//	    }
	}
}
