/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter; // Archivo Id.java
import analizadorLexico.*; import simbolos.*;
public class Id extends Expr {
    public int desplazamiento; // direccion relativa
    public Id(Palabra id, Tipo p, int b) { super(id, p); desplazamiento = b; }
}
