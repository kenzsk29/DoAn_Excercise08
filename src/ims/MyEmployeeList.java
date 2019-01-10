/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.util.*;

/**
 *
 * @author kenz2
 */
public class MyEmployeeList {

    public List<MyEmployee> listEmployee = new LinkedList<MyEmployee>();

    public void read() {
        MyEmployee epl = this.listEmployee.get(0);
        System.out.println(epl.getMaNV());
    }
}
