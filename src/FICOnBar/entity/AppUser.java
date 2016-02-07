package FICOnBar.entity;
// Generated 08-ene-2016 0:23:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AppUser generated by hbm2java
 */
public class AppUser  implements java.io.Serializable {


     private Integer userId;
     private String name;
     private String password;
     private Set appLogs = new HashSet(0);

    public AppUser() {
    }

	
    public AppUser(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public AppUser(String name, String password, Set appLogs) {
       this.name = name;
       this.password = password;
       this.appLogs = appLogs;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getAppLogs() {
        return this.appLogs;
    }
    
    public void setAppLogs(Set appLogs) {
        this.appLogs = appLogs;
    }




}


