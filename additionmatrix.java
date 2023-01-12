class B
{
public static void main(String args[])
{
int m1[][]={{5,4,3},{6,1,3},{4,3,1}};
int m2[][]={{1,2,3},{2,5,1},{2,1,0}};
int Sum[][]=new int[3][3];
int i,j;
System.out.println("Element of first Matrix");
for (i=0;i<3;i++)
{
 for(j=0;j<3;j++)
{
System.out.println(m1[i][j]+" ");
}
System.out.println();
}
System.out.println("Element of secound Matrix");
for (i=0;i<3;i++)
{
 for(j=0;j<3;j++)
{
System.out.println(m2[i][j]+" ");
}
System.out.println();
}
System.out.println("Addition of two Matrix");
for (i=0;i<3;i++)
{
 for(j=0;j<3;j++)
{
System.out.println(Sum[i][j]+" ");
}
System.out.println();
}
}
}



