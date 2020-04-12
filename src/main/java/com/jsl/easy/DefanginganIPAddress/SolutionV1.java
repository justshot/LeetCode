package com.jsl.easy.DefanginganIPAddress;

public class SolutionV1 {
    public String defangIPaddr(String ipAddr) {
        return ipAddr.replace(".", "[.]");
    }
}
