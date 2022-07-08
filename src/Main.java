import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = 0;
        elev student = new elev();
        System.out.println("introdu un nume: ");
        student.name = cin.nextLine();
        System.out.println("introdu o varsta: ");
        student.age = cin.nextInt();
        System.out.println("introdu 5 note");
        for(int i=0;i<student.note.length;i++){
            student.note[i] = cin.nextFloat();
            x++;
        }
        System.out.println(x);
        student.afis();
    }
}