/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.octavo.bean;

import ec.edu.octavo.entidades.clsFactura;
import ec.edu.octavo.funciones.crudFactura;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lis
 */
@ManagedBean
@ViewScoped
public class facturabeans {

    private clsFactura newFactura;
    private clsFactura selectedFactura;
    private List<clsFactura> lista;
    
    public facturabeans() {
        newFactura= new clsFactura();
        cargarDatos();
    }
    
    private void cargarDatos() {
        lista=crudFactura.findbyAll();
    }
    
    public clsFactura getNewFactura() {
        return newFactura;
    }

    public void setNewFactura(clsFactura newFactura) {
        this.newFactura = newFactura;
    }

    public clsFactura getSelectedFactura() {
        return selectedFactura;
    }

    public void setSelectedFactura(clsFactura selectedFactura) {
        this.selectedFactura = selectedFactura;
    }

    public List<clsFactura> getLista() {
        return lista;
    }

    public void setLista(List<clsFactura> lista) {
        this.lista = lista;
    }
    
}
