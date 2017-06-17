/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.octavo.bean;

import ec.edu.octavo.entidades.clsProducto;
import ec.edu.octavo.funciones.crudProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Lis
 */
@ManagedBean
@ViewScoped
public class productobeans {

    private clsProducto newProducto;
    private clsProducto selectedProducto;
    private List<clsProducto> lista;

    public productobeans() {
        newProducto = new clsProducto();
        cargarDatos();
    }

    private void cargarDatos() {
        lista=crudProducto.findbyAll();
    }

    public clsProducto getNewProducto() {
        return newProducto;
    }

    public void setNewProducto(clsProducto newProducto) {
        this.newProducto = newProducto;
    }

    public clsProducto getSelectedProducto() {
        return selectedProducto;
    }

    public void setSelectedProducto(clsProducto selectedProducto) {
        this.selectedProducto = selectedProducto;
    }

    public List<clsProducto> getLista() {
        return lista;
    }

    public void setLista(List<clsProducto> lista) {
        this.lista = lista;
    }

}
