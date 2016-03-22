package ru.prog.home.project;

public class DistancePoint {
	
   public static void main(String[] args) {

     Point p1 = new Point(3,4);
     Point p2 = new Point(6,8);
     System.out.println(distance(p2,p1));
     System.out.println("Расстояние между точками p1 и p2,с  координатами " + "(" + p1.x + ";" + p1.y + ")"  +  "и" + "(" + p2.x +  ";" + p2.y + ")"  + "=" + p1.distance(p2,p1));


   }

    public static double distance(Point p1, Point p2) {

    return Math.sqrt(Math.pow((p2.x - p1.x),2)+Math.pow((p2.y - p1.y),2));


  }



}