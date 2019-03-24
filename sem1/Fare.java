//written by Alexis Lyndon Galaura y Guian
import java.io.*;
public class Fare{
	public static void main(String[] args){
		int firstkms = Integer.parseInt(args[0]);
		int farefirstkms = Integer.parseInt(args[1]);
		int subsequentkms = Integer.parseInt(args[2]);
		int totaldistance = Integer.parseInt(args[3]);
		int totalfare, dif;
		
		dif = totaldistance - firstkms;
		totalfare = (dif*subsequentkms) + farefirstkms;
		System.out.println(totalfare);
	}
}