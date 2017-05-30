package pl.krajan.sendbox;

/**
 * Created by kraja on 2017-05-29. */
 public class Point {
 public double p[];
 public double k[];

 public Point(double p[], double k[]) {
     this.p = p;
     this.k = k;
 }

 public double pole(){
 return Math.sqrt(
 (this.k[0] - this.p[0])*(this.k[0] - this.p[0])
 + (this.k[1] - this.p[1])*(this.k[1] - this.p[1]));
 }
 }

