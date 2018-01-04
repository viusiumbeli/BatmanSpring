package batman;

public class UserParams {
    private String login;
    private String passwordHash;
    private String hashCode;

    public UserParams() {
    }

    public UserParams(String login, String passwordHash, String hashCode) {
        this.login = login;
        this.passwordHash = passwordHash;
        this.hashCode = hashCode;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getHashCode() {
        return hashCode;
    }
}
