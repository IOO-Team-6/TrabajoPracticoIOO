package domain.clases;

import domain.clases.Proveedor;

import java.util.Date;

public class CertificadosNoRetenciones {

    private Impuesto impuesto;
    private Proveedor proveedor;
    private Date fechaDesde;
    private Date fechaHasta;

    public CertificadosNoRetenciones(Impuesto impuesto, Proveedor proveedor, Date fechaDesde, Date fechaHasta) {
        this.impuesto = impuesto;
        this.proveedor = proveedor;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }
}
