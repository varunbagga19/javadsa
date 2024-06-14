package oops.interfaces;

public class person implements Student,youtuber
{
    public static void main(String[] args) 
    {
        person obj = new person();
        obj.study();
        obj.makeVideos();
        
    }

    @Override
    public void study() {
        System.out.println("Person is studin");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void makeVideos() {
        System.out.println("Person is making video");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uploadVideo() {
        System.out.println();
        // TODO Auto-generated method stub
        
    } 
    
}
