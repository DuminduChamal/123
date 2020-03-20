/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author ASUS
 */
public class New {
    
    private String name;
    private int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        New a = new New();
        a.setName("Warren");
        a.setAge(34);
        System.out.println();
        System.out.println("Name : "+a.getName());
        System.out.println("Age : "+a.getAge());
        System.out.println();
        a.printDetails();
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age ;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void printDetails()
    {
        System.out.println("Name : " +name+", Age : "+age);
    }
}
 