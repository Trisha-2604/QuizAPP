import java.util.*;
public class Main {
	public static void main(String[] args) {
try {
		Scanner sc=new Scanner(System.in);
		QuizQuestions q=new QuizQuestions();
System.out.print("Enter your name :");
q.setName(sc.next().toUpperCase());
System.out.print("Enter your age :");
q.setAge(sc.nextInt());
System.out.print("Enter your phonenumber:");
q.setPhone(sc.nextLong());
System.out.println("////@@@@@@@@@@@@////@@@@@@@@@@@@@@@@@|||Welcome to kaun bhanega das hajarpati|||@@@@@@@@@@@@@////@@@@@@@@@@@@@////");
System.out.println();
System.out.println("Participant Name    :"+q.getName());
System.out.println("Participant Age     :"+q.getAge());
System.out.println("Participant PhoneNo :"+q.getPhone());
System.out.println();
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
 System.out.println("%%%%%%%%%%%%%%%%%% Please enter your choice 1.Quit and  2.To Initiate the game %%%%%%%%%%%%%%%%%%%%%%%%%%%%");
 int choice;
 choice=sc.nextInt();
 switch(choice) {
 case 1:
	 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$===========>Thanks for participating the game terminated<================$$$$$$$$$$$$$$");
	 System.exit(0);
	 break;
 case 2:
	 System.out.println("                   &&&&&&&&&&&&&------LETS PLAY THE GAME------&&&&&&&&&&&&&                       ");
	 System.out.println();
	 q.rules();
	 q.Question1();
     break;
 default:
	 System.out.println("Please enter correct choice");	}}
		catch(InputMismatchException ie) {
			System.out.println("Please enter correct input ");		} }}

