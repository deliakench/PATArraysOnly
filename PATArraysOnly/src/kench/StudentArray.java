/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kench;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DeliaKench
 */
public class StudentArray
{
    private Student [] studArray = new Student [200];
    private int size = 0;
    
     public StudentArray()
    {
        try
        {
            Scanner scFile = new Scanner(new File("Students.txt"));
            String id,fn,sn, line;
            int grade;
            char reg =' ' ;
            while (scFile.hasNext())
            {
                line = scFile.nextLine();
                Scanner sc = new Scanner(line).useDelimiter(",");
                id = sc.next();
                fn = sc.next();
                sn = sc.next();
                grade = sc.nextInt();
                reg = sc.next().charAt(0);
                sc.close();
                studArray[size] = new Student(id,fn,sn,grade,reg);
                size++;
            }
            scFile.close();
        } catch (FileNotFoundException f)
        {
            System.out.println("File Not Found - check file name or path");
        }
    }

    public String toString()
    {
        String temp = "";
        for (int i = 0; i < size; i++)
        {
            temp = temp + studArray[i] + "\n";
        }
        return temp;
    }

    public void sortbyName()
    {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (studArray[i].getsName().compareTo(studArray[j].getsName()) > 0)
                {
                    Student temp = studArray[j];
                    studArray[j] = studArray[i];
                    studArray[i] = temp;
                } //if
            } //inner for
        } //outer for
    } //sort method

    public int searchFirst(String name)
    {
        for (int i = 0; i < size; i++)
        {
            if (name.equalsIgnoreCase(studArray[i].getsName()))
            {
                return i;
            }
        }
        return -1;
    }
    
    public Student getStudent (int index)
    {
        return studArray[index];
    }
}
