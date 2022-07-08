

public class elev {
    int age;
    String name;
    float[] note = new float[5];
    float medie=0.00f;
    public void afis(){
        System.out.println("studentul "+this.name+" "+ "are "+this.age+" ani"+"\n");
        System.out.print("si notele:");
        for(int i=0;i< note.length;i++){
            System.out.print(note[i]+" ; ");
        }

        for(int i=0;i< note.length;i++){
            medie += note[i];

        }
        medie = medie / (note.length);

        System.out.println();

        System.out.println("iar media este = " + medie);
    }

}
