package 第10次作业;
import java.util.Scanner;
import java.util.ArrayList;
public class Test1 {
	    public static void main(String[] args)
	    {
	        ArrayList<Container> containers = new ArrayList<>();
	        containers.add(new Container());
	        System.out.print("Enter the number of the objects: ");
	        Scanner input = new Scanner(System.in);
	        int num = input.nextInt();
	        System.out.print("Enter the weights of the objects: ");
	        for(int i=0;i<num;i++){
	            int tmp = input.nextInt();
	            boolean in=false;
	            for(Container now : containers){
	                if(now.weightLeft>=tmp){
	                    now.asses.add((double) tmp);
	                    now.weightLeft-=tmp;
	                    in=true;
	                    break;
	                }
	            }
	            if(!in) {
	                Container jj = new Container();
	                jj.weightLeft-=tmp;
	                jj.asses.add((double) tmp);
	                containers.add(jj);
	            }
	        }
	        int index=1;
	        for(Container jojo:containers){
	            System.out.print("Container "+index+" contains objects with weight ");
	            index++;
	            for(Double jj:jojo.asses)
	                System.out.print(jj+" ");
	            System.out.print('\n');
	        }
	    }

	}
	class Container{
	    public double weightLeft = 10;
	    public ArrayList<Double> asses;
	    public Container(){
	        asses = new ArrayList<>();
	    }
	}