package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("--------Starting deployment of etsy app to AWS zones-----");

        String [] zonesToDeploy= zones.split(",");//Split method removed the , but still keeps its index as a separator between each item
        for(String eachZone : zonesToDeploy){
            System.out.println("Deploying [" + app + "] to " + eachZone+ "...");
        }
        System.out.println("------ all deployments complete, traffic enabled-----");
    }
}
