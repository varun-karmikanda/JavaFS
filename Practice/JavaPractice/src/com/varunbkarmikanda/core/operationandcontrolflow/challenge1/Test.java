package com.varunbkarmikanda.core.operationandcontrolflow.challenge1;

public class Test {
    public static void main(String[] args) {
        PermissionManager permission = new PermissionManager();

        int myPermission = 0;

        myPermission = permission.grantPermission(myPermission, Permissions.READ);
        System.out.println("My Permission: "+myPermission);

        myPermission = permission.grantPermission(myPermission, Permissions.WRITE);
        System.out.println("My Permission: "+myPermission);

        boolean hasPermission = false;

        hasPermission = permission.hasPermission(myPermission, Permissions.WRITE);
        System.out.println("Has Permission: "+hasPermission);

        hasPermission = permission.hasPermission(myPermission, Permissions.DELETE);
        System.out.println("Has Permission: "+hasPermission);

        hasPermission = permission.hasPermission(myPermission, Permissions.EXECUTE);
        System.out.println("Has Permission: "+hasPermission);

        permission.printBits(myPermission);


    }
}
