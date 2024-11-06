package pojo;

public class UserPojo {
  private final String email;
  private final String password;

  public UserPojo(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }
}
