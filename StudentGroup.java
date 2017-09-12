import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] std;
        public int n; 
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.std = new Student[length];
                n=length;
	}

	@Override
	public Student[] getStudents() {
		return std;
		
	}

	@Override
	public void setStudents(Student[] students) {
if(students!=null)		
for(int i=0;i<n;i++)
		{
		std[i]=students[i];
		}
else throw new IllegalArgumentException();

	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>=n)
			throw new IllegalArgumentException();
else		
return std[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==null||index<0||index>=n)
throw new IllegalArgumentException();
else
std[index]=student;
	}

	@Override
	public void addFirst(Student student) {
if(student==null)
throw new IllegalArgumentException();
else
{
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n+1];
std[0]=student;
for(int i=0;i<n;i++)
std[i+1]=s[i];
n++;
 }
	}

	@Override
	public void addLast(Student student) {
if(student==null)
      throw new IllegalArgumentException();
else
{
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n+1];
for(int i=0;i<n;i++)
std[i]=s[i];
std[n]=student;
n++;
 }	
	}

	@Override
	public void add(Student student, int index) {
		if(student==null||index<0||index>=n)
throw new IllegalArgumentException();
else
{
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n+1];
for(int i=0;i<index;i++)
std[i]=s[i];
std[index]=student;
for(int i=index+1;i<n;i++)
std[i]=s[i-1];
n++; 
}
	}

	@Override
	public void remove(int index) {
		if(index<0||index>=n)
throw new IllegalArgumentException();
else
{
int k=0;
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n-1];
for(int i=0;i<n;i++)
{ if(index!=i)
    { std[k]=s[i];
     k++;
     }
}
n--;}
	}

	@Override
	public void remove(Student student) {
		if(student==null)
throw new IllegalArgumentException();
else
{
int k=0;
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n-1];
for(int i=0;i<n;i++)
{ if(s[i]!=student)
    { std[k]=s[i];
     k++;
     }
}
n--;}
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0||index>=n)
throw new IllegalArgumentException();
else
{
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[index+1];
for(int i=0;i<=index;i++)
std[i]=s[i];
n=index+1;
}
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
throw new IllegalArgumentException();
else
{
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
int k=0;
for(k=0;k<n;k++)
   if(s[k]==student)break;
  std=new Student[k+1];
if(k<n)
 { for(int i=0;i<=k;i++)
    std[i]=s[i];
n=k+1;
}
}
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>=n)
throw new IllegalArgumentException();
else
{
int k=0;
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
std=new Student[n-index];
for(int i=index;i<n;i++)
std[k++]=s[i];
n=n-index;
}
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
throw new IllegalArgumentException();
else
{
int k=0,j=0;
Student s[]=new Student[n];
for(int i=0;i<n;i++)
               s[i]=std[i];
for(k=0;k<n;k++)if(s[k]==student)break;

for(int i=k;i<n;i++)
std[j++]=s[i];
n=n-k;
}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
