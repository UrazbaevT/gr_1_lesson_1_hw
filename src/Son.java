public final class Son extends Father {
    private String interestedIn;

    public Son(int age, String name, Studied studied, Job job, String interestedIn) {
        super(age, name, studied, job);
        this.interestedIn = interestedIn;
    }

    @Override
    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() + " (son)"+
                "\nUniversity: " + getStudied().getUniversity() +
                "\nFaculty of: " + getStudied().getFaculty() +
                "\nJob: " + this.getJob() +
                "\nInterested in " + interestedIn;
    }
}
