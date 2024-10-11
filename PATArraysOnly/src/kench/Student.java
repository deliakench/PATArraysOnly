/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kench;

/**
 *
 * @author DeliaKench
 */
public class Student
{
    private String studID;
    private String fName;
    private String sName;
    private int grade;
    private char regClass;

    public Student(String inStudID, String inFName, String inSName, int inGrade, char inRegClass)
    {
        studID = inStudID;
        fName = inFName;
        sName = inSName;
        grade = inGrade;
        regClass = inRegClass;
    }

    public String getStudID()
    {
        return studID;
    }

    public String getfName()
    {
        return fName;
    }

    public String getsName()
    {
        return sName;
    }

    public int getGrade()
    {
        return grade;
    }

    public char getRegClass()
    {
        return regClass;
    }

    @Override
    public String toString()
    {
        return studID + "\t" + fName + "\t" + sName + "\t" + grade + "\t" + regClass;
    }
    

    public String toFile()
    {
        return studID + "," + fName + "," + sName + "," + grade + "," + regClass;
    }
    
    
    
}
