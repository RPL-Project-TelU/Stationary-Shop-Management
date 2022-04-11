
package Login;
//Afif 1302204076

import java.util.Scanner;
public class LoginAdmin {
    enum State {LOGIN, ADMIN, EXIT};

  public static void main(String[] args) {
    Admin obj = new Admin();
    State state = State.LOGIN;
    String username[] = {"hikari"};
    String password[] = {"hikaru"};
    String status[] = {"siAdmin"};
    Scanner sc = new Scanner(System.in);
    int choice;
    String user_name, pass;

    //while state != EXIT  
    while(state!=State.EXIT) {
      System.out.println("1. LOGIN\n2. EXIT");
      System.out.print("Masukkan Pilihan: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch(choice) {
        case 1:
          state = State.LOGIN;
          System.out.print("Masukkan Username: ");user_name = sc.nextLine();
          System.out.print("Masukkan Password: ");pass = sc.nextLine();
          //validate
          for(int i=0;i<username.length;i++) {
            if (user_name.equals(username[i]) && pass.equals(password[i])) {
              if (status[i].equals("siAdmin")) {
                state = State.ADMIN;
                obj.Admin(username[i], password[i]);
              }
            }
          }
          //menampilkan menu exit
          System.out.print("1.Exit\npilih: ");
          choice = sc.nextInt();
          sc.nextLine();
          switch(choice) {
            case 1:
              state = State.EXIT;
              break;
          }
          break;
      }
    }
  }
    
}
