public class Main {
    public static void main(String[] args) {
        Studied studied = new Studied("Harvard", "Business and Marketing");
        Father father = new Father(49, "Ford", studied, Job.BUSINESSMAN);
        System.out.println(father.getInfo());
        father.scoresSAT();
        father.scoresSAT(String.valueOf(1440));
        System.out.println("------------------------------------");
        Studied studied1 = new Studied("Yale", "IT");
        Son son1 = new Son(24, "Alex", studied1,Job.PROGRAMMER, "football");
        System.out.println(son1.getInfo());
        son1.scoresSAT();
        son1.scoresSAT(String.valueOf(1400));
        System.out.println("------------------------------------");
        Studied studied2 = new Studied("Cambridge", "Advocacy");
        Son son2 = new Son(22, "Knox", studied2,Job.LAWYER, "UFS");
        System.out.println(son2.getInfo());
        son2.scoresSAT();
        son2.scoresSAT(String.valueOf(1380));
    }
}