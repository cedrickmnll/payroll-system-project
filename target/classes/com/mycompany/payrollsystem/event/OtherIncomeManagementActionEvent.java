/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.payrollsystem.event;

/**
 *
 * @author Paul
 */
public interface OtherIncomeManagementActionEvent extends TableEditActionEvent {
    void onAddAndEditEmployee(int row);
}
