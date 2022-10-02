import java.util.Scanner;

import com.hrms.useCase.AddDept;
import com.hrms.useCase.AddEmp;
import com.hrms.useCase.ApplyLeave;
import com.hrms.useCase.ApproveLeave;
import com.hrms.useCase.ListAllDept;
import com.hrms.useCase.ListAllEmp;
import com.hrms.useCase.ListAllLeave;
import com.hrms.useCase.LoginAdmin;
import com.hrms.useCase.LoginEmployee;
import com.hrms.useCase.TransferEmp;
import com.hrms.useCase.UpdateDept;
import com.hrms.useCase.UpdateProfileAdmin;
import com.hrms.useCase.UpdateProfileEmp;
import com.hrms.useCase.ViewProfileEmp;

class App{

    public static void main(String args[]){
        
        
        Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("WELCOME to Human Resource management system...");
		
		while(true){
			
			System.out.println("Choose any...");
			System.out.println("1. Login as Admin ");
			System.out.println("2. Login as Employee");
			System.out.println("3. Exit Application");

			int login=sc.nextInt();
			
			if(login ==1)
			{
				LoginAdmin adminlogin =new LoginAdmin();
				LoginAdmin.main(args);
				boolean loopadmin=true;
				while(loopadmin)
				{
				System.out.println("1. Add new Department ");
				System.out.println("2. View all departments");
				System.out.println("3. Update department");
				System.out.println("4. Add new Employee");
				System.out.println("5. Transfer Employee Department");
				System.out.println("6. Approve Leave");
				System.out.println("7. Logout");
				System.out.println("8. Update profile");
				System.out.println("9. View all leaves");
				
				System.out.println("Enter a number");
			    int num2=sc.nextInt();
			    
			    switch(num2)
			    {
			        case 1:
			        {
			        	AddDept.main(args);
			        	break;
			        }
			        case 2:
			        {
			        	ListAllDept.main(args);
			        	break;
			        }
			        case 3:
			        {
			        	UpdateDept.main(args);
			        	break;
			        }
			        case 4:
			        {
			        	AddEmp.main(args);
			        	break;
			        }
			        case 5:
			        {
			        	TransferEmp.main(args);
			        	break;
			        }
			        case 6:
			        {
			        
			        	ApproveLeave.main(args);
			        	break;
			        }
			        case 7:
			        {
			        	System.out.println("Admin is Log out ");
			        	loopadmin=false;
			        	break;
			        }
			        case 8:
			        {
			        	
			        	UpdateProfileAdmin.main(args);
			        	break;
			        }
			        case 9:
			        {
			    
			        	ListAllLeave.main(args);
			        	break;
			        }
			        default:
			        {
			        	System.out.println("Enter valid input");
			        }

			    }
			    
				} 
			
			}
			else if(login ==2)
			{
				
				LoginEmployee.main(args);
				
				boolean loopemployee=true;
				while(loopemployee)
				{
				System.out.println("1. View  profile");
				System.out.println("2. Update  profile");
				System.out.println("3. Show all employees ");
				System.out.println("4. apply for Leave request ");
				System.out.println("5. Logout");
				
				System.out.println("Enter a number");
			    int num2=sc.nextInt();
			    
			    switch(num2)
			    {
			        case 1:
			        {
			        	ViewProfileEmp.main(args);
			        	break;
			        }
			        case 2:
			        {
			        	UpdateProfileEmp.main(args);
			        	break;
			        }
			        case 3:
			        {
			        	ListAllEmp.main(args);
			        	break;
			        }
			        case 4:
			        {
			        	ApplyLeave.main(args);
			        	break;
			        }
			        case 5:
			        {
			        	System.out.println("Logged out ");
			        	loopemployee=false;
			        	break;
			        }
			        default:
			        {
			        	System.out.println("Enter valid input");
			        	
			        }

			    }
			    
				} 
		
			
			}
			else
			{
				System.out.println("Thank you ...!!!");
				break;
				
			}
		}
		
		
		
		
    }

}