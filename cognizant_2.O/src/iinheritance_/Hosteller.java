package iinheritance_;

public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    /* Getter setter methods for hostelName */
    public String getHostelName(){
        return hostelName;
    }
    public void setHostelName(String hname){
        this.hostelName=hname;
    }
    
    /* getter setter method for roomNumber */
    public int getRoomNumber(){
        return roomNumber;
    }
    
    public void setRoomNumber(int rnumber){
        this.roomNumber=rnumber;
    }
}
