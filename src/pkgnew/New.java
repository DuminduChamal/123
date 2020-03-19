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
    
    String name;
    int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        New a = new New();
        a.setName("Pablo");
        a.setAge(43);
        System.out.println(a.getName());
        System.out.println(a.getAge());
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
 