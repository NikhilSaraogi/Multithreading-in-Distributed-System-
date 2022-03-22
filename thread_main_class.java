//->>>>>>>>>>>>>>>>>>>>>>>>>.packages>>>>>>>>>>>>>>>
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  


class thread_main_class{
    public static void main(String[] args){

        //checking for the time of starting 
        long start = System.currentTimeMillis();

        //start code here======================== for single thread environment >>
        
         //>>object to single_bubble_sort :: obj_0
         single_bubble_sort obj_0 = new single_bubble_sort();

         //System.out.println("Unsorted Array is\n ");
         //obj_0.printArray(arr);
         
         
         //>>run object 
         obj_0.bubbleSort();
         //System.out.println("\n\nSorted Array is in Single Thread environment (using Bubble Sort) : \n");
         //obj_0.printArray(arr);

         //>>object to single_bubble_sort :: obj_0
         single_merge_sort obj_1 = new single_merge_sort();

         obj_1.merge_sort();
         //System.out.println("Sorted Array is in Single Thread environment (Merge Sort) : \n ");
         //obj_1.print_it(arr);
          

        //End code here 

        //checking for the time of exiting 
        long end = System.currentTimeMillis();

         //time taken by exicution of of program
         long time_taken = (end-start);
         System.out.println("\n\nTime Taken in Sorting On single Thread is in (milisecond)");
         System.out.print(time_taken);

         System.out.println("\n\nSingle thread environment ENDS here ");

        
        
        
        
        //start code here======================== for multi thread environment >>


        multi_bubble_sort obj_4 = new multi_bubble_sort();
        multi_merge_sort  obj_3 = new multi_merge_sort();

        

        //checking for the time of starting 

        long start_m = System.currentTimeMillis();
        obj_4.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj_3.start();
        try{Thread.sleep(10);} catch(Exception e){}
        //checking for the time of end 
        long end_m = System.currentTimeMillis();

        //time taken by exicution of of program
        long time_taken_m = (end_m-start_m);
        System.out.println("\n\nTime Taken in Sorting On multi Thread is in (milisecond)");
        System.out.print(time_taken_m);

        System.out.println("\n\nmulti thread environment ENDS here ");

        //------------------------------creating the file to Right the Output to it 

      // File file_0 = new File("F:\\Z-MCA\\SEM-1\\ZZZ_dos_orignal_process\\result.txt");   
       
        // if(file_0.exists()){
        //     System.out.println("Filename is " + file_0.getName());
        //     System.out.println("location is  " + file_0.getAbsolutePath());
        //     System.out.println("readable " + file_0.canRead());
        //     System.out.println("writeable " + file_0.canWrite());

        // }else{
        //     System.out.println("file not present");
        // }

        
        String output_time_file_0_multi = String.valueOf(time_taken_m);
        String output_time_file_0_single = String.valueOf(time_taken);


        //for file_0
        try {
            FileWriter file_0 = new FileWriter("D:\\Distibuted_environment\\result_0.txt");  
            file_0.write("This Operation is done on Nikhil's PC\n\n");
            file_0.write("Time Taken in Sorting On multi Thread is in (milisecond)\n");
            file_0.write(output_time_file_0_multi);
            file_0.write("\n\nTime Taken in Sorting On single Thread is in (milisecond)\n");
            file_0.write(output_time_file_0_single);
            file_0.close();
            System.out.println("Output is sucessfull worte to file");
        } catch (Exception e) {
            System.out.println("file not present");
            e.printStackTrace();
        }

        

       
    
        

    }
}