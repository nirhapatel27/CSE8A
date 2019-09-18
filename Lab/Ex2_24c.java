class Ex2_24c 
{

    public static void main(String[] args)
    {

        int[] number; // declaring the data type of the array
        number = new int[5]; //determine the range of array
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
        for(int counter = 0; counter<number.length;counter++)
        {
          number[counter] = input.nextInt();

        }

        for(int i = 0; i<number.length; i++)
        {
            if(number[i]<smallest)
                smallest = number[i];
            else if(number[i]>largest)
                largest = number[i];
        }

        System.out.println("Largest is "+largest);
        System.out.println("Smallest is "+smallest);
    }

}