public class UserManager {

    public void add(int id, String firstName, String lastName, String password, String email, String[] courses,
                    String[] certification, double rating, double progressing) {

        System.out.println("Kullanıcı Eklendi: " + "Id: " + id + " isim: " + firstName + " Soyisim: " + lastName + " Email: " + email);
    }

    public void showInfos() {
        System.out.println(" Bilgiler gösterildi ");
    }

}
