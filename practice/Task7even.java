class zam{
    int join = 200;
    int stop = 300;

    public void three(){
         System.out.println("even num btw " +join+"and" +stop);

         while(join<=stop){
            if(join % 2==0){
                System.out.println(join);
            }
            join++;
         }
         
    }
}


public class Task7even{
    public static void main(String[] args) {
        zam how = new zam();
        how.three();
        
    }
}
