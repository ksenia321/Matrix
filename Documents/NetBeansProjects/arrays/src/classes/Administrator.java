/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Student
 */
public class Administrator extends User {
    private int permissionLevel;

    public Administrator(int permissionLevel, String login, String password) {
        super(login, password);
        this.permissionLevel = permissionLevel;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
    
}
