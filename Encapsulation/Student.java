package Encapsulation;

public class Student {
// Declaring the private variables.
    private int sid; 
    private String name;
    private String course;
    private int fee;

 /**
  * return value in get Funtion
  * assign value in the set Funtion, don't need to return value in set Functions 

 */

    /**
     * This function returns the value of the private variable sid.
     * 
     * @return The value of the variable sid.
     */
    public int getSid(){
        return sid;
    }

   /**
    * This function sets the value of the private variable sid to the value of the parameter sid
    * 
    * @param sid The ID of the student
    */
    public void setSid(int sid){
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
