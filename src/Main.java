public class Main {


    public static void main(String[] args) {



        CourseManager courseManager = new CourseManager();

        courseManager.add(new StudentManager(), 1, "Kerim ", " BABA ", "123456789",
                "balmubagı@gmail.com",
                new String[]{"Java ", " C#"}, new String[]{" MCT", " PMP", " ITIL"}, 95, 60);

        courseManager.showInfos(new InstructorManager());


    }

}

