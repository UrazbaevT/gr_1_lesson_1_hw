public class Father extends GrandFather {
    private int age;
    private String name;
    public Father(int age, String name, Studied studied, Job job) {
        this.age = age;
        this.name = name;
        super.setJob(job);
        super.setStudied(studied);
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nName: " + getName() + " (father)"+
                "\nUniversity: " + getStudied().getUniversity() +
                "\nFaculty of: " + getStudied().getFaculty() +
                "\nJob: " + this.getJob();
    }
    public void scoresSAT() {
        System.out.println("Переходной балл SAT: 1350");
    }
    public int scoresSAT(String scoresSAT){
        System.out.println("Получил: " + scoresSAT);
        return 0;
    }

}
