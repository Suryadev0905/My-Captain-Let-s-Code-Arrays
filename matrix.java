public class matrix{
public static void main(String[] args){

int m1[][] = {{1,3,4},{2,4,3},{3,4,5}};
int m2[][] = {{1,3,4},{2,4,3},{1,2,4}};

int add[][] = new int[3][3];
int multi[][] = new int[3][3];

System.out.println("Addition of Matries : ");

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){

add[i][j] = m1[i][j] + m2[i][j];
System.out.print(add[i][j]+" ");

}

System.out.println();

}

System.out.println("Multiplication of Matrices : ");

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){

multi[i][j] = 0;

for(int k=0;k<3;k++){

multi[i][j] += m1[i][k] * m2[k][j];

}

System.out.print(multi[i][j]+" ");

}

System.out.println();

}

}
}