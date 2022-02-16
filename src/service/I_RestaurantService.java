/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.restaurant;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author boura
 */
public interface I_RestaurantService<T> {
    
        void ajouter(T entity) throws SQLException;;
        void modifier (long id,T entity)throws SQLException;
        void supprimer (long id) throws SQLException;
        List<T> afficher();
        
}
