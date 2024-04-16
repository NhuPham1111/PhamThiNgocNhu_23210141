/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phamthingocnhu_23210141;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class Point {
    private int hoanhDoX;
    private int tungDoY;

    public int getHoanhDoX() {
        return hoanhDoX;
    }

    public void setHoanhDoX(int hoanhDoX) {
        this.hoanhDoX = hoanhDoX;
    }

    public int getTungDoY() {
        return tungDoY;
    }

    public void setTungDoY(int tungDoY) {
        this.tungDoY = tungDoY;
    }

    public Point() {
    }

    public Point(int hoanhDoX, int tungDoY) {
        this.hoanhDoX = hoanhDoX;
        this.tungDoY = tungDoY;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do x: ");
        this.setHoanhDoX(sc.nextInt());
        System.out.print("Nhap tung do y: ");
        this.setTungDoY(sc.nextInt());
    }
    
    public void output(){       
        System.out.println(String.format("(%d,%d)", this.hoanhDoX, this.tungDoY));
    }    
        
    }
