public class CourseManager {


    public void add(UserManager userManager, int id, String firstName, String lastName, String password, String email, String[] courses,
                    String[] certification, double rating, double progressing) {
        userManager.add(id, firstName, lastName, password, email, courses, certification, rating, progressing);
    }

    public void showInfos(UserManager userManager) {
        userManager.showInfos();
    }
}
