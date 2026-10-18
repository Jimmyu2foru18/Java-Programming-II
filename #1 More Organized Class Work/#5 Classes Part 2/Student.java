/**
 * @author Jimmy McGuigan
 * Classes Lab 2
 */
public class Student 
{
    private String name;
    private int studentNumber;
    private int credits;
    private double gpa;

    public Student(String name, int studentNumber, int credits, double gpa) 
    {
        this.name = name;
        setStudentNumber(studentNumber);
        setCredits(credits);
        setGpa(gpa);
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getStudentNumber() 
    {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) 
    {
        if (studentNumber >= 700000000 && studentNumber <= 799999999) 
        {
            this.studentNumber = studentNumber;
        } 
        else 
        {
            throw new IllegalArgumentException();
        }
    }

    public int getCredits() 
    {
        return credits;
    }

    public void setCredits(int credits) 
    {
        if (credits >= 0) 
        {
            this.credits = credits;
        } 
        else 
        {
            throw new IllegalArgumentException();
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) 
    {
        if (gpa >= 0 && gpa <= 4.0) 
        {
            this.gpa = gpa;
        } 
        else 
        {
            throw new IllegalArgumentException();
        }
    }

    public int getCreditsToGraduate() 
    {
        int creditsNeeded = 120 - credits;
        return (creditsNeeded >= 0) ? creditsNeeded : 0;
    }
}
