package studentexam;
import java.io.*;
import java.util.*;

public class OnlineExam {
	String fullname;
	String gender;
	String username;
	String password;
	String pno;
	int count=0;
	int score=0;
	int attempt=0;
	Scanner sc=new Scanner(System.in);
	HashMap<String,String> data=new HashMap<String,String>();
	public void register()
	{
		System.out.println(".....Registration........");
		System.out.println("enter your full name:");
		this.fullname=sc.nextLine();
		System.out.println("enter the gender(M/F):");
		this.gender=sc.nextLine();
		String gender1="M";
		String gender2="m";
		String gender3="F";
		String gender4="f";
		while(!((((this.gender).equals(gender1))||((this.gender)).equals(gender2))||((this.gender).equals(gender3))||((this.gender).equals(gender4))))
      {
	    System.out.print("invalid...please enter the correct gender(M/F)"); 
	    this.gender=sc.nextLine();
      }
      if(this.gender.equals(gender1)||this.gender.equals(gender2))
      {
    	  this.gender="Male";
      }
      else
      {
    	  this.gender="Female";
      }
      System.out.print("enter username:");
      this.username=sc.nextLine();
      System.out.print("enter the password:");
      this.password=sc.nextLine();
      data.put(this.username, this.password);
      System.out.println("enter the pnumber:");
      this.pno=sc.nextLine();
      while(pno.length()!=10)
      {
    	  System.out.print("!!!please enter the valid 10 digit mobile number:");
    	  this.pno=sc.nextLine();
    	  
      }
      System.out.println("your are successfully registered..");
      System.out.println("please login to take online exam");
	}
	
	public boolean login()
	{
		boolean log=false;
		System.out.print("enter your user name:");
		String Username;
		Username=sc.nextLine();
		if(data.containsKey(Username))
		{
			System.out.print("enter the your password:");
			String Pass;
			Pass=sc.nextLine();
			if(data.containsKey(Username)&&data.containsValue(Pass))
			{
				System.out.println("login successfully");
				log=true;
			}
			else
			{
				System.out.println("you have entered wring password");
			}
		}
		else
		{
			System.out.println("user doesn't exists please register first");
		}
		return log;
	}
	public void View_Profile()
	{
		System.out.println("your profile:");
		System.out.println("full name:"+this.fullname);
		System.out.println("gender:"+this.gender);
		System.out.println("user name:"+this.username);
		System.out.println("password(Don,t share with any one):"+this.password);
		System.out.println("phone number:"+this.pno);
	}
	public void Update_Profile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the username:");
		String Username;
		Username=sc.nextLine();
		if(Username.equals(this.username))
		{
			System.out.println("select:\n1.To change Username\n2.To change password");
			int ch;
			System.out.print("Your option:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 :Update_Username();
			break;
			case 2:Update_PassWord();
			break;
			default:System.out.println("Invalid option...");
			}
		}
		else
		{
			System.out.println("user does not exit please register first\n");
		}
	}
	public void Update_Username()
	{
		Scanner sc=new Scanner(System.in);
		String User;
		String User1;
		System.out.println("Enter the new user name to update:");
		User=sc.nextLine();
		if(!(User.equals(this.username)))
		{
			System.out.print("conform new user name to update:");
			User1=sc.nextLine();
			if(User.equals(User1))
			{
				System.out.println("Username updated successfully..");
				this.username=User1;
				return;
			}
			else
			{
				System.out.println("you must type the same username...");
				Update_Username();
			}
		}
		System.out.println("New username and present username cannot not be same...");
		Update_Username();
	}

public void Update_PassWord(){
    Scanner input=new Scanner(System.in);
    String Pass;
    String Pass1;
    System.out.print("Enter New Password to Update: ");
    Pass=input.nextLine();
    if(!(Pass.equals(this.password))){
        System.out.print("Conform New Password to Update: ");
        Pass1=input.nextLine();
        if(Pass.equals(Pass1)){
            System.out.println("Password Updated Successfully...");
            this.password=Pass1;
            return;
        }
        else{
            System.out.println("You must type the same Password...");
            Update_PassWord();
        }
    }
    else{
        System.out.println("New Password and Present Password cannot not be same...");
        Update_PassWord();
    }
}
public void Take_exam(){
    long examtime=System.currentTimeMillis();
    long endtime=examtime+45*1000;
    int ans;
    int ch;
    System.out.println("Select Subject to take exam: ");
    System.out.println("1.Mathematics\n2.Java Programming\n3.C-Programming Language");
System.out.print("Your choice: ");
    ch=sc.nextInt();
    if(ch==1){
        System.out.println("Welcome to Mathematics Exam: ");
        System.out.println("Each Question carries 10 marks"+" "+" -5 for wrong answers");
        System.out.println("You have 45 seconds to answer 5 questions");
        attempt=0;
        while(System.currentTimeMillis()<endtime){
	count=0;
            System.out.println("Question 1. 32/16 = ?");
            System.out.println("Option 1. 2\nOption 2. 3\nOption 3. 4\nOption 4. 5\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==1){
                count++;
            }
            System.out.println("Question 2. 100*10 = ?");
            System.out.println("Option 1. 10\nOption 2. 100\nOption 3. 1000\nOption 4. 10000\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==3){
                count++;
            }
            System.out.println("Question 3. 1+10 = ?");
            System.out.println("Option 1. 9\nOption 2. 11\nOption 3. 7\nOption 4. 13\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==2){
                count++;
            }
            System.out.println("Question 4. 15*9 = ?");
            System.out.println("Option 1. 120\nOption 2. 150\nOption 3. 159\nOption 4. 135\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==4){
                count++;
            }
            System.out.println("Question 5. 20-0 = ?");
            System.out.println("Option 1. 20\nOption 2. 0\nOption 3. 19\nOption 4. 15\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==1){
                count++;
            }
            attempt++;
            break;
        }
    }
    else if(ch==2){
        System.out.println("Welcome to Java Programming Exam: ");
        System.out.println("Each Question carries 10 marks"+" "+" -5 for wrong answers");
        System.out.println("You have 45 seconds to answer 5 questions");
        attempt=0;
        while(System.currentTimeMillis()<endtime){
	count=0;
            System.out.println("Question 1. Java is developed by : ");
            System.out.println("Option 1. Dennis Ritchie\nOption 2. James Gosling\nOption 3. Sundar Pichai\nOption 4. Satya Nadella\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==2){
                count++;
            }
            System.out.println("Question 2. Java is : ");
            System.out.println("Option 1. Platform InDependent\nOption 2. Platform Dependent\nOption 3. Both 1 and 2\nOption 4. None\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==1){
                count++;
            }
            System.out.println("Question 3. After Compilation Java generates : ");
            System.out.println("Option 1. Object File\nOption 2. Zip File\nOption 3. Class File\nOption 4. Rar File\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==3){
                count++;
            }
            System.out.println("Question 4. Java is : ");
            System.out.println("Option 1. Compiled Language\nOption 2. Interpreted Language\nOption 3. Both 1 and 2\nOption 4. None\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==3){
                count++;
            }
            System.out.println("Question 5. To save java files we use :");
            System.out.println("Option 1. .jv\nOption 2. .jvm\nOption 3. .javac\nOption 4. .java\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==4){
                count++;
            }
            attempt++;
            break;
        }
    }
    else if(ch==3){
        System.out.println("Welcome to C-Programming Language Exam: ");
        System.out.println("Each Question carries 10 marks"+" "+" -5 for wrong answers");
        System.out.println("You have 45 seconds to answer 5 questions");
        attempt=0;
        while(System.currentTimeMillis()<endtime){
	count=0;
            System.out.println("Question 1. C is developed by : ");
            System.out.println("Option 1. James Gosling\nOption 2. Sundar Pichai\nOption 3. Dennis Ritchie\nOption 4. Mark Zukenburg\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==3){
                count++;
            }
            System.out.println("Question 2. C is a : ");
            System.out.println("Option 1. Compiled Language\nOption 2. Interpreted Language\nOption 3. Both 1 and 2\nOption 4. None\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==1){
                count++;
            }
            System.out.println("Question 3. C is a :");
            System.out.println("Option 1. Object Oriented\nOption 2. Procedure Oriented\nOption 3. Both 1 and 2\nOption 4. None\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==2){
                count++;
            }
            System.out.println("Question 4. All keywords in C are in : ");
            System.out.println("Option 1. LowerCase letters\nOption 2. UpperCase letters\nOption 3. CamelCase letters\nOption 4. None of the mentioned\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==1){
                count++;
            }
            System.out.println("Question 5. Which keyword is used to prevent any changes in the variable within a C program : ");
            System.out.println("Option 1. immutable\nOption 2. mutable\nOption 3. const\nOption 4. volatile\n");
            System.out.print("Enter Your Answer: ");
            ans=sc.nextInt();
            if(ans==3){
                count++;
            }
            attempt++;
            break;
        }
    }
    else{
        System.out.println("Invalid option...Please Try Again...");
        Take_exam();
    }
}
public void View_Marks(){
int score=((10*count)-((5-count)*5));
if(score==50){
    System.out.println("Congratulations....");
}
else if(score<50 && score>=35){
    System.out.println("Well Done...");
}
else if(score<35 && score>=20){
    System.out.println("Well Tried...");
}
else if(score<20 && score>=10){
    System.out.println("Good...");
}
else{
    System.out.println("Ok! Try Again...");
}
    if(attempt==1){
        System.out.println("Your Score: "+score+"/50");
    }
    else{
        System.out.println("You haven't Written any exam...");
    }
}
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("-------WELCOME TO ONLINE EXAMINATION-------");
    System.out.println("Please Register first to write the exam...");
    System.out.println("1.Register(New Users should Register First)\n2.Exit");
    System.out.print("Your choice:");
    int choice;
    choice=input.nextInt();
    if(choice==1){
        OnlineExam exam=new OnlineExam();
        exam.register();
        while(choice==1){
            System.out.println("\n Select any one option: ");
            System.out.println("1.Login(If already Registered)\n2.Exit");
            System.out.print("Your option :");
            int option=input.nextInt();
            if (option==1){
                if(exam.login()){
                    while(true){
                        System.out.println("\n\nWelcome to Online Examination");
                        System.out.println("1.View Profile\n2.Update Profile and Password\n3.Take Exam\n4.View Marks\n5.Logout");
                        System.out.print("Enter your option :");
                        int select; 
                        select=input.nextInt();
                        switch(select){
                            case 1 : exam.View_Profile();
                                     break;
                            case 2 : exam.Update_Profile();
                                     break;
                            case 3 : exam.Take_exam();
                                     break;
                            case 4 : exam.View_Marks();
                                     break;
                            case 5 : System.out.println("\nLogged out Successfully..."); 
                                     System.exit(0);
                                     break;
                            default: System.out.println("Invalid option!...Enter Valid option...");
                        }
                    }
                }
            }
            else{
                System.out.println("\nThank you...Visit Again...:)"); 
                System.exit(0);
            }
        }
    }
    else {
        System.out.println("\nThank you...Visit Again...:)"); 
    	System.exit(0);
    }
}
}
	