import java.util.*;
import java.lang.*;
public class QuizQuestions extends Exception {
	Scanner sc=new Scanner(System.in); 
	Participants p=new Participants();
	int amount=0,count=0,count1=0,value=0,choice=0;
public void rules() {
	System.out.println("<============%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%==========GAME RULES==========%%%%%%%%%%%%%%%%%%%%%%%%%============>");
	System.out.println("        1.The player will be provided with 10 questions and its completely based on your General knowledge");
	System.out.println("        1.Remember the lifelines should be used only once and cannot be repeated");
	System.out.println("        2.You will be given two lifelines 1.Audience poll and 2.50:50");
	System.out.println("        3.If your answer is wrong the game will be terminated");
	System.out.println("        4.If you want to quit the game you choose the quit option and terminate the game at any time");
	System.out.println("        5.your score  will be increased  with 1000 points at each correct option");
    System.out.println("<===============================%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%==================================>");
    System.out.println();}
private String name;
private int age;
private long no;
public QuizQuestions() {
	super();
	this.name = name;
	this.age = age;
	this.no=no;}
public String getName() {
	return name;}
public void setName(String name) {
	this.name = name;}
public int getAge() {
	return age;}
public void setAge(int age) {
	this.age = age;}
public long getPhone() {
	return no;}
public void setPhone(long no) {
	this.no=no;}	
//==========================================================================================================
public void Question1() {
	try {
		LinkedList l1=new LinkedList();
	//l1.add(null);
		 System.out.println("<=+++++++++++++++++++++ Here is your First question ++++++++++++++++++++++++++=>");
		l1.add("A.What is our national animal ?");
		l1.add("1.Lion");
	  l1.add("2.Tiger");
	   l1.add("3.Cheetha");
	   l1.add("4.Fox");
	   l1.add("5.Lifelines");
	   l1.add("6.Quit");
		ListIterator itr=l1.listIterator();
	   while(itr.hasNext()) {
		System.out.println(itr.next());}		
	 System.out.println("Choose any option?");
	   value=sc.nextInt();   
		if(l1.get(5)==l1.get(value)){
			System.out.println("Enter your choice as 1.Audience poll 2.50:50");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Audience poll answers are 1.lion-20%  2.tiger-55% 3.cheetha-20% 4.fox-5%");
				System.out.println("Choose any option");
				value=0;
				   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count+=1;
			  		Question2();
		   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);}
		   else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			 			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }			
				break;
			case 2:
				System.out.println("50:50 answers are 1.lion & 2.tiger");
				System.out.println("Choose any option");
				   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count1+=1;
			  		Question2();
		   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your score amount is "+amount);
				System.exit(0);}
			   else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0); }							
				break;}}
		else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated Thanks for participating");
			 System.out.println("your  score amount is "+amount);
			System.exit(0);}
		else {
		   if(l1.get(2)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your score amount is "+amount);
		  		Question2();
	     }else {
		   System.out.println("You entered wrong answer");
		   System.out.println("your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);  }}
		System.out.println();}
catch(InputMismatchException | IndexOutOfBoundsException e) {
	   e.getStackTrace();
	   System.out.println(e.getMessage());   }	}

//==============================================================================================================================	
public void Question2() {
	try {
		 System.out.println("<=++++++++++++++++++++++++ Second question++++++++++++++++++++++++=>");
	 LinkedList l1=new LinkedList();
	  l1.add("B.What is our National Fruit ?");
	   l1.add("1.Apple");
	   l1.add("2.Avacado");
	   l1.add("3.Mango");
	   l1.add("4.PineApple");
	   l1.add("5.Lifelines");
	   l1.add("6.Quit");
	 		 ListIterator itr=l1.listIterator();
	   while(itr.hasNext()) {
		System.out.println(itr.next()); 	 }
	   System.out.println("choose any option");
	   value=sc.nextInt();
	   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
			System.out.println("Enter your choice as 1.Audience poll 2.50:50");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Audience poll answer is 1.Apple-20%  2.Avacado-15% 3.Mango-60% 4.Pineapple-5%");
				System.out.println("Choose any option?");
				value=0;
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count+=1;
			  		Question3();		   }
			   else if(l1.get(6)==l1.get(value)) {
					System.out.println("The game terminated thanks for participating");
					 System.out.println("Your  score amount is "+amount);
					System.exit(0);
				}else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }			
				break;
			case 2:
				System.out.println("50:50 answers are 2.Avacado & 3.Mango");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question3();		   }
			   else if(l1.get(6)==l1.get(value)) {
					System.out.println("The game terminated thanks for participating");
					 System.out.println("your  score amount is "+amount);
					System.exit(0);
				}else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }							
				break;			}}	   
	   else if(l1.get(5)==l1.get(value) && count==0){
		System.out.println("you left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answer is 1.Apple-10%  2.Avacado-15% 3.Mango-60% 4.Pineapple-5%");
				System.out.println("choose any option");
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value )) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		 count+=1;
			  		Question3();
		   }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }}		
   else if(l1.get(5)==l1.get(value) && count1==0) {
	   System.out.println("you left with an only one option i.e., 50:50");
			System.out.println("50:50 answers are 3.Mango or 4.Pineapple");
			System.out.println("choose any option");
			   value=sc.nextInt();
		   if(l1.get(3)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("your  score amount is "+amount);
		  		 count1+=1;
		  		Question3();
	   }else {
		   System.out.println("You enterned wrong answer");
		   System.out.println("your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);   }					}
   else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated thanks for participating");
			 System.out.println("your  score amount is "+amount);
			System.exit(0);	}
  else {
		   if(l1.get(3)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("your  score amount is "+amount);
		  		Question3();	     }
		   else {
		   System.out.println("You enterned wrong answer");
		   System.out.println("your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);
		  	   }}}
catch(InputMismatchException | IndexOutOfBoundsException e) {
	   e.getStackTrace();
	   System.out.println(e.getMessage());	   }	      	}
//============================================================================================================================	 
public void Question3() {
	try {System.out.println("<=+++++++++++++++++++++++++++++ Third question ++++++++++++++++++++++++++=>");
	 LinkedList l1=new LinkedList();
	 l1.add("C.What is the name of our National bird?");
	   l1.add("1.Peacock");
	   l1.add("2.Pigeon");
	   l1.add("3.Parrot");
	   l1.add("4.Sparrow");
	   l1.add("5.lifelines");
	   l1.add("6.Quit");
		 ListIterator itr=l1.listIterator();
	   while(itr.hasNext()) {
		System.out.println(itr.next()); 	 }
	   System.out.println("Choose any option?");
	   value=sc.nextInt();
	   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
			System.out.println("Enter your choice as 1.Audience poll 2.50:50");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Audience poll answers are 1.Peacock-30%  2.Pigeon-30% 3.Parrot-25% 4.Sparrow-15%");
				System.out.println("Choose any option?");
				value=0;
				   value=sc.nextInt();
			   if(l1.get(1)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count+=1;
			  		Question4();		   }
			   else if(l1.get(6)==l1.get(value)) {
					System.out.println("The game terminated Thanks for participating");
					 System.out.println("Your  score amount is "+amount);
					System.exit(0);
				}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }			
				break;
			case 2:
				System.out.println("50:50 answers are 1.Peacock & 3.Parrot");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(1)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question4();
		   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }							
				break;			}}
	   else if(l1.get(5)==l1.get(value) && count==0){
		System.out.println("You left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answer is 1.peacock-30% ,2.pigeon-30% 3.parrot-25% 4.Sparrow-15%");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(1)==l1.get(value )) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count+=1;
			  		Question4();
		   }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }}	
   else if(l1.get(5)==l1.get(value) && count1==0) {
	   System.out.println("You left with an only one option i.e., 50:50");
				System.out.println("50:50 answers are 1.Peacock or 3.Parrot");
			System.out.println("Choose any option?");
			   value=sc.nextInt();
		   if(l1.get(1)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your  score amount is "+amount);
		  		 count1+=1;
		  		Question4();	   }
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);	   }					}
   else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
		  System.out.println("You don't have any lifelines");
	   System.out.println("Choose any option");
	   value=sc.nextInt();
		   if(l1.get(1)==l1.get(value)) {
		 		  amount+=1000;
		 		 System.out.println("Your  score amount is "+amount);
		 		  Question4();		 		  	   }
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");		   
		   System.exit(0);	 		  	   }}
	   else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated thanks for participating");
			 System.out.println("Your  score amount is "+amount);
			System.exit(0);		}
	   else {
		   if(l1.get(1)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your  score amount is "+amount);
		  		Question4();
	     }else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);		  	   }}}
	catch(InputMismatchException | IndexOutOfBoundsException e) {
		   e.getStackTrace();
		   System.out.println("please enter correct input");}	  			      	}
//===========================================================================================================================
public void Question4() {
	try {
	 LinkedList l1=new LinkedList();
	 l1.add("D.Who is the father of the computer?");
	   l1.add("1.Tim Bernerlee");
	   l1.add("2.Dinnes Ritchie");
	   l1.add("3.KenThompson");
	   l1.add("4.Charless Babbage");
	   l1.add("5.Lifelines");
	   l1.add("6.Quit");
	   System.out.println("<=+++++++++++++++++++++Fourth question++++++++++++++++++++++++++++=>");
	 ListIterator itr=l1.listIterator();
	   while(itr.hasNext()) {
		System.out.println(itr.next()); 	 }
	   System.out.println("Choose any option?");
	   value=sc.nextInt();
	   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
			System.out.println("Enter your choice as 1.Audience poll 2.50:50");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Audience poll answer is 1.Timbernerlee-10%  2.Dinnes Ritchie-35% 3.Kenthompson-5% 4.Charless Babbage-50%");
				System.out.println("Choose any option?");
				value=0;
				   value=sc.nextInt();
			   if(l1.get(4)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count+=1;
			  		Question5();
		   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }			
				break;
			case 2:
				System.out.println("50:50 ans are 2.Dennis Ritchie & 4.Charless babbage");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(4)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question5();
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }							
				break;			}}
	   else	if(l1.get(5)==l1.get(value) && count==0){
		System.out.println("you left with an only one option i.e.,Audience poll");
				System.out.println("Audience poll answer is 1.Timbernerlee-10%  2.Dinnes Ritchie-35% 3.Kenthompson-5% 4.Charless Babbage-50%");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(4)==l1.get(value )) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count+=1;
			  		Question5();
		   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }}	
   else if(l1.get(5)==l1.get(value) && count1==0) {
		System.out.println("you left with an only one option i.e., 50:50");
			System.out.println("50:50 answers are 3.Tim bernerlee or 4.Charless Babbage");
			System.out.println("choose any option");
			   value=sc.nextInt();
		   if(l1.get(4)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your score amount is "+amount);
		  		 count1+=1;
		  		Question5();
	   }else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated Thanks for participating");
			 System.out.println("Your  score amount is "+amount);
			System.exit(0);
		}else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);	   }					}
   else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
		  System.out.println("You don't have any lifelines");
	   System.out.println("Choose any option?");
	   value=sc.nextInt();
		   if(l1.get(4)==l1.get(value)) {
		 		  amount+=1000;
		 		 System.out.println("Your score amount is "+amount);
		 		  Question5();
		 		  	   }else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);
			}else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your score amount is "+amount);
		   System.out.println("***Thanks for Participating***");		  
		   System.exit(0);		 		  	   }}
	   else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated thanks for participating");
			 System.out.println("Your score amount is "+amount);
			System.exit(0);		}
	   else {
		   if(l1.get(4)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("your  score amount is "+amount);
		  		Question5();
	     }else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);		  	   }}}
		   catch(InputMismatchException | IndexOutOfBoundsException e) {
			   e.getStackTrace();
			   System.out.println("Please enter correct input");}			      	}
//====================================================================================================================
	public void Question5() {
	try {
	 LinkedList l1=new LinkedList();
	 l1.add("E.Who invented the Java language?");
	   l1.add("1.Tim Bernerlee");
	   l1.add("2.Dinnes Ritchie");
	   l1.add("3.James Goosling");
	   l1.add("4.Charless Babbage");
	   l1.add("5.Lifelines");
	   l1.add("6.Quit");
	 	   System.out.println("<=+++++++++++++++++++++++++Fifth question+++++++++++++++++++++++++++++=>");
	 ListIterator itr=l1.listIterator();
	   while(itr.hasNext()) {
		System.out.println(itr.next()); 	 }
	   System.out.println("Choose any option");
	   value=sc.nextInt();
	   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
			System.out.println("Enter your choice as 1.Audience poll 2.50:50");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Audience poll answers are 1.Timbernerlee-5%  2.Dinnes Ritchie-12% 3.JAmes goosling-55% 4.Charless Babbage-28%");
				System.out.println("Choose any option");
				value=0;
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count+=1;
			  		Question6();
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }			
				break;
			case 2:
				System.out.println("50:50 answers are 2.Dennis Ritchie & 3.James Goosling");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question6();
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }							
				break;		}}
	   else	if(l1.get(5)==l1.get(value) && count==0){
		System.out.println("You left with an only one option i.e.,Audience poll");
				System.out.println("Audience poll answers are 1.Timbernerlee-10%  2.Dinnes Ritchie-35% 3.Kenthompson-5% 4.Charless Babbage-50%");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value )) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		 count+=1;
			  		Question6();
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }}
  else if(l1.get(5)==l1.get(value) && count1==0) {
		System.out.println("You left with an only one option i.e., 50:50");
		System.out.println("50:50 answers are 3.Tim bernerlee or 4.Charless Babbage");
			System.out.println("Choose any option?");
			   value=sc.nextInt();
		   if(l1.get(3)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your  score amount is "+amount);
		  		 count1+=1;
		  		Question6();
	   }else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);	   }					}
	else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
		  System.out.println("you don't have any lifelines");
	   System.out.println("choose any option");
	   value=sc.nextInt();
		   if(l1.get(3)==l1.get(value)) {
		 		  amount+=1000;
		 		 System.out.println("your  score amount is "+amount);
		 		  Question6();
		 		  	   } else if(l1.get(6)==l1.get(value)) {
		 					System.out.println("The game terminated thanks for participating");
		 					 System.out.println("Your  score amount is "+amount);
		 					System.exit(0);}else {
		   System.out.println("You entered wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");		   
		   System.exit(0);		 		  	   }}
	   else if(l1.get(6)==l1.get(value)) {
			System.out.println("The game terminated thanks for participating");
			 System.out.println("Your  score amount is "+amount);
			System.exit(0);	}
	   else {
		   if(l1.get(3)==l1.get(value)) {
		  		  amount+=1000;
		  		 System.out.println("Your  score amount is "+amount);
		  		Question6();
	     }else {
		   System.out.println("You enterned wrong answer");
		   System.out.println("Your  score amount is "+amount);
		   System.out.println("***Thanks for Participating***");
		   System.exit(0);		  	   }}}
		   catch(InputMismatchException | IndexOutOfBoundsException e) {
			   e.getStackTrace();
			   System.out.println("Please enter correct input");}}
//==========================================================================================================================
	public void Question6() {
		try {
		 LinkedList l1=new LinkedList();
		 l1.add("F.Who invented the C language?");
		   l1.add("1.Tim Bernerlee");
		   l1.add("2.Dinnes Ritchie");
		   l1.add("3.James Goosling");
		   l1.add("4.Charless Babbage");
		   l1.add("5.Lifelines");
		   l1.add("6.Quit");
		 	   System.out.println("<=+++++++++++++++++++Sixth question+++++++++++++++++++++++++=>");
		 ListIterator itr=l1.listIterator();
		   while(itr.hasNext()) {
			System.out.println(itr.next()); 		 }
		   System.out.println("choose any option");
		   value=sc.nextInt();
		   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
				System.out.println("Enter your choice as 1.Audience poll 2.50:50");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Audience poll answers are 1.Timbernerlee-5%  2.Dinnes Ritchie-72% 3.JAmes goosling-8% 4.Charless Babbage-5%");
					System.out.println("Choose any option");
					value=0;
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question7();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }			
					break;
				case 2:
					System.out.println("50:50 ans are 2.Dennis Ritchie & 3.James Goosling");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count1+=1;
				  		Question7();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }							
					break;				}}
		   else	if(l1.get(5)==l1.get(value) && count==0){
			System.out.println("You left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answer is 1.Timbernerlee-5%  2.Dinnes Ritchie-72% 3.James Goosling-8% 4.Charless Babbage-5%");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value )) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  	 Question7();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }}	
	  else if(l1.get(5)==l1.get(value) && count1==0) {
			System.out.println("You left with an only one option i.e., 50:50");
				System.out.println("50:50 answers are 2.Dinnes Ritchie or 4.Charless Babbage");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count1+=1;
			  		Question7();
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }						}
	  else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
			  System.out.println("You don't have any lifelines");
		   System.out.println("Choose any option?");
		   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			 		  amount+=1000;
			 		 System.out.println("Your  score amount is "+amount);
			 		 Question7();
			 		  	   }else if(l1.get(6)==l1.get(value)) {
								System.out.println("The game terminated Thanks for participating");
								 System.out.println("Your  score amount is "+amount);
								System.exit(0);
							}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");			
			   System.exit(0);			 		  	   }}
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);			}
		   else {
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		Question7();
		     } else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);			  	   }}	}
			   catch(InputMismatchException | IndexOutOfBoundsException e) {
				   e.getStackTrace();
				   System.out.println("Please enter correct input");}}
//==================================================================================================================================
	public void Question7() {
		try {
		 LinkedList l1=new LinkedList();
		 l1.add("G.Who invented the HTML language?");
		   l1.add("1.Tim Bernerlee");
		   l1.add("2.Dinnes Ritchie");
		   l1.add("3.James Goosling");
		   l1.add("4.Charless Babbage");
		   l1.add("5.Lifelines");
		   l1.add("6.Quit");
		 	   System.out.println("<=++++++++++++++++++++++++Seventh question+++++++++++++++++++++++++=>");
		 ListIterator itr=l1.listIterator();
		   while(itr.hasNext()) {
			System.out.println(itr.next()); 		 }
		   System.out.println("Choose any option?");
		   value=sc.nextInt();
		   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
				System.out.println("Enter your choice as 1.Audience poll 2.50:50");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Audience poll answer is 1.Timbernerlee-75%  2.Dinnes Ritchie-13% 3.James goosling-2% 4.Charless Babbage-10%");
					System.out.println("Choose any option?");
					value=0;
					   value=sc.nextInt();
				   if(l1.get(1)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question8();
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);		   }			
					break;
				case 2:
					System.out.println("50:50 answers are 2.Dennis Ritchie & 1.Tim Bernerlee");
					System.out.println("Choose any option");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count1+=1;
				  		Question8();
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }							
					break;				}}
		   else	if(l1.get(5)==l1.get(value) && count==0){
			System.out.println("You left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answers are 1.Timbernerlee-75%  2.Dinnes Ritchie-13% 3.James Goosling-2% 4.Charless Babbage-10%");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(1)==l1.get(value )) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question8();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }}	
	  else if(l1.get(5)==l1.get(value) && count1==0) {
			System.out.println("you left with an only one option i.e., 50:50");
				System.out.println("50:50 answers are 2.Dinnes Ritchie or 1.Tim Bernerlee");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your score amount is "+amount);
			  		 count1+=1;
			  		Question8();
		   }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }						}
		else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
			  System.out.println("You don't have any lifelines");
		   System.out.println("Choose any option");
		   value=sc.nextInt();
			   if(l1.get(1)==l1.get(value)) {
			 		  amount+=1000;
			 		 System.out.println("Your score amount is "+amount);
			 		Question8();
			 		  	   } else if(l1.get(6)==l1.get(value)) {
								System.out.println("The game terminated thanks for participating");
								 System.out.println("Your  score amount is "+amount);
								System.exit(0);}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");			
			   System.exit(0);			 		  	   }}
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);			}
		   else {
			   if(l1.get(1)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  	Question8();		     }
			  else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);			  	   }}	}
			   catch(InputMismatchException | IndexOutOfBoundsException e) {
				   e.getStackTrace();
				   System.out.println("Please enter correct input");}}
	//============================================================================================================
	public void Question8() {
		try {
		 LinkedList l1=new LinkedList();
		 l1.add("H.what is the total of this equation 20*0+3-3+12*2%2+6 ?");
		   l1.add("1.20");
		   l1.add("2.50");
		   l1.add("3.18");
		   l1.add("4.36");
		   l1.add("5.Lifelines");
		   l1.add("6.Quit");
		 	   System.out.println("<=+++++++++++++++++++++++++++++++++Eighth question+++++++++++++++++++++++++++++++->");
		 ListIterator itr=l1.listIterator();
		   while(itr.hasNext()) {
			System.out.println(itr.next()); 		 }
		   System.out.println("choose any option");
		   value=sc.nextInt();
		   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
				System.out.println("Enter your choice as 1.Audience poll 2.50:50");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Audience poll answer is 1.20-5%  2.50-8% 3.18-32% 4.36-45%");
					System.out.println("Choose any option?");
					value=0;
					   value=sc.nextInt();
				   if(l1.get(3)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question9();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }			
					break;
				case 2:
					System.out.println("50:50 answers are 1.20 & 3.18");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(3)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count1+=1;
				  		Question9();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }							
					break;				}}
		   else	if(l1.get(5)==l1.get(value) && count==0){
			System.out.println("you left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answers are 1.20-5%  2.50-8% 3.18-32% 4.36-45%");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value )) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question9();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }}								
	  else if(l1.get(5)==l1.get(value) && count1==0) {
			System.out.println("You left with an only one option i.e., 50:50");
				System.out.println("50:50 answers are 1.20 or 3.18");
				System.out.println("Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question9();
		   }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }				  }
		else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
			  System.out.println("You don't have any lifelines");
		   System.out.println("Choose any option");
		   value=sc.nextInt();
			   if(l1.get(3)==l1.get(value)) {
			 		  amount+=1000;
			 		 System.out.println("Your  score amount is "+amount);
			 		 Question9();			 		  	   }
			   else if(l1.get(6)==l1.get(value)) {
					System.out.println("The game terminated thanks for participating");
					 System.out.println("Your  score amount is "+amount);
					System.exit(0);
			   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");			
			   System.exit(0);			 		  	   }}
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);			}
		   else {
			   if(l1.get(3)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		Question9();
		     }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);			  	   }}	}
			   catch(InputMismatchException | IndexOutOfBoundsException e) {
				   e.getStackTrace();
				   System.out.println("Please enter correct input");}}
	//==================================================================================================================
	public void Question9() {
		try {
		 LinkedList l1=new LinkedList();
		 l1.add("I.what is the period of Second WorldWar ?");
		   l1.add("1.1914-1918");
		   l1.add("2.1939-1945");
		   l1.add("3.1920-1926");
		   l1.add("4.1950-1956");
		   l1.add("5.lifelines");
		   l1.add("6.Quit");
		 	   System.out.println("<=+++++++++++++++++++++++++Nineth question++++++++++++++++++++++++++=>");
		 ListIterator itr=l1.listIterator();
		   while(itr.hasNext()) {
			System.out.println(itr.next()); 		 }
		   System.out.println("choose any option");
		   value=sc.nextInt();
		   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
				System.out.println("Enter your choice as 1.Audience poll 2.50:50");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Audience poll answer is 1.1914-1918=25%  2.1939-1945=42% 3.1920-1926=8% 4.1950-1956=25%");
					System.out.println("Choose any option?");
					value=0;
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question10();
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }			
					break;
				case 2:
					System.out.println("50:50 ans are 1.1914-1918 & 3.1939-1945");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count1+=1;
				  		Question10();
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);		   }							
					break;				}}
		   else	if(l1.get(5)==l1.get(value) && count==0){
			System.out.println("You left with an only one option i.e.,Audience poll");
					System.out.println("Audience poll answer is 1.1914-1918=25%  2.1939-1945=42% 3.1920-1926=8% 4.1950-1956=25%");
					System.out.println("Choose any option?");
					   value=sc.nextInt();
				   if(l1.get(2)==l1.get(value )) {
				  		  amount+=1000;
				  		 System.out.println("Your  score amount is "+amount);
				  		 count+=1;
				  		Question10();
			   }else {
				   System.out.println("You enterned wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);   }}		
	  else if(l1.get(5)==l1.get(value) && count1==0) {
			System.out.println("you left with an only one option i.e., 50:50");
						System.out.println("50:50 answers are 1.1914-1918 or 2.1939-1945");
				System.out.println("Choose any option");
				   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("Your  score amount is "+amount);
			  		 count1+=1;
			  		Question10();
		   }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }						}
		else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
			  System.out.println("You don't have any lifelines");
		   System.out.println("Choose any option?");
		   value=sc.nextInt();
			   if(l1.get(2)==l1.get(value)) {
			 		  amount+=1000;
			 		 System.out.println("Your  score amount is "+amount);
			 		 Question10();
			 		  	   }else if(l1.get(6)==l1.get(value)) {
								System.out.println("The game terminated thanks for participating");
								 System.out.println("your  score amount is "+amount);
								System.exit(0);}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");			
			   System.exit(0);		 		  	   }}
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for participating");
				 System.out.println("Your  score amount is "+amount);
				System.exit(0);			}
		   else {
			   if(l1.get(2)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		Question10();
		     }else {
			   System.out.println("You enterned wrong answer");
			   System.out.println("Your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);			  	   }}	}
			   catch(InputMismatchException | IndexOutOfBoundsException e) {
				   e.getStackTrace();
				   System.out.println("Please enter correct input");}}
	//=========================================================================================================
	public void Question10() {
		try {
		 LinkedList l1=new LinkedList();
		 l1.add("H.Who is the father of chemistry ?");
		   l1.add("1.John Dalton");
		   l1.add("2.Joseph Priestly");
		   l1.add("3.Albert Einstein");
		   l1.add("4.Antoine Lavoisier");
		   l1.add("5.Lifelines");
		   l1.add("6.Quit");
		 	   System.out.println("<=++++++++++++++++++++++++++++++Final question of the game+++++++++++++++++++++++++++=>");
		 ListIterator itr=l1.listIterator();
		   while(itr.hasNext()) {
			System.out.println(itr.next()); 		 }
		   System.out.println("choose any option");
		   value=sc.nextInt();
		   if(l1.get(5)==l1.get(value) && count==0 && count1==0){
				System.out.println("enter your choice as 1.Audience poll 2.50:50");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Audience poll answers are 1.John Dalton-5%  2.Joseph Priestly-8% 3.Albert Einstein-32% 4.Antoine Lavoisier-45%");
					System.out.println("Choose any option?");
					value=0;
					   value=sc.nextInt();
				   if(l1.get(4)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Congratulations "+getName()+" your total score amount is "+amount);
				  		System.out.println("%%%%%%%%%%==========> You won the game <=============%%%%%%%%%%%");
				  		 count+=1;
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }			
					break;
				case 2:
					System.out.println("50:50 answers are 1.John Dalton & 4.Antoine Lavoisier");
					System.out.println("Choose any option");
					   value=sc.nextInt();
				   if(l1.get(4)==l1.get(value)) {
				  		  amount+=1000;
				  		 System.out.println("Congratulations "+getName()+" your total score amount is "+amount);
				  		System.out.println("%%%%%%%%%%==========> You won the game <=============%%%%%%%%%%%");
				  		 count1+=1;
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);			   }							
					break;				}}
		   else	if(l1.get(5)==l1.get(value) && count==0){
			System.out.println("You left with an only one option i.e.,Audience poll");
								System.out.println("Audience poll answer is  1.John Dalton-5%  2.Joseph Priestly-8% 3.Albert Einstein-32% 4.Antoine Lavoisier-45%");
					System.out.println("Choose any option");
					   value=sc.nextInt();
				   if(l1.get(4)==l1.get(value )) {
				  		  amount+=1000;
				  		 System.out.println("Congartualtions"+getName()+ " your total score amount is "+amount);
				  		System.out.println("%%%%%%%%%%==========> You won the game <=============%%%%%%%%%%%");
				  		 count+=1;
			   }else {
				   System.out.println("You entered wrong answer");
				   System.out.println("Your  score amount is "+amount);
				   System.out.println("***Thanks for Participating***");
				   System.exit(0);		   }}	
	  else if(l1.get(5)==l1.get(value) && count1==0) {
			System.out.println("you left with an only one option i.e., 50:50");
				System.out.println("50:50 answers are 1.John Dalton or 4.Antoine Lavoisier");
				System.out.println(" Choose any option?");
				   value=sc.nextInt();
			   if(l1.get(4)==l1.get(value)) {
			  		  amount+=1000;
			  		 System.out.println("your  score amount is "+amount);
			  		 count1+=1;
		   }else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);		   }						}
		else if(l1.get(5)==l1.get(value) && count!=0 && count1!=0) {
			  System.out.println("You don't have any lifelines");
		   System.out.println("Choose any option");
		   value=sc.nextInt();
			   if(l1.get(4)==l1.get(value)) {
			 		  amount+=1000;
			 		 System.out.println("Congratulations "+getName()+" your total score amount is "+amount);
			 		System.out.println("%%%%%%%%%%==========> You won the game <=============%%%%%%%%%%%");				 		  	   }
			   else if(l1.get(6)==l1.get(value)) {
					System.out.println("The game terminated thanks for participating");
					 System.out.println("Your score amount is "+amount);
					System.exit(0);}else {
			   System.out.println("You entered wrong answer");
			   System.out.println("your  score amount is "+amount);
			   System.out.println("***Thanks for Participating***");			
			   System.exit(0);
			 		  	   }}
		   else if(l1.get(6)==l1.get(value)) {
				System.out.println("The game terminated Thanks for Participation");
				 System.out.println("Your score amount is "+amount);
				System.exit(0);			}
		   else {
			   if(l1.get(4)==l1.get(value)) {
			  		  amount+=1000;
					System.out.println("Congratulations "+getName()+" your total score amount is "+amount);
			  		 System.out.println("%%%%%%%%%%==========> You won the game <=============%%%%%%%%%%%");
		     } else {
			   System.out.println("You entered wrong answer");
			   System.out.println("Your score amount is "+amount);
			   System.out.println("***Thanks for Participating***");
			   System.exit(0);			  	   }}	}
			   catch(InputMismatchException | IndexOutOfBoundsException e) {
				   e.getStackTrace();
				   System.out.println("Please enter correct input");}}	}
	 

