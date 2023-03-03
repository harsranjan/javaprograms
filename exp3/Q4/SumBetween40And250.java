class SumBetween40And250
    {
        public static void main(String arg[]){
        int sum=0;
        for(int i=40;i<251;i++)
        {
            if(i%5==0)
            {
                System.out.println(i);
                sum=sum+i;   
            }   
        }
        System.out.println("The sum of all integers greater than 40 and less than 250 that are divisible by 5 :\n"+sum);
    }
}