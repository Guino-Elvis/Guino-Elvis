package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    //IdVenta	DniCliente	fechaVenta	netoTotal	igv	precioTotal
    public String idVenta, dniCliente, fechaVenta;
    public double netoTotal, igv, precioTotal;
}
