/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phamthingocnhu_23210141;

public class LineSegment {
 Point startPoint;
    Point endPoint;  

   
    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
 }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
 
    public LineSegment(){
        
    }            
            
 public void LineSegment(){
     this.startPoint = startPoint;
     this.endPoint = endPoint;
 }
  public void input(){
      
      System.out.println("Nhap toa do diem start: ");
      Point startPoint = new Point();
      startPoint.input();
      this.setStartPoint(startPoint);

      System.out.println("Nhap toa do diem end: ");
      Point endPoint = new Point();
      endPoint.input();
      this.setEndPoint(endPoint);
  }
  
  public void output(){
      this.startPoint.output();
      this.endPoint.output();
  }
 
}



