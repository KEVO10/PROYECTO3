/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.octavo.bean;

import ec.edu.octavo.entidades.clsCliente;
import ec.edu.octavo.funciones.crudCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lis
 */
@ManagedBean
@ViewScoped
public class clientebeans {

    private clsCliente newCliente;
    private clsCliente selectedCliente;
    private List<clsCliente> lista;
    
    public clientebeans() {
        newCliente = new clsCliente();
        cargarDatos();
    }
    
    private void cargarDatos() {
        lista=crudCliente.findbyAll();
    }
    public clsCliente getNewCliente() {
        return newCliente;
    }

    public void setNewCliente(clsCliente newCliente) {
        this.newCliente = newCliente;
    }

    public clsCliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(clsCliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public List<clsCliente> getLista() {
        return lista;
    }

    public void setLista(List<clsCliente> lista) {
        this.lista = lista;
    }
    
}
