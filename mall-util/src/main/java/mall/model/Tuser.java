package mall.model;

import lombok.Data;

import javax.naming.ldap.PagedResultsControl;

@Data
public class Tuser {
    private String id;
    private String username;
    private String useremail;
    private String userpassword;
    private String userlogo;
    private Integer isvip;
    private String usercity;
    private String usermoney;
    private String userstatus;
    private String shopcarid;
    private Integer shopcount;
}
