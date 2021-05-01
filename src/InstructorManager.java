public class InstructorManager extends UserManager {

    public void uploadCourse() {
        System.out.println("Ders Yüklendi ");
    }

    //Override
    public void add(int id, String firstName, String lastName, String password, String email, String[] courses,
                    String[] certification, double rating, double progressing) {
        Instructor instructor = new Instructor();
        instructor.setId(id);
        instructor.setFirstName(firstName);
        instructor.setLastName(lastName);
        instructor.setPassword(password);
        instructor.setEmail(email);
        instructor.setCourses(courses);
        instructor.setRating(rating);

        System.out.println("Instructor: " + "Id: " + instructor.getId() + " isim: " + instructor.getFirstName() +
                " Soyisim: " + instructor.getLastName() + " Email: " + instructor.getEmail());
    }

    public void showInfos() {
        System.out.println("Instructor Bilgiler gösterildi");
    }
}
