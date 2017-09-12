public class Main {

	public static void main(String[] args) {
		
			StudentGroup sg=new StudentGroup(2);
       Student s[]=new Student[2];
     
 Date date = new Date();

//String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
  
     s[0]=new Student(1,"bhavani",date,88);
     
   s[1]=new Student(2,"honey",date,89);
     
 sg.setStudents(s);
   //   sg.getStudents();
    
  sg.addFirst(new Student(3,"fsd",date,90));
      
sg.addFirst(new Student(3,"fsd",date,90));
      
sg.addFirst(new Student(3,"fsd",date,90));
      
sg.addFirst(new Student(3,"fsd",date,90));
       
 System.out.println(sg.n);
     
  sg.addLast(new Student(3,"fsd",date,90));
    
   System.out.println(sg.n);
       
 sg.remove(2);
     
   System.out.println(sg.n);
   
     sg.removeFromIndex(3);
     
 System.out.println(sg.n);
    
  sg.removeToIndex(1);
  
    System.out.println(sg.n);
  
    sg.addFirst(new Student(3,"fsd",date,90));
     
 sg.addFirst(new Student(3,"fsd",date,90));
      sg.addFirst(new Student(3,"fsd",date,90));
      sg.addFirst(new Student(3,"fsd",date,90));
      sg.removeToIndex(1);
      System.out.println(sg.n);
      sg.removeFromElement(new Student(3,"fsd",date,90));
       System.out.println(sg.n);
	}


}
