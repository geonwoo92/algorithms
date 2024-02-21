package memberOOP;

public class MemberModel {
    private String identification;
    private String password;
    private String verify_password;
    private String name;
    private String social_Security_Number;
    private String phone_number;
    private String address;

    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
// 카우프 지수에서 사용하는 생성자
    public MemberModel(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

// 회원가입에서 사용하는 생성자
    public MemberModel(String identification, String password,
                       String verify_password, String name,
                       String social_Security_Number,
                       String phone_number, String address) {
        this.identification = identification;
        this.password = password;
        this.name = name;
        this.verify_password = verify_password;
        this.social_Security_Number = social_Security_Number;
        this.phone_number = phone_number;
        this.address = address;
    }
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

    @Override
    public String toString() {
        return "MemberModel{" +
                "identification='" + identification + '\'' +
                ", verify_password='" + verify_password + '\'' +
                ", name='" + name + '\'' +
                ", social_Security_Number='" + social_Security_Number + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

