import java.util.Scanner;
class content{
String title;
int dur;
String name;
content(String title, int dur, String name){
this.title=title;
this.dur = dur;
this.name = name;
}
void play(){
System.out.println(title+ " is playing");
}
void display(){
System.out.println(title + " is the title name");
System.out.println(dur +" is the duration of song");
System.out.println(name +" is the name of the artist");
}
}
class song extends content{
String genre;
song(String title, int dur, String name, String genre){
super(title,dur,name);
this.genre = genre;
}
void display(){
super.display();
System.out.println(genre+" is the genre of the song");
}}
class podcast extends content{
int eps;
podcast(String title, int dur, String name, int eps){
super(title,dur,name);
this.eps=eps;
}
void display(){
super.display();
System.out.println(eps +" is the number of episodes");
}}
class audio extends content{
int count;
audio(String title, int dur, String name, int count){
super(title,dur,name);
this.count= count;
}
void display(){
super.display();
System.out.println( count+" is the num of chapters");
}}
public class music{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
//Song Details//
System.out.println("Enter the song details:");
System.out.print("Enter the title:");
String title  = sc.nextLine();
System.out.print("Enter the duration:");
int dur = sc.nextInt();
sc.nextLine();
System.out.print("Enter the artist name:");
String name = sc.nextLine();
System.out.print("Enter the gerne:");
String gerne = sc.nextLine();
song Song = new song(title,dur,name,gerne);
// podcast details//
System.out.println("Enter the podcast details");
System.out.print("Enter the title:");
String ptitle = sc.nextLine();
System.out.print("Enter the duration:");
int pdur = sc.nextInt();
sc.nextLine();
System.out.print("Enter the artist name:");
String pname = sc.nextLine();
System.out.print("Enter the num of episodes:");
int eps = sc.nextInt();
sc.nextLine();
podcast Podcast = new podcast(ptitle,pdur,pname,eps);
// audio book//
System.out.println("Enter the audiobook details");
System.out.print("Enter the title::");
String atitle = sc.nextLine();
System.out.print("Enter the duration:");
int adur = sc.nextInt();
sc.nextLine();
System.out.print("Enter the artist name:");
String aname= sc.nextLine();
System.out.print("Enter the no of chapters:");
int count= sc.nextInt();
sc.nextLine();
audio Audio = new audio(atitle,adur,aname,count);

System.out.println("----Song details----");
Song.play();
Song.display();
System.out.println("----podcast detials----");
Podcast.play();
Podcast.display();
System.out.println("----Audiobook details----");
Audio.play();
Audio.display();
sc.close();
}
}