package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
 //IdVEntaDetalle	IdVenta	IdProducto	precioUnit	porcentUtil	cantidad	precioTotal
   public String idVentaDetalle, idVenta, idProducto;
   public double precioUnit, porcentUtil, cantidad, precioTotal;
}
