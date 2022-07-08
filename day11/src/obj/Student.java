package obj;

public class Student {
   int num;
   String name;

   public Student() {;}

   public Student(int num, String name) {
      super();
      this.num = num;
      this.name = name;
   }

   public Student(String name) {
      super();
      this.name = name;
   }
   
   @Override
   public String toString() {
      return "이름 : " + name;
   }
   
  public boolean equals(Student a) {
	  if(this.num == a.num && this.name == a.name) {
		  return true;
	  }
	  return false;
  }
//	  if(this == a) {
//		 return true; 		 
//	  }
//	  if(a instanceof String) {
//		  String anotherString = (String)a;
//		 int n = name.length();
//		 if(n == anotherString.name.length()) {
//			 char v1[] = name;
//			 char v2[] = anotherString.name;
//		 }
//	  }
//	  return false;
}