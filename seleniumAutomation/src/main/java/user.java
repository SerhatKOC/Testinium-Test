public class user
{
    private String mail;
    private String passwd;

    public user(String mail,String passwd)
    {
        this.mail   = mail;
        this.passwd = passwd;
    }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public String getPasswd() { return  passwd; }
    public void setPasswd(String passwd) { this.passwd = passwd; }
}
