public class subjects {
    private int id;
    private String subjectName;

    public subjects(int id, String subjectName) {
        this.id = id;
        this.subjectName = subjectName;
    }

    public int getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "subjects{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
