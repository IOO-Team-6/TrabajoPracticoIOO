package domain.clases;

import domain.auxiliares.Responsabilidadiva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proveedor {

    private Cuit cuit;
    private String nombreFantasia;
    private List<Rubros> rubro;
    private Responsabilidadiva responsabilidadIVA;
    private String razonSocial;
    private Direccion direccion;
    private Integer telefono;
    private String correoElectronico;
    private Integer ingresosBrutos;
    private Date inicioActividades;
    private CuentaCorriente cuentaCorriente;
    private List<CertificadosNoRetenciones> certificados;
    private Double deudaProveedor;
    private Double limiteDeuda;

    public Proveedor(Cuit cuit, String nombreFantasia, Enum responsabilidadIVA, String razonSocial, Direccion direccion, Integer telefono, String correoElectronico, Integer ingresosBrutos, Date inicioActividades, CuentaCorriente cuentaCorriente, Double deudaProveedor, Double limiteDeuda) {
        this.cuit = cuit;
        this.nombreFantasia = nombreFantasia;
        this.responsabilidadIVA = (Responsabilidadiva) responsabilidadIVA;
        this.rubro: new ArrayList<>();
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.ingresosBrutos = ingresosBrutos;
        this.inicioActividades = inicioActividades;
        this.cuentaCorriente = cuentaCorriente;
        this.certificados: new ArrayList<>();
        this.deudaProveedor = deudaProveedor;
        this.limiteDeuda = limiteDeuda;
    }

    public Cuit getCuit() {
        return cuit;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public List<Rubros> getRubro() {
        return rubro;
    }

    public Responsabilidadiva getResponsabilidadIVA() {
        return responsabilidadIVA;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Integer getIngresosBrutos() {
        return ingresosBrutos;
    }

    public Date getInicioActividades() {
        return inicioActividades;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public List<CertificadosNoRetenciones> getCertificados() {
        return certificados;
    }

    public Double getDeudaProveedor() {
        return deudaProveedor;
    }

    public Double getLimiteDeuda() {
        return limiteDeuda;
    }
}
