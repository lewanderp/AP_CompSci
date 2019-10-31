package chapter4;

import java.awt.Point;

public class Project4_1_Class {
	
	private Point p1 = new Point();
	private Point p2 = new Point();
	private Point p3 = new Point();
	private double s1;
	private double s2;
	private double s3;
	private double a1;
	private double a2;
	private double a3;
	private double area;
	private double perimeter;
	
	Project4_1_Class(double x1, double y1, double x2, double y2, double x3, double y3){
		p1.setLocation(x1, y1);
		p2.setLocation(x2, y2);
		p3.setLocation(x3, y3);
		calcSides();
		calcAngles();
		calcPerim();
	}
	public Point getP1() {
		return p1.getLocation();
	}
	public Point getP2() {
		return p3.getLocation();
	}
	public Point getP3() {
		return p3.getLocation();
	}
	public double getS1() {
		return s1;
	}
	public double getS2() {
		return s2;
	}
	public double getS3() {
		return s3;
	}
	public double getA1() {
		return a1;
	}
	public double getA2() {
		return a2;
	}
	public double getA3() {
		return a3;
	} 
	public double getArea() {
		return area;
	}
	public double getPerim() {
		return perimeter;
	}
	private double radianToDegree(double convert) {
		double converting = (convert / Math.PI) * 180;
		return converting;
	}
	private void calcAngles() {
		a1 = radianToDegree(Math.acos((Math.pow(s3, 2)-Math.pow(s1, 2)-Math.pow(s2, 2))/(-2*s1*s2)));
		a2 = radianToDegree(Math.acos((Math.pow(s2, 2)-Math.pow(s1, 2)-Math.pow(s3, 2))/(-2*s1*s3)));
		a3 = 180 - a1 - a2;
	}
	private void calcSides() {
		s1 = Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX())+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
		s2 = Math.sqrt((p3.getX()-p2.getX())*(p3.getX()-p2.getX())+(p3.getY()-p2.getY())*(p3.getY()-p2.getY()));
		s3 = Math.sqrt((p1.getX()-p3.getX())*(p1.getX()-p3.getX())+(p1.getY()-p3.getY())*(p1.getY()-p3.getY()));
	}
	private void calcPerim() {
		perimeter = s1+s2+s3;
	}
	
}
