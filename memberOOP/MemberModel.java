package memberOOP;

public class MemberModel {
    private String identification;
    private String password;
    private String verify_password;
    private String name;
    private String social_Security_Number;
    private String phone_number;
    private String address;

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setSocial_Security_Number(String social_Security_Number) {
        this.social_Security_Number = social_Security_Number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPassword() {
        return password;
    }
    public String getVerify_password() {
        return verify_password;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSocial_Security_Number() {
        return social_Security_Number;
    }

    public String getAddress() {
        return address;
    }
}
