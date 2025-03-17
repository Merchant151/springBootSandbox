package com.merchant151.sandbox;

public class DependencyInjectionExample {
    LocationAPI location;
    public DependencyInjectionExample(LocationAPI LocationAPI){
        System.out.println("Dependency Injected");
        location = LocationAPI;
    }

    public void runAPI(){
        location.returnLocation();
    }
}
