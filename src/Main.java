public class Main {


    public static void main(String[] args) {

//		Instructor instructor = new Instructor(1, "Engin", "Demiroð", "12345", "engindemirog@gmail.com",
//				new String[] {"Java","C#"} ,new String[]  {"MCT","PMP","ITIL"}, 95);


//		Instructor instructor = new Instructor();
//
//		instructor.setId(1);
//		instructor.setFirstName("Engin");
//		instructor.setLastName("Demirog");
//		instructor.setPassword("12345");
//		instructor.setEmail("engindemirog@gmail.com");
//		instructor.setCourses( new String[] {"Java","C#"});
//		instructor.setCertification(new String[] {"MCT","PMP","ITIL"});
//		instructor.setRating(95);
//
//		System.out.println(instructor.getEmail());
//		for(String course:instructor.getCourses()) {
//			System.out.println(course);
//		}


        CourseManager courseManager = new CourseManager();

        courseManager.add(new StudentManager(), 1, "M.Kerim ", " Solmaz ", "123456789",
                "tosmubagı@gmail.com",
                new String[]{"Java ", " C#"}, new String[]{" MCT", " PMP", " ITIL"}, 95, 60);

        courseManager.showInfos(new InstructorManager());


    }

}

