/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Bekhzod
 */
public class InvalidAccountTypeException extends Exception {

    public InvalidAccountTypeException() {
        super("Invalid account type selected.");
    }
    
}
