package udb.net.mod1.di.spring;

import java.util.List;

public class Factura {
	private Integer numero;
	private Double monto;
	private List<DetalleFactura> detalleFacturaList;

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(Integer numero, Double monto) {
		super();
		this.numero = numero;
		this.monto = monto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<DetalleFactura> getDetalleFacturaList() {
		return detalleFacturaList;
	}

	public void setDetalleFacturaList(List<DetalleFactura> detalleFacturaList) {
		this.detalleFacturaList = detalleFacturaList;
	}

	public Double getMonto() {
		double valor = 0d;
		if (detalleFacturaList != null) {
			for (DetalleFactura d : detalleFacturaList) {
				valor += d.getCantidad() * d.getMontoUnitario();
				setMonto(valor);
			}
		}
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Factura(Integer numero, Double monto, List<DetalleFactura> detalleFactura) {
		super();
		this.numero = numero;
		this.monto = monto;
		this.detalleFacturaList = detalleFactura;
	}

}
