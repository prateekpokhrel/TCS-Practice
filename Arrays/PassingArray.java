import java.util.*; 

public class PassingArray 
{   
    // created new function:
    public static void update(int marks[])
    {
        for(int i=0; i <marks.length; i++)
        {
            marks[i] = marks[i] + 1;
        }
    }

    // main function
    public static void main(String[] args)
    {
    int marks[] = { 98, 99, 100};
    // function update callig
    update(marks);

    // marks prnting using for loop
    for(int i =0; i < marks.length; i++)
    {
        System.out.println(marks[i]+" ");
    }
        System.out.println();

    }

}
