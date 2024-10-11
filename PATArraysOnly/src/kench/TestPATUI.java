/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kench;

import javax.swing.JOptionPane;

/**
 *
 * @author DeliaKench
 */
public class TestPATUI
{
    public static void main(String[] args)
    {
        System.out.println("StudentArray\n" + Manager.studentArray.toString());
        Manager.studentArray.sortbyName();
        System.out.println("\n\nStudent Array sorted\n" + Manager.studentArray.toString());
        String surname = JOptionPane.showInputDialog("Enter a surname");
        int pos = Manager.studentArray.searchFirst(surname);
        if (pos == -1)
        {
            System.out.println("Surname not found");
        }
        else{
            Student student = Manager.studentArray.getStudent(pos);
            System.out.println("\n\nStudent:\n" + student);
        }
        
    }
}
